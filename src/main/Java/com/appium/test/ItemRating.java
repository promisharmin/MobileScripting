package main.Java.com.appium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static main.Java.com.appium.android.ElementPropertyValue.*;


public class ItemRating extends main.Java.com.appium.android.MethodLibrary {
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		LaunchApplication();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		SearchElectronics("iPhone SE");
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		String rating = driver.findElementById(PRODUCT_RATING_ID).getText();
		System.out.println("Rating for iPhone SE is: " + rating);
		driver.navigate().back();
	}
	

}
