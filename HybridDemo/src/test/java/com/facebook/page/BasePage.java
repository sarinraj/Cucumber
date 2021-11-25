package com.facebook.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.customexception.BrowserNotSupportedException;

public class BasePage {

	public static WebDriver driver;
	Properties prop;
	String browsername;
	
	public BasePage() {
		// to initialize the driver : as per config propty
		try {
		prop=new Properties();
		prop.load(new FileInputStream("config/config.properties"));

		browsername= prop.getProperty("browser");

		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.geckdriver.driver", "driver/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else
		{
		throw new BrowserNotSupportedException("Requested broswer is not supported");
		}


		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (BrowserNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

	}
	
	public void init() {
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
		
}
