package pageobjects.actions;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import pageobjects.locators.InputFieldLocators;
import utils.GenericMethods;
import utils.WaitUtils;
import webdriverclass.DriverManager;

public class InputFieldsActions {

	InputFieldLocators inputFieldLocators = null;
	WaitUtils wait = null;
	String labelName = null;
	String checkBoxIsChecked = null;

	public InputFieldsActions() {
		inputFieldLocators = new InputFieldLocators();
		PageFactory.initElements(DriverManager.getDriver(), inputFieldLocators);
		wait = new WaitUtils();
	}

	/**
	 * @author gadda This method to verify AD is present or not, if present will
	 *         close
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
		if (text.equals("9")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void verifyAndClickRadioButton() {
		if (!inputFieldLocators.rightArrow.isDisplayed()) {
			GenericMethods.scrollToElement(DriverManager.getDriver(), inputFieldLocators.rightArrow);
		}
		inputFieldLocators.rightArrow.click();
		inputFieldLocators.radioButton.click();

		if (GenericMethods.getcurrentUrl().contains("radiobutton")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		labelName = inputFieldLocators.labelName.getText();
	}

	public void verifyAndCickFemalRadioBtn() {
		if (inputFieldLocators.femaleRadio.isSelected()) {
			System.out.println("Button is already seleted");
		} else {
			System.out.println("Button is not selected");
			inputFieldLocators.femaleRadio.click();
		}

	}

	public void verifyGetCheckedValue() {
		inputFieldLocators.checkButton.click();
		String text = inputFieldLocators.valueButton.getText();
		if (text.contains(labelName)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void verifyAndClickCheckBoxDemo() {
		if (!inputFieldLocators.rightArrow.isDisplayed()) {
			GenericMethods.scrollToElement(DriverManager.getDriver(), inputFieldLocators.rightArrow);
		}
		inputFieldLocators.rightArrow.click();
		inputFieldLocators.CheckBox.click();
		if (GenericMethods.getTitle().contains("Checkbox")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public void verifyAndCickAgeBoxBtn() {
		if (inputFieldLocators.ageCheckBox.isSelected()) {
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}

		inputFieldLocators.ageCheckBox.click();

		if (inputFieldLocators.ageCheckBox.isSelected()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		checkBoxIsChecked = inputFieldLocators.successCheckBox.getText();

	}

	public void checkSuccessBox() {
		String text = inputFieldLocators.successCheckBox.getText();
		if (text.contains(checkBoxIsChecked)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public void checkBoxMultiple() {
		if (!inputFieldLocators.checkAll.isDisplayed()) {
			GenericMethods.scrollToElement(DriverManager.getDriver(), inputFieldLocators.checkAll);
		}
		inputFieldLocators.option1.click();
		if (inputFieldLocators.checkAll.isDisplayed()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		inputFieldLocators.checkAll.click();
		if (inputFieldLocators.unCheckAll.isDisplayed()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}
}

