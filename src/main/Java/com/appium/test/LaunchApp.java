package main.Java.com.appium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;


public class LaunchApp extends main.Java.com.appium.android.MethodLibrary {

	@Test
	public void test() throws MalformedURLException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		LaunchApplication();
		
	}

}