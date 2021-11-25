package com.stepdef;




import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {

	
	/*
	 * @Before public void beforeTest() {
	 * System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	 * driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 */
	
	
	
	@When("user click on heart icon")
	public void user_click_on_heart_icon() {
		
		LogInStepDef.driver.findElement(By.xpath("//li[@class='mobileWish']")).click();
	    
	}
	
	
	@When("user click sign in with email")
	public void user_click_sign_in_with_email() {
		
		LogInStepDef.driver.findElement(By.xpath("//div[@class='clearfix']/a")).click();
		
	}
	@When("user click sign up")
	public void user_click_sign_up() {
		
		LogInStepDef.driver.findElement(By.xpath("//div[@class='lnkaccount']/a")).click();
		
	}
	@When("user enters all the credentials")
	public void user_enters_all_the_credentials() {
		
		LogInStepDef.driver.findElement(By.xpath("//input[@name='signupFullName']")).sendKeys("Sarin Raj");
		LogInStepDef.driver.findElement(By.xpath("//input[@name='signupEmail']")).sendKeys("sarinraj0@gmail.com");
		LogInStepDef.driver.findElement(By.xpath("//input[@name='signupMobileNumber']")).sendKeys("9566030252");
		LogInStepDef.driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("Sarinraj@123");
		LogInStepDef.driver.findElement(By.xpath("//input[@id='men']")).click(); 
		
		//input[@name='singupRegisterOtp']
	}
	
	
	@When("user enter continue")
	public void user_enter_continue() {
		
		LogInStepDef.driver.findElement(By.xpath("/html/body/main/div[13]/div/div/div[1]/form/div[1]/div[1]/button")).click(); 
	    
	}
	
	@When("user enter continue in OTP page")
	public void user_enter_continue_in_otp_page() throws InterruptedException {
	   //enter otp manually
		Thread.sleep(20000);
		LogInStepDef.driver.findElement(By.xpath("//input[@name='singupRegisterOtp']")).sendKeys("123456");
		LogInStepDef.driver.findElement(By.xpath("/html/body/main/div[13]/div/div/div[1]/form/div[1]/div[2]/button")).click();
	}
	
	@Then("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	    
		//driver.getTitle();
		Assert.assertTrue(LogInStepDef.driver.getTitle().contains("Online Shopping India"));
		/*
		 * LogInStepDef.driver.findElement(By.xpath("//input[@id='mobileNumber']")).
		 * sendKeys("9566030252"); LogInStepDef.driver.findElement(By.xpath(
		 * "/html/body/main/div[12]/div[2]/div/div/div[1]/div[1]/form/button")).click();
		 * //enter otp manually Thread.sleep(20000);
		 * LogInStepDef.driver.findElement(By.xpath("//button[@id=\"otpBtn\"]")).click()
		 * ;
		 */
	}
}
