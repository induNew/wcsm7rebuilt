package readPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	
	public static void main(String[] args) throws IOException {
		
		//take the file for read operation
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create the object to use methods
		Properties prop = new Properties();
		//use the methods
		prop.load(fis);
		String value = prop.getProperty("username");
		//print the value
		System.out.println(value);
	}

}
