package pageobjects.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramesLocators {
	@FindBy(xpath = "//iframe[@id='a077aa5e']")
	public WebElement frame;
	
	@FindBy(xpath = "//a[contains(@href,'live-selenium')]")
	public WebElement youTubeLink;
	

}
