package com.newTour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newTour.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory:
	
	@FindBy(xpath ="//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='login']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//a[contains(text(),'PROFILE')]")
	WebElement profileLink;
	
	@FindBy(xpath= "")
	WebElement mercuryTourLogo;
	
	//initialize page elements with page factory:
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
		
	}
		public boolean mercuryTourLogo(){
			return mercuryTourLogo.isDisplayed();
	}
		
	public FlightsPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new FlightsPage();
	}

}
