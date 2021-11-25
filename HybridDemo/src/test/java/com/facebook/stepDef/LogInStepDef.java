package com.facebook.stepDef;

import org.junit.Assert;

import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDef {

	LoginPage lp;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  
		lp=new LoginPage();
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String unm, String passw) {
	   // enter un and pass
		lp.enterUserName(unm);
		lp.enterPassword(passw);
	}
	@When("user clicks on sumbit")
	public void user_clicks_on_sumbit() {
	    lp.clickSubmitButton();
	}
	@Then("user is on same page")
	public void user_is_on_same_page() {
	  Assert.assertTrue(lp.driver.getTitle().contains("Facebook")); 
	}
	
}
