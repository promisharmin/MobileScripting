package main.Java.com.appium.android;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.TouchAction;
import net.sf.cglib.proxy.InterfaceMaker;

import static main.Java.com.appium.android.ElementPropertyValue.*;


public class MethodLibrary extends main.Java.com.appium.android.BaseConfig {
	
	public static Integer timeOut = 10;
	TouchAction t = new TouchAction(driver);

	
//	Method to launch the application 	
	public void LaunchApplication() throws InterruptedException {
		
		
		if (driver.findElementById(LANDING_PAGE_APP_LOGO_ID) != null) {
			
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			driver.findElementById(LANDING_PAGE_CLOSE_ICON_ID).isDisplayed();
			
			t.tap(driver.findElementById(LANDING_PAGE_CLOSE_ICON_ID)).perform();
			
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			driver.findElementById(SEARCH_TEXTBOX_ID).isDisplayed();
			
		}

		else if (driver.findElementById(SEARCH_TEXTBOX_ID) != null) {
			t.tap(driver.findElementById(SEARCH_TEXTBOX_ID)).perform();
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);

		}
	}
	

// Method to search electronic gadget
	public void SearchElectronics(String gadgetName) throws InterruptedException {
		
		driver.findElementById(SEARCH_TEXTBOX_ID).isDisplayed();
		t.tap(driver.findElementById(SEARCH_TEXTBOX_ID)).perform();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		t.tap(driver.findElementById(SEARCH_BOX_ID)).perform();
		driver.findElementById(SEARCH_BOX_ID).sendKeys(gadgetName);
		driver.sendKeyEvent(66);
		Thread.sleep(timeOut);
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.findElementById(SORT_LINK_ID).isDisplayed();

	}

	
// Method to Select electronic gadget from search list 
	public void SelectElectronics(String gadgetName, int xCoordinate, int yCoordinate) throws InterruptedException {
			
		SearchElectronics(gadgetName);
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.findElementByClassName(SEARCH_RESULT_ITEM_CLASS).isDisplayed();
		driver.findElementById(SEARCH_RESULT_ITEM_FRAME_ID).isDisplayed();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		t.tap((driver.findElementById(SEARCH_RESULT_ITEM_FRAME_ID)), xCoordinate, yCoordinate).perform();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.findElementById(PRODUCT_SUMMARY_ID).isDisplayed();
			
	}
	
	

		
}
