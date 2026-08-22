package com.datasyncinc.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationStaffPageClass {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(@href,'staff-registration.html')]")
	WebElement registernewstaffLink;
	
	@FindBy(xpath = "//h4[@class='page-title']")
	WebElement pageTitle;
	
	@FindBy(xpath = "//input[@id='full_name']")
	WebElement fullNameInput;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@id='temp_password']")
	WebElement tempPasswordInput;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameInput;
	
	@FindBy(xpath = "//select[@id='role']")
	WebElement roleSelect;
	
	@FindBy(xpath = "//input[@id='confirm_password']")
	WebElement confirmPasswordInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	// constructor
	// pagefactory will initialize the elements of this page class
	// set the value of the driver in the constructor of the page class
	
	public RegistrationStaffPageClass(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	public void clickRegisterNewStaffLink(){
		registernewstaffLink.click();
	}
	
	public String getPageTitle() {
		return pageTitle.getText();
	}
	
	public void enterFullName(String fullName) {
		fullNameInput.sendKeys(fullName);
	}
	
	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void enterTempPassword(String tempPassword) {
		tempPasswordInput.sendKeys(tempPassword);
	}
	
	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	//select role from dropdown we will do it later
	
	public void selectRole(String role) {
		Select sc = new Select(roleSelect);  // when you create object of select class you need to pass the webelement of the dropdown
		sc.selectByVisibleText(role);
	}
	

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
	



}
