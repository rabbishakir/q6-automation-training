package com.datasyncinc.framework.stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.datasyncinc.framework.pageobjects.LoginPageClass;
import com.datasyncinc.framework.utilities.ConfigReader;
import com.dtasyncinc.framework.helper.BaseClass;

import io.cucumber.java.en.*;

public class StepDefination {
	
	WebDriver driver;
	LoginPageClass loginpage;
	
	
	
	@Given("user is on the HMS login page")
	public void user_is_on_the_hms_login_page() throws IOException {
		
		driver = BaseClass.initializeDriver(); 
		loginpage = new LoginPageClass(driver); 
	}

	@When("user enters a valid username")
	public void user_enters_a_valid_username() throws IOException {
		
		loginpage.enterEmailAddress(ConfigReader.getConfigAValue("username"));
	
	}

	@When("user enters a valid password")
	public void user_enters_a_valid_password() throws IOException {
	 
		loginpage.enterPassword(ConfigReader.getConfigAValue("password"));
	}

	@When("user clicks the Sign In button")
	public void user_clicks_the_sign_in_button() {
		
		loginpage.clickSignInButton();
	   
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() throws InterruptedException {
		
		
		Thread.sleep(3000);
		boolean welcomeMessageisDisplayed = driver.findElement(By.xpath("//h5[@id='welcome-heading']")).isDisplayed();
		
		if(welcomeMessageisDisplayed) {
			System.out.println("Login successful. Welcome message is displayed.");
		} else {
			System.out.println("Login failed. Welcome message is not displayed.");
		}
		

	}

	@When("user enters a invalid username")
	public void user_enters_a_invalid_username() {
	 
	}

	@When("user enters a invalid password")
	public void user_enters_a_invalid_password() {

	}

	@Then("user should see and error message")
	public void user_should_see_and_error_message() {

	}
	
	
	
	
	
	
	
	
	

}
