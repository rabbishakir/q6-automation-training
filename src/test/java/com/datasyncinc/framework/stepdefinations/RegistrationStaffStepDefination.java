package com.datasyncinc.framework.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.datasyncinc.framework.pageobjects.RegistrationStaffPageClass;
import com.dtasyncinc.framework.helper.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStaffStepDefination {

	WebDriver driver;
	RegistrationStaffPageClass registrationStaffPage;

	@When("user clicks the Register New Staff link")
	public void user_clicks_the_register_new_staff_link() {
		driver = BaseClass.getDriver();
		registrationStaffPage = new RegistrationStaffPageClass(driver);
		registrationStaffPage.clickRegisterNewStaffLink();
	}

	@Then("user should see the staff registration page title {string}")
	public void user_should_see_the_staff_registration_page_title(String expectedTitle) {
		String actualTitle = registrationStaffPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("user enters staff full name {string}")
	public void user_enters_staff_full_name(String fullName) {
		registrationStaffPage.enterFullName(fullName);
	}

	@When("user enters staff email {string}")
	public void user_enters_staff_email(String email) {
		registrationStaffPage.enterEmail(email);
	}

	@When("user enters staff temporary password {string}")
	public void user_enters_staff_temporary_password(String temporaryPassword) {
		registrationStaffPage.enterTempPassword(temporaryPassword);
	}

	@When("user enters staff username {string}")
	public void user_enters_staff_username(String username) {
		registrationStaffPage.enterUsername(username);
	}

	@When("user selects staff role {string}")
	public void user_selects_staff_role(String role) {
		registrationStaffPage.selectRole(role);
	}

	@When("user enters staff confirm password {string}")
	public void user_enters_staff_confirm_password(String confirmPassword) {
		registrationStaffPage.enterConfirmPassword(confirmPassword);
	}
}
