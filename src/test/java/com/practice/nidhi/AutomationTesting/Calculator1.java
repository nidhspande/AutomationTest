package com.practice.nidhi.AutomationTesting;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator1 {

    // Class Level Variable
    public static WebDriver driver = new FirefoxDriver();

    public static void main(String[] args) {

    }

    @BeforeClass
    public static void a1() {

        driver.get("http://calculatoria.com");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void a7() {

        driver.close();
    }

    @After
    public void clickAC() {
        // Click on AC
        driver.findElement(By.id("btn27")).click();
    }

    @Test
    public void a9() {
        // 1
        driver.findElement(By.id("btn97")).click();
        // +
        driver.findElement(By.id("btn107")).click();
        // 3
        driver.findElement(By.id("btn99")).click();
        // =
        driver.findElement(By.id("btn13")).click();

        int value = Integer.parseInt(driver.findElement(By.name("exprdisplay")).getAttribute("value"));
        Assert.assertEquals(4, value);

    }

    @Test
    public void a2() {

        driver.get("http://calculatoria.com");
        driver.manage().window().maximize();

        // 8
        driver.findElement(By.id("btn104")).click();
        // +
        driver.findElement(By.id("btn107")).click();
        // 9
        driver.findElement(By.id("btn105")).click();
        // =
        driver.findElement(By.id("btn13")).click();

        int value = Integer.parseInt(driver.findElement(By.name("exprdisplay")).getAttribute("value"));
        Assert.assertEquals((8 + 9), value);

    }

    @Test
    public void a3() {

        driver.get("http://calculatoria.com");
        driver.manage().window().maximize();

        // 8
        driver.findElement(By.id("btn104")).click();
        // +
        driver.findElement(By.id("btn107")).click();
        // 9
        driver.findElement(By.id("btn105")).click();
        // =
        driver.findElement(By.id("btn13")).click();

        Assert.assertEquals("17", driver.findElement(By.name("exprdisplay")).getAttribute("value"));

    }
}
