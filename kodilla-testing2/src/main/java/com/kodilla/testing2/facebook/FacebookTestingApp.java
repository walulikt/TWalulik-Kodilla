package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_WAIT_FOR_DAY ="//select[contains (@name,\"day\")]";
    public static final String XPATH_WAIT_FOR_MONTH="//select[contains (@name,\"month\")]";
    public static final String XPATH_WAIT_FOR_YEAR="//select[contains (@name,\"year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(3);

        selectCombo = driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByIndex(9);

        selectCombo = driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR));
        Select selectYear = new Select(selectCombo);
        selectYear.selectByValue("1980");

    }
}
