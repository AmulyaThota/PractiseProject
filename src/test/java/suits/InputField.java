package suits;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.actions.InputFieldsActions;
import utils.GenericMethods;
import webdriverclass.DriverManager;

public class InputField {

	InputFieldsActions ifa = null;

	@Parameters({ "browser" })
	@BeforeMethod
	public void beforemethod(String browser) {
		DriverManager.setDriver(browser);
		ifa = new InputFieldsActions();
		GenericMethods.openUrl("https://www.seleniumeasy.com/test/");
	}

	@Test(enabled = true)
	public void signleInputField() {
		
		ifa.verifyAndClosePopUp();
		ifa.verifyAndCLickSimpleDemo();
		ifa.fillAndClickSubmitBtn();
		ifa.verifyDisplayMessage();
		ifa.clearAndVerifyDisplayeMessage();
	}
	
	@Test
	public void multipleInputFields() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndCLickSimpleDemo();
		ifa.enterValuesAB();
		ifa.verifyDisplayTotal();	
	}
	@Test
	public void radioButton() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndCLickSimpleDemo();
		
	}

	@AfterMethod
	public void afterMethod() {
		GenericMethods.killDriver();
	}

}
