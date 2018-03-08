package main.Java.com.appium.test;

import static main.Java.com.appium.android.ElementPropertyValue.BUY_NOW_BUTTON_ID;
import static main.Java.com.appium.android.ElementPropertyValue.SEARCH_RESULT_ITEM_CLASS;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static main.Java.com.appium.android.ElementPropertyValue.*;

import io.appium.java_client.TouchAction;

public class SelectElectronicGadget extends main.Java.com.appium.android.MethodLibrary {
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		LaunchApplication();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		SelectElectronics("iPhone SE", 389, 825);		
		driver.navigate().back();
		driver.navigate().back();
		
	}

}
