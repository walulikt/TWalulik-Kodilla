package com.kodilla.testing2.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

public class FirefoxTestingApi {

    public static WebDriver getDriver (){
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        return new FirefoxDriver();
    }

    public static void main (String [] args) throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://www.google.pl/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        element.sendKeys("garnki");
        element.submit();
        element = driver.findElement(By.xpath("//center/input[1]"));
        element.click();

        WebElement searchResults = driver.findElement(By.xpath("//div[@class=\"ad_cclk\"]"));
        searchResults.click();

        driver.navigate().to("https://www.kodilla.pl");
        driver.findElement(By.partialLinkText("Kodi")).click();

        String title = driver.getTitle();
        System.out.println("title " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url " + url);
        String source = driver.getPageSource();
        int sourceLength = source.length();
        System.out.println("source lenght: " + sourceLength);
        String handle = driver.getWindowHandle();
        System.out.println("handle: " + handle);
        Thread.sleep(4000);
        driver.close();

    }
}
