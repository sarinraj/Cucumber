package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.page.BasePage;

public class LoginPage extends BasePage {

	//data member all UI Webelement on the log in page
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;
	@FindBy(xpath = "//button[@name='login']")
	WebElement submitbtn;
	//mem function
	
	public LoginPage()
	{
		super();// base page ctor : inilize : driver
		init();// load url
		PageFactory.initElements(driver,this);// inilize the page obj repo
		
	}
	
	public void enterUserName(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String passw) {
		Password.sendKeys(passw);
	}
	
	public void clickSubmitButton() {
		submitbtn.click();
	}
	
	
	
	
	
}
