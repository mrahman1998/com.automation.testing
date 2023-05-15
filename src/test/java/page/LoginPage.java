package page;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;

public class LoginPage extends Base {

	
	public void accept_all_cookies() { 
		
		WebElement cookies=driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));

		try {
			waitUntilElementClickable(cookies).click();
		} catch (Exception e) {
			jsExecuterClick(cookies);
		}
	}
	
	public void select_country() {
		WebElement country_dd=driver.findElement(By.xpath("//select"));
		selectByVisibleText(country_dd ,"United Kingdom");
	}
	
	
	public void age_ver() {
		
		WebElement age_rest_btn=driver.findElement(By.xpath("(//button[@class=\"button-root_highPriority-3u6 button-root-16x clickable-root-2gB\"])[17]"));
		try{
			waitUntilElementClickable(age_rest_btn).click();
		} catch (Exception e) {
			jsExecuterClick(age_rest_btn);
		}
	}
	
	public void click_signInButton(){
		WebElement signInButton=driver.findElement(By.xpath("//span[@class=\"accountChip-root-2kC\"]"));

		signInButton.click();
	}
	
	public void enter_valid_email_and_password() {
		
		WebElement email = driver.findElement(By.xpath("//input[@autocomplete=\"email\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
 	    email.sendKeys("jjbvvh2@gmail.com");
	    password.sendKeys("Password@1");
	    
	}
	
	public void click_login() {
		
		WebElement login_btn=driver.findElement(By.xpath("//div[@class=\"signInSocial-buttonsContainer-2mE\"]"));
		waitUntilElementClickable(login_btn).click();
	}
	
	public void validate_login() {
		final WebElement ele= driver.findElement(By.xpath("//div[@class=\"accountMenuItems-title-O5o\"]"));
		assertTrue(ele.isDisplayed());
	}
	
	public void click_on_forget_password() {
	    
	    WebElement forget_pass = driver.findElement(By.xpath("//span[@class=\"button-content-3ns\" and text() =  \"Forgot Password?\"]"));
	    try{
	    	waitUntilElementClickable(forget_pass).click();
	    } catch (Exception e) {
			jsExecuterClick(forget_pass);
		}
	}

	public void email_and_click_submit() {
		
		WebElement recover_password = driver.findElement(By.xpath("//h2[@class=\"forgotPassword-title-30G\"]"));
	    waitUntilElementVisible(recover_password);
	    WebElement email_field = driver.findElement(By.xpath("//input[@class=\"textInput-input-BvJ field-input-1he field-input-23y\" and @name=\"email\"]"));
	    email_field.sendKeys("jjbvvh2@gmail.com");
	    WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    submit.click();
	}

	public void validate_password_recovery_message() {
	    WebElement password_recovery_message = driver.findElement(By.xpath("//p[@class=\"formSubmissionSuccessful-text-1Q0\"]"));
	    assertTrue(password_recovery_message.getText().contains("you will receive an email with a link"));
	}
	
}
	
	