package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {
    public static void main(String[] args) {
        //	FirefoxOptions options = new FirefoxOptions();
        //options.setCapability("marionette", false);
        //WebDriver driver = new FirefoxDriver(options);


        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.naukri.com");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement companies = driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a/div"));
        a.moveToElement(companies).build().perform();


    }

}
