package com.practice.nidhi.AutomationTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class FormTest {


    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://form.jotform.me/91091462576461");
        driver.findElement(By.id("first_5")).click();
        driver.findElement(By.id("first_5")).clear();
        driver.findElement(By.id("first_5")).sendKeys("nidhi");
        driver.findElement(By.id("last_5")).clear();
        driver.findElement(By.id("last_5")).sendKeys("sharma");
        new Select(driver.findElement(By.id("input_65_month"))).selectByVisibleText("October");
        new Select(driver.findElement(By.id("input_65_day"))).selectByVisibleText("9");
        new Select(driver.findElement(By.id("input_65_year"))).selectByVisibleText("1999");
        new Select(driver.findElement(By.id("input_65_year"))).selectByVisibleText("1989");
        new Select(driver.findElement(By.id("input_65_year"))).selectByVisibleText("1984");
        driver.findElement(By.id("input_67")).click();
        driver.findElement(By.id("input_67")).clear();
        driver.findElement(By.id("input_67")).sendKeys("7");
        driver.findElement(By.id("input_66_1")).click();
        driver.findElement(By.id("input_3_addr_line1")).click();
        driver.findElement(By.id("input_3_addr_line1")).clear();
        driver.findElement(By.id("input_3_addr_line1")).sendKeys("1014");
        driver.findElement(By.id("input_3_addr_line2")).clear();
        driver.findElement(By.id("input_3_addr_line2")).sendKeys("haryana");
        driver.findElement(By.id("input_3_city")).clear();
        driver.findElement(By.id("input_3_city")).sendKeys("yamunanagar");
        driver.findElement(By.id("input_3_state")).clear();
        driver.findElement(By.id("input_3_state")).sendKeys("101456");
        driver.findElement(By.id("input_3_postal")).click();
        driver.findElement(By.id("input_3_postal")).clear();
        driver.findElement(By.id("input_3_postal")).sendKeys("12345");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='City'])[1]/following::span[1]")).click();
        driver.findElement(By.id("input_3_state")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=input_3_state | ]]
        driver.findElement(By.id("input_3_state")).clear();
        driver.findElement(By.id("input_3_state")).sendKeys("haryana");
        driver.findElement(By.id("input_3_country")).click();
        new Select(driver.findElement(By.id("input_3_country"))).selectByVisibleText("American Samoa");
        driver.findElement(By.id("input_3_country")).click();
        driver.findElement(By.id("first_13")).click();
        driver.findElement(By.id("first_13")).clear();
        driver.findElement(By.id("first_13")).sendKeys("love");
        driver.findElement(By.id("last_13")).clear();
        driver.findElement(By.id("last_13")).sendKeys("jaan");
        driver.findElement(By.id("input_14_area")).clear();
        driver.findElement(By.id("input_14_area")).sendKeys("12");
        driver.findElement(By.id("input_14_phone")).clear();
        driver.findElement(By.id("input_14_phone")).sendKeys("1234567890");
        driver.findElement(By.id("input_14_phone")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("input_14_phone")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("input_14_phone")).clear();
        driver.findElement(By.id("input_14_phone")).sendKeys("1234567890");
        driver.findElement(By.id("input_16")).click();
        driver.findElement(By.id("input_16")).clear();
        driver.findElement(By.id("input_16")).sendKeys("test@test.com");
        driver.findElement(By.id("first_18")).click();
        driver.findElement(By.id("first_18")).clear();
        driver.findElement(By.id("first_18")).sendKeys("abcg");
        driver.findElement(By.id("last_18")).clear();
        driver.findElement(By.id("last_18")).sendKeys("ndihiajdi");
        new Select(driver.findElement(By.id("input_19"))).selectByVisibleText("Mother");
        driver.findElement(By.id("input_20_area")).clear();
        driver.findElement(By.id("input_20_area")).sendKeys("123");
        driver.findElement(By.id("input_20_phone")).clear();
        driver.findElement(By.id("input_20_phone")).sendKeys("456789");
        driver.findElement(By.id("input_22")).clear();
        driver.findElement(By.id("input_22")).sendKeys("hgjsfgjhsigfihgifeh");
        driver.findElement(By.id("input_23")).clear();
        driver.findElement(By.id("input_23")).sendKeys("nkfhdihfiher");
        driver.findElement(By.linkText("4.12")).click();
        driver.findElement(By.id("input_2")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
