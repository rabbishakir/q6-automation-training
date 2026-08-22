package com.datasyncinc.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	
	WebDriver diver;  // declared it
	
	// page factory
	
	

	
	@FindBy(xpath = "//input[@id='email' and @type='email']")
	WebElement emailAddressField;
	
	@FindBy(xpath = "//input[@id='password' and @type='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@id='btn-login']")
	WebElement signInButton;
	
	

	// constructor
	public LoginPageClass(WebDriver driver) {
		this.diver = driver;
		PageFactory.initElements(driver, this);  // page 
		
	}
	

	
	// enter email address
	public void enterEmailAddress(String email) {
		
		emailAddressField.clear();
		emailAddressField.sendKeys(email);
		
	}
	
	// enter password
	public void enterPassword(String password) {
		
		passwordField.clear();
		passwordField.sendKeys(password);
		
	}
	
	
	// click sign in button
	
	public void clickSignInButton() {
		
		signInButton.click();
		
	}
	
	

	
	

	
	
	

}
