package com.practice.nidhi.AutomationTesting.myhome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://naukri.com");
        driver.manage().window().maximize();

        /*
         * Actions a=new Actions(driver); WebElement
         * jobs=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a/div"));
         * a.moveToElement(jobs).build().perform(); driver.findElement(By.xpath(
         * "/html/body/div[2]/div/ul/li[1]/div/ul[1]/li[4]/a")).click();
         */
        Actions a = new Actions(driver);
        a.sendKeys(Keys.F5).build().perform();


    }

}
