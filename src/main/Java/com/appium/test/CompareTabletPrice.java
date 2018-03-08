package main.Java.com.appium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static main.Java.com.appium.android.ElementPropertyValue.*;
import org.junit.Test;

public class CompareTabletPrice extends main.Java.com.appium.android.MethodLibrary {
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {

		LaunchApplication();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		SearchElectronics("iPhone SE");
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.findElementById(PRODUCT_PRICE_ID).isDisplayed();
		
		String iPhoneSE = driver.findElementById(PRODUCT_PRICE_ID).getText();
		String iPhoneSEPrice = iPhoneSE.replaceAll("[^0-9]", "");
		int iPhonePrice = Integer.parseInt(iPhoneSEPrice);
		System.out.println("iPhone SE Price is: " + iPhonePrice);
		
		driver.navigate().back();
		driver.navigate().back();		
		SearchElectronics("iPad");
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		
		String iPad = driver.findElementById(PRODUCT_PRICE_ID).getText();
		String iPadValue = iPad.replaceAll("[^0-9]", "");
		int iPadPrice = Integer.parseInt(iPadValue);
		
		System.out.println("iPad Price is: " + iPadPrice);
		
		if (iPhonePrice > iPadPrice) {
			System.out.println("iPhone SE Price is higher than iPad");
		}
		else if (iPhonePrice < iPadPrice) {
			System.out.println("iPad Price is higher tan iPhone SE");
		}

		driver.navigate().back();
		
	}
	

}
