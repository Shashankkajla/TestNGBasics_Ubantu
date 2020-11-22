package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTimeOutFeature {

static WebDriver driver;

@Test(invocationTimeOut=1000)// if google will not launch within 2sec. than test case marked as Failed, 
// internally it give ThreadtimeOut Exception
public static void tryThis()
{
	System.setProperty(SuiteData.keyVal, SuiteData.propVal);	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(SuiteData.url);
	
	}
	


}
