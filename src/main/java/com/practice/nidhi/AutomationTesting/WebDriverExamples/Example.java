package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

    public static void main(String[] args) {
        //Step X: If you ARE NOT ABLE TO PUT PATH

        // SystemsetProperty("webdriver.gecko.driver","C:\\Users\\pande\\Desktop\\web driver\\webdriver jar\\geckodriver.exe");

        // Step 1 : Download the Geco Driver
        // https://github.com/mozilla/geckodriver/releases/tag/v0.24.0

        // Step 2 : Extraact and Put the Driver on Local Disk C:\Users\pande\Desktop\web driver\webdriver jar\geckodriver.exe

        // Step 3 : Put the path of the Exe ( C:\Users\pande\Desktop\web driver\webdriver jar\) Path ( System Settings --> Path )

        WebDriver driver = new FirefoxDriver();
        driver.get("http://rediff.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();


    }

}
