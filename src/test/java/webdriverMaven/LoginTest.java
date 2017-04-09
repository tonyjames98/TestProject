package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		//driver = new FirefoxDriver();
		System.out.println("Before suite");
	}
	
	@Test
	public void doLogin(){
		System.out.println("Running Test");
		//driver.get("http://gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("test@test.com");
		//driver.findElement(By.id("Passwd")).sendKeys("pass");
	}
	
	@AfterSuite
	public void tearDown(){
		//driver.quit();
		System.out.println("After suite");
	}
}
