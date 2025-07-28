package steps;

import BaseClass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	@Given("Launch browser")
	public void launch_url() {
		Base.LaunchBrowser("chrome");
		Base.LaunchUrl("https://www.facebook.com/");
	}

	@Given("Enter email address as (.*)$")
	public void enter_user_name(String name) {
		Base.Username(name);
	}

	@Given("Enter Password as (.*)$")
	public void enter_password(String pass) {
		Base.Password(pass);
	}

	@When("Click Login")
	public void click_login_button() {
		
		Base.LoginButton();
	}

	@Then("Incorrect email & password error should display")
	public void redirect_to_homepage_of_saucedemo_application() {
		
		Assert.assertTrue(Base.IsErrorIn());
		
	}
}



