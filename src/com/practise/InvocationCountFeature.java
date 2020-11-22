package com.practise;

import org.testng.annotations.Test;

public class InvocationCountFeature {

	
@Test(invocationCount = 10)
public void sum()
{
  int a=10;
  int b=20;
  System.out.println(a+b);
}
// I want to execute same test case 10 times, So no need to write same test case again & again
// So no need to write tc's again & again use invocationCount 

}
