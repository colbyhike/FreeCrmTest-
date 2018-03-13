package com.crm.qa.webdriver.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * This class contains all generic functions for Webdrivers. e.g. findelement on
 * webpage with different parameters , click on button, switch to popup window.
 * 
 * @author Anil Kashyap
 * 
 */

public class WebDriverUtil {
	
	/**
	 * This method will locate the element on webpage with its Class Name. Here
	 * locator is class name of webelement.
	 * 
	 * @param locator
	 * @param driver
	 * @return
	 * @throws WebDriverUtilException
	 */
	
	public static WebElement findElementByClassName(WebDriver driver, String locator) throws WebDriverUtilException{
		if(driver == null || (locator == null && locator =="")){
			
			
		}
		WebElement webElement = driver.findElement(By.className(locator));
		return webElement;
		
	}
	
	

}
