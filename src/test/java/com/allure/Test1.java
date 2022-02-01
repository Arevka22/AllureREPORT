package com.allure;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;



public class Test1 {
	
	WebDriver driver;
	
	
	
	
	@BeforeMethod
	public void setUp() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("http://www.arevka.com");
	
	}
	
	@Test(priority=1, description="verify bla bla bla")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifydskfdsfhjdlskdfdskfjdsfjkjdkjfk")
	@Story("StoryStoryStoryStoryStoryStoryStoryStory")
	public void logoPresence() {
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "AREVKA IN FASHION");	
		
	}
	
	@Test(priority=2, description="verify bla bla bla")
	public void titlePresence() {
	String text = driver.findElement(By.cssSelector("#BlogArchive1>h2")).getText();
	AssertJUnit.assertEquals(text, "Archive");	
		
	}
	
	@Test(priority=3, description="verify bla bla bla")
	public void registrationTest() {
		
		
	throw new SkipException("Skipping this Test");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
			
		}
	
	
	

}
