package com.practice.nidhi.AutomationTesting.batch9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Screenshots {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://guru99.com");
        driver.manage().window().maximize();
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("D:\\Users\\pande\\Downloads\\test2.png"));
        driver.close();

    }

}
