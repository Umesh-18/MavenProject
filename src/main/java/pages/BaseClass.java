package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {

	Properties prop;
	FileInputStream fis;
	public BaseClass() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\ConfigProperties");
		prop.load(fis);
	}
}
//	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\configProperties");
