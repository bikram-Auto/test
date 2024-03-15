package com.akhilsystem_release.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;

import com.akhilsystem_release.base.device.Device;

public class Base extends Device {
	
	protected By moduledd	= By.xpath("//input[@id='react-select-4-input']");
	
	protected WebElement dateBox(WebDriver driver, String boxName) {
		WebElement element = this.waitForElement(driver, 
				By.xpath("//label[text()='"+boxName+"']/..//input"),
				timeout);
		return element;
	}
	
	protected void inputDD2(WebDriver driver, String label, String option) throws ElementNotInteractableException {
		this.waitForElement(driver, 
				By.xpath("//label[text()='"+ label +"']/..//input"), 
				timeout).sendKeys(option);
		this.sleep(2);
		this.waitForElement(driver, 
				By.xpath("//label[text()='"+ label +"']/..//div[text()='"+ option +"']"), 
				timeout).click();
	}
	
	protected void inputDD(WebDriver driver, String dd, String option) throws ElementNotInteractableException {
		this.waitForElement(driver, 
				By.xpath("//div[@id='"+ dd +"']//input"), 
				timeout).sendKeys(option);
		this.waitForElement(driver, 
				By.xpath("//div[text()='"+ option +"']"), 
				timeout).click();
		this.sleep(sleep);
	}
	
	protected WebElement inputBox(WebDriver driver, String placeholder, Duration Tiomeout) {
		WebElement element = this.waitForElement(driver, By
				.xpath("//input[@placeholder='"+placeholder+"']"), Tiomeout);
		return element;
	}
	
	protected WebElement button(WebDriver driver, String button, Duration timeout) {
		WebElement element = this.scrollToElement(driver, By
				.xpath("//button[text()='"+ button +"']"), timeout);
		return element;
	}
	
	protected void quit(WebDriver driver, double sleep) {
		this.sleep(sleep);
		driver.quit();
	}
	
	protected void ModuleDd(String module, double sleep) {
		this.sleep(sleep);
		this.waitForElement(driver, moduledd, timeout).click();
		this.sleep(sleep);
		this.waitForElement(driver, By
				.xpath("//div[text()='"+module+"']"), timeout).click();
	}
	
	protected WebElement waitForElement(WebDriver driver, By locater, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver,(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locater));		
		return driver.findElement(locater);
	}
	
	protected List<WebElement> waitForElements(WebDriver driver, By locater, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver,(timeout));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locater));		
		return driver.findElements(locater);
	}
	
	protected WebElement scrollToElement(WebDriver driver, By locator, Duration timeout) {
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    WebElement element = this.waitForElement(driver, locator, timeout);
	    je.executeScript("arguments[0].scrollIntoView(true);", element);
	    return element;
	}

//	@Test
	protected void SignIn(WebDriver driver, String tinent, String fslt) {
		this.waitForElement(driver, 
				By.xpath(fslt), 
				timeout).sendKeys("pradip.sahoo@squbix.com");		
		this.waitForElement(driver,
				By.xpath(fslt), 
				timeout).sendKeys("1234");
	}

}


















































