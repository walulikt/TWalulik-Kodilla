package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite    {
    private static final String BASE_URL="http://127.0.0.1:8181/tasks_frontend/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException{
        final String XPATH_TASK_NAME = "//input[contains(@name,\"title\")]";
        final String XPATH_TASK_CONTENT ="//textarea[contains(@name,\"content\")]";
        final String XPATH_TASK_BUTTON = "//button[contains(@class,\"button\")]";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_TASK_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello (String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]"))
                            .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\"]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello (String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("WalulikT");
        driverTrello.findElement(By.id("password")).sendKeys("Jasnadroga1");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Board\"]")).size()>0)
                .forEach(aHref-> aHref.click());

        Thread.sleep( 2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains("MyWebApplicationTest"))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private boolean testCleaning (String taskName) throws InterruptedException{
        final String XPATH_TASK_ROW = "//form[contains(@class=\"table_row\")]";
        final String XPATH_TASK_BYNAME = "//p[contains(@data_task-name-paragraph,\"" +taskName+"\")]";

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> theForm.findElement(By.xpath(".//button(@data-task-delete-button=\"Delete\")"))
                        .click());

        /*driver.findElements(By.xpath(XPATH_TASK_ROW)).stream()
                .filter(taskRow -> taskRow.findElements(By.xpath(XPATH_TASK_BYNAME)).size()>0)
                .forEach(theTask -> theTask.findElement(By.xpath(".//button(@data-task-delete-button=\"Delete\")"))
                        .click());*/

        driver.navigate().refresh();
        boolean result = (driver.findElements(By.xpath(XPATH_TASK_BYNAME)).size()==0);

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException{
       String taskName = createCrudAppTestTask();
       sendTestTaskToTrello(taskName);
       assertTrue(checkTaskExistsInTrello(taskName));
        assertTrue(testCleaning("test3"));
    }
}
