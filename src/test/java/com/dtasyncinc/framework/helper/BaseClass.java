package com.dtasyncinc.framework.helper;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.datasyncinc.framework.utilities.ConfigReader;

public class BaseClass {

	static WebDriver driver;  

	// we will create a method
	// that will give us the driver instance

	public static WebDriver initializeDriver() throws IOException {

		String browser = ConfigReader.getConfigAValue("browser");
		int waitTime = Integer.parseInt(ConfigReader.getConfigAValue("implicitwait"));

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		driver.manage().window().maximize();
		driver.get(ConfigReader.getConfigAValue("url"));   
		
		return driver;
	}
	
	
	// we just need drive in another class?
	
	static WebDriver getDriver() {
		return driver;
	}
	


	public static void quitDriver() {
		// if the driver is not null
		if (driver != null) {
			driver.quit();
		}

	}

}
