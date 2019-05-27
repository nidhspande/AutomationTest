package com.practice.nidhi.AutomationTesting;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit_app {

//	public static void main(String[] args) {
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://facebook.com");
//		driver.manage().window().maximize();
//
////		driver.findElement(By.id("email")).sendKeys("nidhi");
////		driver.findElement(By.id("pass")).sendKeys("sankalp");
//
//		boolean a = driver.findElement(By.id("email")).isDisplayed();
//		boolean b = driver.findElement(By.id("pass")).isDisplayed();
//
//	}

    @Test
    public void Test1() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();

//		driver.findElement(By.id("email")).sendKeys("nidhi");
//		driver.findElement(By.id("pass")).sendKeys("sankalp");

        Assert.assertEquals(true, driver.findElement(By.id("email")).isDisplayed());
        // Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());

        Assert.assertEquals(true, driver.findElement(By.id("pass")).isDisplayed());

    }

}
