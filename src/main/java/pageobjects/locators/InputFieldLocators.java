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

	@FindBy(css = ".panel.panel-default a[href*='radio']")
	public WebElement radioButton;

	@FindBy(xpath = "//input[@value='Female' and @name='optradio']")
	public WebElement femaleRadio;

	@FindBy(xpath = "//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[2]")
	public WebElement labelName;

	@FindBy(css = "button[id='buttoncheck']")
	public WebElement checkButton;

	@FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton")
	public WebElement valueButton;

	@FindBy(css = ".panel.panel-default a[href*='checkbox']")
    public WebElement CheckBox;
	
	@FindBy(css = "input[id='isAgeSelected']")
	public WebElement ageCheckBox;
	
	@FindBy(css = "div[id='txtAge']")
	public WebElement successCheckBox;

	
	@FindBy(xpath = "//div[@class='checkbox'][1]")
	public WebElement option1;
	
	@FindBy(xpath = "//div[@class='checkbox'][2]")
	public WebElement option2;
	
	@FindBy(xpath = "//div[@class='checkbox'][3]")
	public WebElement option3;
	
	@FindBy(xpath = "//div[@class='checkbox'][4]")
	public WebElement option4;
	
	@FindBy(css = "input[value='Check All']")
	public WebElement checkAll;
	
	@FindBy(css = "input[value='Uncheck All']")
	public WebElement unCheckAll;
	
	
	
	
	

}
