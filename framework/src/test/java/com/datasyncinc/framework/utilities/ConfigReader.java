package com.datasyncinc.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	// properties
	
	static Properties properties;
	

	public static String getConfigAValue(String kay) throws IOException {
		
		try {
			
			// we are creating an object of file input stream - take takes path of the file he needs read
			FileInputStream file = new FileInputStream("src/test/resources/config.properties");   // file reading is done
			
			properties = new Properties();  // this is to use the propeties class so that we can give him the key and he give us the value
			properties.load(file);   // we are loading the file   
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		String value = properties.getProperty(kay);
		return value;
		
	}
	
	
	
	
	
	
	

}
