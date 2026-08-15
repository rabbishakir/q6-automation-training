package Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.nio.file.Files;
//
//public class Utility {
//
//    // Write key-value pair into a file
//    public void writeData(String key, String value) throws IOException {
//
//        FileWriter writer = new FileWriter("data.txt", true);
//
//        writer.write(key + "=" + value + "\n");
//
//        writer.close();
//    }
//
//
//    // Take screenshot and save with current time
//    public void takeScreenshot(WebDriver driver, String fileName) {
//
//        LocalDateTime currentTime = LocalDateTime.now();
//
//        DateTimeFormatter format =
//                DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
//
//        String time = currentTime.format(format);
//
//        File screenshot =
//                ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        File destination =
//                new File("screenshots/" + fileName + "_" + time + ".png");
//
//        destination.getParentFile().mkdirs();
//
//        screenshot.renameTo(destination);
//    }
//}


//Before  I write a method I need to think what i want to do 
// here is my plan : I already HAVE:
//key
//value

//I need to:
//1. Decide WHICH file I want to write into
//2. Open/create that file
//3. Write key=value into it
//4. Close/save the file
public class Utility{
	  
	//write data like key-value pair style into a file and save that file.//take a key and value → write them into a file → save the file.
	
	public static void writeData(String key, String value) throws IOException {
		
		FileWriter file = new FileWriter("testdata.txt"); //create and open file
		
		//key + "=" + value;
		
		file.write(key + "=" + value);// write into file
		
		file.close();// saving and closing the file 
		
	}
	
	// I already took 2 parameter filename and webDriver
	// then I will take a screenshot from the browser. 
	// So the flow is HomePagerunner class call base class to open the webDriver 
	//and run the driver.
	// then running driver will be passed into utility class for taking screenshot.
	// Final Utility class this method takeScreenshot take screenshot
	public static void screenshotTake(WebDriver driver, String fileName) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");// setting the formating pattern how I want it to be saved 
		 
		String time = currentTime.format(formatter);// applying format to my current time
		
		String finalFileName = fileName + "_" + time + ".png";
		
		File destination = new File("screenshots/" + finalFileName);

		destination.getParentFile().mkdirs();

		Files.copy(screenshot.toPath(), destination.toPath());
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}