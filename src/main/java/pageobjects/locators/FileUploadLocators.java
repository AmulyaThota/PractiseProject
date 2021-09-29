package pageobjects.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadLocators {
	@FindBy(css = "iframe[id=JotFormIFrame-72320244964454]")
	public WebElement iframe;
	
	@FindBy(css = "li[data-type='control_fileupload']")
	public WebElement upload;
	
	@FindBy(css = "input[id='input_3']")
	public WebElement name;
	
	@FindBy(css = "input[id='input_4']")
	public WebElement email;
	
	@FindBy(css = "input[id='input_5']")
	public WebElement chooseFile;
	
	@FindBy(css = "textarea[id='input_6']")
	public WebElement intrestWriting;
	
	@FindBy(css = "button[id='input_2']")
	public WebElement submit;
	
	
	
		

}
