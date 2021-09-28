package suits;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.actions.IFramesActions;
import utils.GenericMethods;
import webdriverclass.DriverManager;

public class IFrames {

		IFramesActions ifa = null;

		@Parameters({ "browser" })
		@BeforeMethod

		public void beforemethod(String browser) {
			DriverManager.setDriver(browser);
			ifa = new IFramesActions();
			GenericMethods.openUrl("http://demo.guru99.com/test/guru99home/");
		}
		@Test(enabled = true, priority = 0)
		public void switchIFrame() {
			ifa.switchToFrame();
			ifa.verifyAndCheckUrls();
		}
		@AfterMethod
		public void afterMethod() {
			GenericMethods.killDriver();
		}
}