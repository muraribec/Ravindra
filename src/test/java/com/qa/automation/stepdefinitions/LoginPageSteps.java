package com.qa.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.facebook.automation.constants.Constants;
import com.qa.facebook.automation.factory.DriverFactory;
import com.qa.facebook.automation.pages.LoginPage;
import com.sun.org.apache.bcel.internal.classfile.Constant;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	WebDriver driver ; 
	
	@Given("user is already on {string} page")
	public void user_is_already_on_page(String string) {
	   DriverFactory.getDriver().get(string);
	}

	@When("title of the facebook is login page")
	public void title_of_the_facebook_is_login_page() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("Title of the URL is:"+title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	@Then("close the browser")
	public void close_the_browser() {
     
	}


}
