package main.Java.com.appium.android;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.AppiumDriver;


public class BaseConfig {

	public static Integer timeOut = 10;
	public static  AppiumDriver driver;

	  
	@BeforeClass
	public static void initTests() throws IOException, InterruptedException {

		Properties prop = new Properties();
		InputStream input = ReadPropertyFile.class.getClassLoader().getResourceAsStream("unittest.properties.txt");
		
		prop = new Properties();
		prop.load(input);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, prop.getProperty("appLocation") + prop.getProperty("apkFileName"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
		cap.setCapability("unicodeKeyboard", "true");
		cap.setCapability("resetKeyboard", "true");
		driver = new AndroidDriver(new URL(prop.getProperty("urlPort")), cap);
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);

		
	}

	
	@AfterClass
	public static void afterTests(){
		   if (driver != null) {
	            driver.quit();
	        }
	}
	
	
}
