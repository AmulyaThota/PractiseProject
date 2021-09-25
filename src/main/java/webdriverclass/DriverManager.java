package webdriverclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
	
	private static RemoteWebDriver driver =null;
	private static ThreadLocal<RemoteWebDriver> webdriver = new ThreadLocal<RemoteWebDriver>();
	

	public static void setDriver(String browserType) {
		
		switch (browserType) {
		case "FF":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver.exe");
			File pathBinary = new File("C:\\Users\\gadda\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			driver = new FirefoxDriver(options);
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		default:
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		webdriver.set(driver);
		
	}
	
	public static WebDriver getDriver() {
		return webdriver.get();
	}

}
