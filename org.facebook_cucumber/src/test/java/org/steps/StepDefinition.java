package org.steps;

import org.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{
	
	@Given("Launch browser")
	public void launch_url() {
		BaseClass.LaunchBrowser("chrome");
		BaseClass.LaunchUrl("https://www.facebook.com/");
	}

	@Given("Enter email address")
	public void enter_user_name() {
		BaseClass.Username("standard_user@gmail.com");
	}

	@Given("Enter Password")
	public void enter_password() {
		BaseClass.Password("secret_sauce");
	}

	@When("Click Login")
	public void click_login_button() {
		BaseClass.LoginButton();
	}

	@Then("Incorrect email & password error should display")
	public void redirect_to_homepage_of_saucedemo_application() {
		
		Assert.assertTrue(IsErrorIn());
	}
}
