package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.name("proceed")).click();
        Alert a = driver.switchTo().alert();


    }

}
