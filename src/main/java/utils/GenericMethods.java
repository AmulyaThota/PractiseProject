package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webdriverclass.DriverManager;

public class GenericMethods {

	public static void openUrl(String url) {
		DriverManager.getDriver().get(url);
	}

	public static void killDriver() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}

	public static void scrollToElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static String getcurrentUrl() {
		return DriverManager.getDriver().getCurrentUrl();
	}
	public static String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
	public static void switchTo(WebElement frame) {
		DriverManager.getDriver().switchTo().frame(frame);
		
	}
	
	public static String getAttribute(WebElement ele,String attributeName) {
		return ele.getAttribute(attributeName);
	}
}
