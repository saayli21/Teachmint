package org.automation.generic_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Java_Utility {
	public String getdata(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pr=new Properties();
		pr.load(fis);
		return pr.getProperty(key);
	}

}
