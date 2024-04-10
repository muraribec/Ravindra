package com.qa.facebook.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.facebook.automation.factory.DriverFactory;

public class LoginPage extends DriverFactory{
	
	WebDriver driver;
	
	//POM --> PageObject, SinleArgumented Constructor, MemberFunction 
	
		//1]PageObject ---> Page Factory --> @FindBy @By
		
		@FindBy(id="email")
		WebElement emailIdTextBox;
		
		@FindBy(id="pass")
		WebElement passwordTextBox;
		
		@FindBy(name="login")
		WebElement loginBtn;
		
		public WebElement getEmailIdTextBox() {
			return emailIdTextBox;
		}

		public WebElement getPasswordTextBox() {
			return passwordTextBox;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		//2]Single Argumented Constructor  --> what is the diff between POM and PageFactory
		
		public LoginPage(WebDriver driver){
			this.driver = driver;		
			PageFactory.initElements(driver, this);
		}
		
		//3] Member Function ---> Methods --> What action are yiou gong to perform in your test cases you need to write 
		//seperate methods/ for each action you need to write the seperate methods
		
		//Testcase_01
		public void doLogin(String userName,String password) throws Exception {
			Thread.sleep(4000);
			getEmailIdTextBox().sendKeys(userName);
			Thread.sleep(4000);
			getPasswordTextBox().sendKeys(password);
			getLoginBtn().click();
		}
		
		public String getLoginPageTitle() {
			return driver.getTitle();
		}
		
	
	
	
	
	

}
