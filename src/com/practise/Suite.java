package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Suite {
   
static WebDriver driver;

@BeforeMethod
public static void setUp()
{
	
	System.setProperty(SuiteData.keyVal, SuiteData.propVal);	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(SuiteData.url);

}
	
@Test(priority=1, groups="Validation") // Don't give return Method enabled=false
// You can see the group vise report also, i have 100 tc's lets 10 tcs are for Search page,
// 10 tcs for home  page & 10 related to login page, So define in groups, you can see the group wise report.
public static void imgDispTest()
{
    boolean b = driver.findElement(By.xpath(SuiteData.imgLocator)).isDisplayed();
    Assert.assertTrue(b);
}

@Test(priority=2, groups="Validation")
public static void titleTest()
{
  String titleIs = driver.getTitle();
  System.out.println(titleIs);
  Assert.assertEquals("CRMPRO  CRM software for customer relationship management, sales, and support.", titleIs);
}

@Test(priority=3, groups="Validation")
public static void loginTest()
{
   driver.findElement(By.name(SuiteData.un)).sendKeys(SuiteData.unkey);
   driver.findElement(By.name(SuiteData.pw)).sendKeys(SuiteData.pwKey);
   driver.findElement(By.xpath(SuiteData.lognBtn)).click();

}

@AfterMethod
public static void tearDown()
{
  driver.quit();	
}
		
  }
	
	
	

