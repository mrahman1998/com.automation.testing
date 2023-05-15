package page;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;


public class RegistrationPage extends Base{

	
	public void click_on_no_i_am_new_here() {
	    WebElement no= driver.findElement(By.xpath("(//span[@class=\"signInSocial-tabDescription-39J\"])[2]"));
	    try {
			waitUntilElementClickable(no).click();
		} catch (Exception e) {
			jsExecuterClick(no);
		}
	}

	public void click_on_signup_with_email() {
	    WebElement signup_email = driver.findElement(By.xpath("//button[@class=\"signInSocial-createAccountButton-qNc button-root_highPriority-3u6 button-root-16x clickable-root-2gB\"]"));
	    try {
			waitUntilElementClickable(signup_email).click();
		} catch (Exception e) {
			jsExecuterClick(signup_email);
		}
	}

	public void fill_registration_form() {
	    
		WebElement firstname = driver.findElement(By.xpath("//input[@name=\"customer.firstname\"]"));
		firstname.sendKeys("Test");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name=\"customer.lastname\"]"));
		lname.sendKeys("Automation");
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"customer.email\"]"));
		email.sendKeys("test@xyz.com");
		
		WebElement dob = driver.findElement(By.xpath("//input[@name=\"customer.dob\"]"));
		dob.sendKeys("29/09/2010");
		
		WebElement address = driver.findElement(By.xpath("//input[@placeholder=\"Enter address\"]"));
		address.sendKeys("A, Selborne Mansions, Selborne Mount, BRADFORD, BD9 4NP, UNITED KINGDOM");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@autocomplete=\"phone\"]"));
		mobile.sendKeys("+448745829390");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.sendKeys("Test@123");
		
		WebElement confirm_pass = driver.findElement(By.xpath("//input[@name=\"password_confirm\"]"));
		confirm_pass.sendKeys("Test@123");
		
		WebElement term_conditions = driver.findElement(By.xpath("(//span[@class=\"checkbox-switchToggle-3tC right\"])[1]"));
		term_conditions.click();
		
		
	}

	public void click_create_your_account() {
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
	}

	public void validate_registration() {
	    WebElement under18_msg=	driver.findElement(By.xpath("//p[@class=\"message-root_error-1hZ message-root-3-g\" and text() = \"You must be at least 18\"]"));
	    assertTrue(under18_msg.isDisplayed());
	}
	
	
}
