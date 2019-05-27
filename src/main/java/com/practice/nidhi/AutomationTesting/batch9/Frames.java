package com.practice.nidhi.AutomationTesting.batch9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://docs.oracle.com/javase/7/docs/api/");
        driver.manage().window().maximize();
        WebElement f1 = driver.findElement(By.name("packageFrame"));
        driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div/ul/li[13]/a")).click();

    }

}
