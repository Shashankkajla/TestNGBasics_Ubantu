package com.analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	  int count=0; // start from 0
	  int retryLimit= 3; // till 3 times failure Tc's will executes 
	  // Its for @TestLevels
	  
	@Override
	public boolean retry(ITestResult result) {
   
		if(count<retryLimit){
			
			count++;
			return true;	
		}
	
		return false;
	}

}
