package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.google.com/");
	 }
	 
	 @AfterTest
	 public void tearDown() 
	 {
		 driver.close();
	 }
	 
}
