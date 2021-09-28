package pageobjects.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageobjects.locators.IFramesLocators;
import utils.GenericMethods;
import utils.WaitUtils;
import webdriverclass.DriverManager;

public class IFramesActions {

	IFramesLocators iFramesLocators = null;
	WaitUtils wait = null;
	String youTubeUrl = null;
	String currentUrl = "http://demo.guru99.com/test/guru99home/";

	public IFramesActions() {
		iFramesLocators = new IFramesLocators();
		PageFactory.initElements(DriverManager.getDriver(), iFramesLocators);
		wait = new WaitUtils();
	}

	public void switchToFrame() {
		if (!iFramesLocators.frame.isDisplayed()) {
			GenericMethods.scrollToElement(DriverManager.getDriver(), iFramesLocators.frame);
		}
		GenericMethods.switchTo(iFramesLocators.frame);
		
	}

	public void verifyAndCheckUrls() {
		String currentUrl = GenericMethods.getAttribute(iFramesLocators.youTubeLink,"href");
		String youTubeUrl = "http://www.guru99.com/live-selenium-project.html";

		if (currentUrl.equals(youTubeUrl)) {
			System.out.println("Switch is pass");
			if (iFramesLocators.youTubeLink.isDisplayed()) {
				System.out.println("element is present");
				System.out.println(iFramesLocators.youTubeLink.getAttribute("href"));
			} else {
				System.out.println("element is not present");
			}
		} else {
			System.out.println("switch is fail");
		}

	}

	/*
	 * public static boolean isDiaplayed() {
	 * 
	 * try { DriverManager.getDriver().findElement(null)); return true; }catch
	 * (NoSuchElementException e) { return false; }catch(Exception e) {
	 * e.printStackTrace(); return false; }
	 */

}
