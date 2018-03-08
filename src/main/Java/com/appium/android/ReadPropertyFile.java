package main.Java.com.appium.android;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {


	public ReadPropertyFile() throws IOException {

		Properties prop = new Properties();
		InputStream input = ReadPropertyFile.class.getClassLoader().getResourceAsStream("unittest.properties.txt");

		prop = new Properties();
		prop.load(input);

	}

	public String appLocation() {
		Properties prop = null;
		return prop.getProperty("appLocation");

	}

	public String apkFileName() {
		Properties prop = null;
		return prop.getProperty("apkFileName");

	}

	public String platformVersion() {
		Properties prop = null;
		return prop.getProperty("platformVersion");

	}

	public String urlPort() {
		Properties prop = null;
		return prop.getProperty("urlPort");

	}

	public String elementTimeoutSec() {
		Properties prop = null;
		return prop.getProperty("elementTimeoutSec");

	}

}
