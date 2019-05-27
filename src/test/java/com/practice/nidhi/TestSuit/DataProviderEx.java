package com.practice.nidhi.TestSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.DataProvider;

public class DataProviderEx {
	public WebDriver driver;
	
	
	
	@DataProvider(name="TestData1")
	public Object [][] data() {
	Object[][] Obj = new Object[2][2];
	Obj[0][0]= "nidhi1";
	Obj[0][1]= "sankalp";
	Obj[1][0]="nidhi2";
	Obj[1][1]="sankalp1";
	return Obj;
	
	
	}

	@Test (dataProvider = "TestData1")
	public void f(String a, String b) {
		driver.findElement(By.id("email")).sendKeys(a);
		SoftAssert s = new SoftAssert();
		boolean ajjjj = driver.findElement(By.id("pass")).isDisplayed();
		s.assertEquals(ajjjj, true);
		boolean bhh = driver.findElement(By.id("pass")).isEnabled();
		driver.findElement(By.id("pass")).sendKeys(b);
		s.assertEquals(bhh , true);
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
