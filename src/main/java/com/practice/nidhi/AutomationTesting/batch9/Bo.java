package com.practice.nidhi.AutomationTesting.batch9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Bo {
    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", false);
        WebDriver driver = new FirefoxDriver(options);


        driver.get("https://www.bharatmatrimony.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("REGISTERED_BY")).sendKeys("friend");
        driver.findElement(By.id("NAME")).sendKeys("golgapa");
        driver.findElement(By.id("DOBDAY")).sendKeys("25");
        // driver.findElement(By.id("NAME")).clear();


    }
}
