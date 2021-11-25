package com.stepdef;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LogInStepDef {

public static WebDriver driver;
	

	@Given("user must be on home page")
	public void user_must_be_on_home_page() {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.shoppersstop.com/#");
		}
	
	@When("user enter mobile number registered")
	public void user_enter_mobile_number_registered() {
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9566030252");
		
	}
	@When("user click send otp")
	public void user_click_send_otp() {
		driver.findElement(By.xpath("/html/body/main/div[12]/div[2]/div/div/div[1]/div[1]/form/button")).click(); 
		
	}
	@When("user enters continue in OTP page")
	public void user_enters_continue_in_otp_page() throws InterruptedException {
		//enter otp manually 
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name='singupRegisterOtp']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id=\"otpBtn\"]")).click(); 

	}

	

}
