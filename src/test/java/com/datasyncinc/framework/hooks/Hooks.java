package com.datasyncinc.framework.hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.datasyncinc.framework.pageobjects.LoginPageClass;
import com.dtasyncinc.framework.helper.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	WebDriver driver;
	LoginPageClass loginpage;
	
	@Before
	public void setUp() throws IOException {
		driver = BaseClass.initializeDriver(); 
		
	}
	
	
	
	@After
	public void tearDown() {
		BaseClass.quitDriver();
	}

}
