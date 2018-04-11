package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHELEMENT = "_nkw";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com");

        WebElement searchElement = driver.findElement(By.name(SEARCHELEMENT));
        searchElement.sendKeys("laptop");
        searchElement.submit();

    }
}
