package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	WebDriver driver;

	// we will create a method
	// that will give us the driver instance

	public void initializeDriver() throws IOException {

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
	}

	public void quitDriver() {
		// if the driver is not null
		if (driver != null) {
			driver.quit();
		}

	}

}
