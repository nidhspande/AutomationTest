package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        // Applying Implicitwait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait ww = new WebDriverWait(driver, 30);
        driver.findElement(By.xpath("//*[@id=\"email\"]"));
        driver.findElement(By.id("email")).sendKeys("nidhi");
        Thread.sleep(30000);
        driver.findElement(By.id("pass")).sendKeys("sankalp");

    }

}
