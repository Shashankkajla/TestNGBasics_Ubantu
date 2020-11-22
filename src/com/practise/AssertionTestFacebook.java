package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTestFacebook {
     
	static WebDriver driver;
	
	@BeforeMethod
	public static void setUpTest()
	{
		System.setProperty(SuiteData.keyVal, SuiteData.propVal);	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(SuiteData.url1);
		}
	
	@Test(priority=1, groups="UICheck")
	public static void titleTestFB()
	{
		String title_fb = driver.getTitle();
		System.out.println(title_fb);
		Assert.assertEquals("Facebook – log in or sign up", title_fb, "Failed if tilte doesn't match");
	    // Actual Accepted, Pass String
	}
	// Assertion are used for validation in TestNg, Assert is a class 
	
	@Test(priority=2, groups="UICheck")
	public static void logoFbTest()
	{
		boolean b = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		Assert.assertTrue(b); // if b is true it will pass either failed
	}
	@Test(priority=3, groups="Hello")
	public static void loginFb()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("stevelogan1657@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("build");
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	}
	@Test(priority=4, groups="Hello")//dependsOnMethods="loginFb")
	public static void Homelogintitle()
	{
		String afterlogin_title = driver.getTitle();
		Assert.assertEquals("fghdfh", afterlogin_title);
	}
	
	@AfterMethod
	public static void tearDownTest()
	{
		driver.quit();
	}
	
	
//dependsOnMethods --> If loginPage test Failed than afterlogintitle would not consider it would ignore
// If loginPage test Pass than only afterlogintitle title Consider	
	
}
