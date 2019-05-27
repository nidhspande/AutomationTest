package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("nidhi");
        boolean a = driver.findElement(By.id("Pass")).isDisplayed();
        if (a == true) ;
        System.out.println("Pass");

        System.out.println("Fail");
        boolean b = driver.findElement(By.id("Pass")).isEnabled();
        if (b == true) ;
        System.out.println("Pass");

        System.out.println("Fail");


    }
}
