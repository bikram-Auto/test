package com.akhilsystem_release.base.device;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.akhilsystem_release.base.data.Data;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Device extends Data {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;

	@BeforeTest
	protected void lunch() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.safaridriver().setup();
		WebDriverManager.edgedriver().setup();
		Map<String, Object> prefs = new HashMap<String, Object>();
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 1);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
//		driver = new EdgeDriver();
//		driver = new ChromiumDriver();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver, (timeout));
		driver.get(url);
	}
}