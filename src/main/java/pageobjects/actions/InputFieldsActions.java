package pageobjects.actions;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import pageobjects.locators.InputFieldLocators;
import utils.WaitUtils;
import webdriverclass.DriverManager;

public class InputFieldsActions {

	InputFieldLocators inputFieldLocators = null;
	WaitUtils wait = null;

	public InputFieldsActions() {
		inputFieldLocators = new InputFieldLocators();
		PageFactory.initElements(DriverManager.getDriver(), inputFieldLocators);
		wait = new WaitUtils();
	}

	/**
	 * @author gadda
	 * This method to verify AD is present or not, if present will close
	 * 
	 */
	public void verifyAndClosePopUp() {
		try {
			wait.waitForElementVisible(10, inputFieldLocators.closePopUp);
			if (inputFieldLocators.closePopUp.isDisplayed()) {
				inputFieldLocators.closePopUp.click();
			}
		} catch (TimeoutException e) {
			System.out.println("Element not founf after 10 secs");
		}
	}

	public void verifyAndCLickSimpleDemo() {
		System.out.println(inputFieldLocators.simpleDemoForm.isDisplayed());
		inputFieldLocators.rightArrow.click();
		System.out.println(inputFieldLocators.simpleDemoForm.isDisplayed());
		inputFieldLocators.simpleDemoForm.click();
	}

	public void fillAndClickSubmitBtn() {
		inputFieldLocators.messageInp.sendKeys("prabhat");
		inputFieldLocators.showMessageBtn.click();
	}

	public void verifyDisplayMessage() {
		String text = inputFieldLocators.yourMessage.getText();
		if (text.equals("prabhat")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	
	public void clearAndVerifyDisplayeMessage() {
		inputFieldLocators.messageInp.clear();
		inputFieldLocators.messageInp.sendKeys("amulya");

		inputFieldLocators.showMessageBtn.click();
		String text = inputFieldLocators.yourMessage.getText();
		if (text.equals("amulya")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	
	public void enterValuesAB() {
		inputFieldLocators.Value1.sendKeys("5");
		inputFieldLocators.Value2.sendKeys("4");
		inputFieldLocators.getTotalBtn.click();
	}
	
	public void verifyDisplayTotal() {
		String text = inputFieldLocators.dispalyTotal.getText();
		if(text.equals("9")) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		}
	
	/*
	 * 
	 */
	public void verifyAndClickRadioButton() {
		System.out.println(inputFieldLocators.radioButtons.isDisplayed());
		inputFieldLocators.rightArrow.click();
		System.out.println(inputFieldLocators.radioButtons.isDisplayed());
		inputFieldLocators.radioButtons.click();
		
	}
	/*
	 * public void radioButtonDemo() {
	 * System.out.println(inputFieldLocators.femaleRadio.isSelected());
	 * 
	 * 
	 * }
	 */
}
