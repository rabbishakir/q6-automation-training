package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTestRunner {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass bs = new BaseClass();
		bs.initializeDriver();
		Thread.sleep(5000);
		
		String username = ConfigReader.getConfigAValue("username");
		System.out.println(username);
		
		Utility.writeData("username", "afia");
		Utility.screenshotTake(bs.driver, "HomePage");
		bs.quitDriver();
		

	}

}


// utility for screenshot
// utility for writing in anyfile as key-value pair 
// writedata(String key, String value)
// takeScreenshot(String filename, cureent time)
// save the file in file system
