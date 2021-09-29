package pageobjects.actions;

import java.io.IOException;
import java.text.Normalizer.Form;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageobjects.locators.FileUploadLocators;
import pageobjects.locators.IFramesLocators;
import utils.GenericMethods;
import utils.WaitUtils;
import webdriverclass.DriverManager;

public class FileUploadActions {
	FileUploadLocators fileUploadLocators = null;
	WaitUtils wait = null;
	public FileUploadActions() {
		fileUploadLocators = new FileUploadLocators();
		PageFactory.initElements(DriverManager.getDriver(), fileUploadLocators);
		wait = new WaitUtils();
	}

	public void fileUploadUsingAutoIt() throws IOException {
		DriverManager.getDriver().switchTo().parentFrame();
		try {
		if (fileUploadLocators.iframe.isDisplayed()) {
			GenericMethods.switchTo(fileUploadLocators.iframe);
		}
		fileUploadLocators.name.sendKeys("Thota Amulya");
		fileUploadLocators.email.sendKeys("amulyathota97@gmail.com");
		clickusingdimensions(fileUploadLocators.chooseFile);
		Runtime.getRuntime().exec("D:\\Autoit\\FileUpload.exe").waitFor();

		fileUploadLocators.intrestWriting.sendKeys("Auto it in selenium");
		GenericMethods.clickByJs(DriverManager.getDriver(), fileUploadLocators.submit);
		//fileUploadLocators.submit.click();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void clickusingdimensions(WebElement ele) {
		System.out.println(ele.getLocation());
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele, 10, 0).click().build().perform();
	}
}
