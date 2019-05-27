package com.practice.nidhi.AutomationTesting.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://money.rediff.com/sectors/bse/bankex");
        driver.manage().window().maximize();
        Double a = Double.parseDouble((driver
                .findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[10]/td[4]")).getText()));

        if (a > 150) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}
