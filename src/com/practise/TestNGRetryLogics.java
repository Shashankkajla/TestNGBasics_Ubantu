package com.practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryLogics {

	@Test//(retryAnalyzer=com.analyzer.RetryAnalyzer.class)// retryAnalyzer --> Coming from TestNG class
	public void testLogic()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void testLogic1()
	{
		Assert.assertEquals(true, false);
	}
	
	
	
}
