package com.practice.nidhi.AutomationTesting.myhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebT {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
        driver.manage().window().maximize();
        double a = Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"topGainers\"]/tbody/tr[2]/td[7]")).getText());
        if (a <= 710) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }


}
