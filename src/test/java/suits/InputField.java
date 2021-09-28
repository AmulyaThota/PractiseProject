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

	@Test(enabled = true, priority = -2)
	public void signleInputField() {
		
		ifa.verifyAndClosePopUp();
		ifa.verifyAndCLickSimpleDemo();
		ifa.fillAndClickSubmitBtn();
		ifa.verifyDisplayMessage();
		ifa.clearAndVerifyDisplayeMessage();
	}
	
	@Test(enabled = true,priority = -1)
	public void multipleInputFields() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndCLickSimpleDemo();
		ifa.enterValuesAB();
		ifa.verifyDisplayTotal();	
	}
	@Test(enabled = true, priority = 0)
	public void radioButtons() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndClickRadioButton();
		ifa.verifyAndCickFemalRadioBtn();
		ifa.verifyGetCheckedValue();
	}
	@Test(enabled = true, priority =1)
	public void checkBoxSingle() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndClickCheckBoxDemo();
		ifa.verifyAndCickAgeBoxBtn();
		ifa.checkSuccessBox();
	}
	@Test(enabled = true, priority =2)
	public void checkBoxMultiple() {
		ifa.verifyAndClosePopUp();
		ifa.verifyAndClickCheckBoxDemo();
		ifa.checkBoxMultiple();
	}
	@Test(enabled = true, priority =3)
	public void iFrames() {
		ifa.verifyAndClosePopUp();
        //ifa.iFrames();
	}
		
	

		
	@AfterMethod
	public void afterMethod() {
		GenericMethods.killDriver();
	}

}
