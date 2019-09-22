package com.newTour.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newTour.qa.Base.TestBase;
import com.newTour.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	public LoginPageTest(){
		
		super();
	}
	
	@BeforeMethod
	
	public void setUp(){
		
		initialization();
		 loginpage = new LoginPage();
	}
	
	@Test
	
	public void loginTest(){
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	
/*	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	*/

}
