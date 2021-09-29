package suits;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.actions.FileUploadActions;
import pageobjects.actions.IFramesActions;
import utils.GenericMethods;
import webdriverclass.DriverManager;

public class FileUpload {
	FileUploadActions fua = null;

	@Parameters({ "browser" })
	@BeforeMethod

	public void beforemethod(String browser) {
		DriverManager.setDriver(browser);
		fua = new FileUploadActions();
		GenericMethods.openUrl("http://demo.guru99.com/test/autoit.html");
	}
	@Test(enabled = true, priority = 0)
	public void fileUploadUsingAutoIt() throws IOException {
		fua.fileUploadUsingAutoIt();
	}
	@AfterMethod
	public void afterMethod() {
		//GenericMethods.killDriver();
	}
}
