package com.practise;

import org.testng.annotations.Test;

public class ExpectedExceptionFeature {

	@Test(expectedExceptions=NumberFormatException.class) // pass if you used exception
	public void test()
	{
		String x="100A";
		Integer.parseInt(x);
	}
	// Sometimes you know the exception which we know , So for that dont terminate it testCase or 
	// don't Fail it.
	
}
