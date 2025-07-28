package steps;

import org.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{

	@Given("Launch Url")
	public void launch_url() {
		BaseClass.LaunchBrowser("chrome");
		BaseClass.LaunchUrl("https://www.saucedemo.com/");
	}

	@Given("Enter UserName")
	public void enter_user_name() {
		BaseClass.Username("standard_user");
	}

	@Given("Enter Password")
	public void enter_password() {
		BaseClass.Password("secret_sauce");
	}

	@When("Click Login button")
	public void click_login_button() {
		BaseClass.LoginButton();
	}

	@Then("Redirect to homepage of Saucedemo application")
	public void redirect_to_homepage_of_saucedemo_application() {
		
		Assert.assertTrue(IsLoggedIn());
	}

}
