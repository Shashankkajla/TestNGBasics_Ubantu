package com.practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DemoTest {

/*TestNg having 3 Parts -->
 * Pre-requisties : starting with Before
 * @BeforeSuite : The annotated method will be run before all tests in this suite 
 * @BeforeTest  : The annotated method will be run before any test method belonging to the classes inside the tag is run.
 * @BeforeClass : The annotated method will be run before the first test method in the current class is invoked.
 * @BeforeMethod : method executes for each test case but before executing the test case.
 * 
 * TestCases :
 * @Test : The annotated method is a part of a test case
 * 
 * Post-requisties : starting with After
 * @AfterMethod : The annotated method will be run after each test method.
 * @AfterClass : Once all the Tc's are done than @AfterClass would be executed
 * @AfterTest  : The annotated method will be run after all the test methods belonging to the classes 
 * inside the tag have run.
 * @AfterSuite : The annotated method will be run after all tests in this suite have run.
 * 
 * 
 * All these Methods @BeforeSuite,@BeforeTest, @BeforeClass, @AfterClass, @AfterTest, @After Suite executes only once
 * 
 * pair will be created b/w @BeforeMethod & @AfterMethod
 * -----------------
 * @BeforeMethod    |
 * @Test1           |
 * @AfterMethod     |
 * @BeforeMethod    |
 * @Test2           |
 * @AfterMethod     |
 * -----------------
 * */	
	
	
// Pre-requisties : starting with Before

@BeforeSuite  //1
public void setUp()
{
	System.out.println("@BeforeSuite---> Setup System Property for Browser");
}

@BeforeTest  //2
public void Test()
{
	System.out.println("@BeforeTest----> Launch Browser");
	}

@BeforeClass //3
public void login()
{
  System.out.println("@BeforeClass----> Login in application");	
}
@BeforeMethod //4
public void url()
{
	System.out.println("@BeforeMethod---> Enter url");
}

// TestCases //5
@Test(priority=1)
public void googleTitleTest(){
	System.out.println("@Test1--> Google Title Test is");
}

@Test(priority=3)
public void search(){
	System.out.println("@Test2---> Seasrch to the Page");
}


@Test(priority=2)
public void logo()
{
	System.out.println("@Test3 ---> Search for the Logo");
}

// Post-requisties : starting with After

@AfterMethod //6
public void logout()
{
	System.out.println("@AfterMethod---> logout from app");
}

// Once all the Tc's are done than @AfterClass would be executed
@AfterClass  //7
public void closeBrowser()
{
System.out.println("@AfterClass--> Close the Browser");	
}

@AfterTest // 8
public void deleteAllcookies()
{
 System.out.println("@ASfterTest---> Delete all cookies");	
}

@AfterSuite //9
public void generateReport()
{
	System.out.println("@AfterSuite---> Repote Generated");
	}

}
