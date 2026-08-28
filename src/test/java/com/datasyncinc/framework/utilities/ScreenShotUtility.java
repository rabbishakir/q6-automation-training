package com.datasyncinc.framework.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.dtasyncinc.framework.helper.BaseClass;

public class ScreenShotUtility {

	// Take a screenshot using the WebDriver instance from BaseClass and save it to target/screenshots/
	// Returns the absolute path to the saved file, or null on failure.
	public static String takeScreenshot() {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
		String defaultName = "screenshot_" + timestamp + ".png";
		return takeScreenshot(defaultName);
	}

	// Overloaded: take screenshot and save with given filename. If filename has no extension, .png is appended.
	// Returns the absolute path to the saved file, or null on failure.
	public static String takeScreenshot(String filename) {
		WebDriver driver = BaseClass.getDriver();

		if (driver == null) {
			System.out.println("takeScreenshot: WebDriver instance is null. Initialize the driver before taking screenshots.");
			return null;
		}

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			if (filename == null || filename.trim().isEmpty()) {
				String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
				filename = "screenshot_" + timestamp + ".png";
			}

			// Ensure extension
			if (!filename.toLowerCase().endsWith(".png") && !filename.contains(".")) {
				filename = filename + ".png";
			}

			File dest = new File(System.getProperty("user.dir") + File.separator + "target" + File.separator
					+ "screenshots" + File.separator + filename);

			// Ensure directory exists
			File parent = dest.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
			}

			Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
			String savedPath = dest.getAbsolutePath();
			System.out.println("Screenshot saved to: " + savedPath);
			return savedPath;
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
			e.printStackTrace();
			return null;
		} catch (ClassCastException e) {
			System.out.println("Driver does not support taking screenshots: " + e.getMessage());
			e.printStackTrace();
			return null;
		}

	}
    
    void readingJsonFile() {
    	
    	// we will write the code here to read a json file
    	
    }
    
    
    void readDatafromSql() {
		
		//	we will write the code here to read data from sql database
	}
	

}
