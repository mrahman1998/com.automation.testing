package page;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;


public class SauceDemoLoginPage extends Base {

//	WebDriver driver= driver;
	
	
//	public void login_site_url() {
//		launch_url();
//	}
	public void enter_username() {
		WebElement usernameField= driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		usernameField.sendKeys(prop.getProperty("username"));
	}
	
	public void enter_password() {
		WebElement passwordField= driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordField.sendKeys(prop.getProperty("password"));
	}
	
	public void login_btn_click() {
		WebElement login_btn=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login_btn.click();
	}
	
	public void validate_login() {
		WebElement products=driver.findElement(By.xpath("//span[@class=\"title\"]"));
		assertTrue(products.isDisplayed());
	}
	
	
}

