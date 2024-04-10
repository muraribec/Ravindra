package com.qa.facebook.automation.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.qa.facebook.automation.factory.DriverFactory;

public class ElementActions extends DriverFactory{
	
	public ElementActions(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element = driver.findElement(locator);
		}catch (Exception e) {
			System.out.println("SOme Exception occur while creating the Webelement"+locator);
		}
		return element;
	}
	
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForTitlePresent(String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));		
	}
	
	public boolean elementISDisplayed(By locator) {
		waitForElementPresent(locator);
		return getElement(locator).isDisplayed();		
	}
	
	public void elementClick(By locator) {
		getElement(locator).click();
	}
	
	public void elementSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public String getPageTitle() {
		String title = null;
		try {
		title = driver.getTitle();
		}catch (Exception e) {
			System.out.println("Some Exception occut while creating the title"+title);
		}
		
		return title;
	}
	
	public String getNormalized(String textofString) {
		String normalizedText = textofString.replaceAll("[,-;|!\\s]", "").toLowerCase();
	    return normalizedText;
	}
	
	public void unconditionalWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void selectByText(By locator,String visibleText) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByVisibleText(visibleText);	
	}
	
	public String getText(By locator) {
		String text=null;
		try {
		text = getElement(locator).getText();
		}catch(WebDriverException we) {
			//Assert.fail("Element Text is not present"+locator);
			we.printStackTrace();
		}		
		return text;
	}
	
	public void scrollToElement(By locator) {
		try {
		WebElement ele = getElement(locator);		
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", ele);
		}catch (Exception e) {
         System.out.println("ScrollIntoElement doesnot exit with the locator"+locator.toString());
		}
	}

}
