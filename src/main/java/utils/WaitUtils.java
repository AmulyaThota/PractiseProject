package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriverclass.DriverManager;

public class WaitUtils {
	
	
	public void waitForElementVisible(int Timeout,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

}
