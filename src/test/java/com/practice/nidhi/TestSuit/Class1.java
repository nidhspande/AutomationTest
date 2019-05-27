package com.practice.nidhi.TestSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class1 {
	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.id("email")).sendKeys("nidhi");
		SoftAssert s = new SoftAssert();
		boolean a = driver.findElement(By.id("pass")).isDisplayed();
		s.assertEquals(a, true);
		boolean b = driver.findElement(By.id("pass")).isEnabled();
		s.assertEquals(b, false);
		System.out.println(driver.getTitle());
		s.assertAll();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {

		driver.close();

	}

}
