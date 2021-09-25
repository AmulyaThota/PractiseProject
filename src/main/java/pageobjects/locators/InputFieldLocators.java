package pageobjects.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFieldLocators {

	@FindBy(css = "#at-cv-lightbox-header .at4-close")
	public WebElement closePopUp;

	@FindBy(css = ".tree-indicator.glyphicon.glyphicon-chevron-right")
	public WebElement rightArrow;

	@FindBy(xpath = "(//a[@href='./basic-first-form-demo.html'])[2]")
	public WebElement simpleDemoForm;

	@FindBy(css = "input[id='user-message']")
	public WebElement messageInp;

	@FindBy(css = "#get-input button")
	public WebElement showMessageBtn;

	@FindBy(css = "#user-message #display")
	public WebElement yourMessage;

	@FindBy(css = "#sum1")
	public WebElement Value1;

	@FindBy(css = "#sum2")
	public WebElement Value2;

	@FindBy(css = ".btn.btn-default")
	public WebElement getTotalBtn;

	@FindBy(css = "#displayvalue")
	public WebElement dispalyTotal;

	@FindBy(xpath = "(//a[@href='./basic-first-form-demo.html'])[6]")
	public WebElement radioButtons;

	@FindBy(xpath = "//input[@value='Female' and @name='optradio']")
	public WebElement femaleRadio;

	@FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]")
	public WebElement labelName;

	@FindBy(css = "button[id='buttoncheck']")
	public WebElement checkButton;

	@FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton")
	public WebElement valueButton;

}
