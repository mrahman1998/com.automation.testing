package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class RegistrationPage extends Base{

	

	public void go_to_signin_register() {
		WebElement account = driver.findElement(By.xpath("//span[@class=\"icon-account\"]"));
	    mouseHover(driver, account);
	    
	    
	    WebElement signin_register = driver.findElement(By.xpath("(//li[@class=\"view-favorite switcher-option\"]//a)[3]"));
	    signin_register.click();
	}
	public void create_account() {
		WebElement create_account=driver.findElement(By.xpath("//a[@class=\"action create primary\"]"));
		create_account.click();
	}
	
	public void enter_valid_user_details() {
		WebElement f_name=driver.findElement(By.xpath("(//input[@id=\"firstname\"])[1]"));
		f_name.sendKeys("Rahul");
		
		WebElement l_name=driver.findElement(By.xpath("(//input[@id=\"lastname\"])[1]"));
		l_name.sendKeys("Dubey");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		email.sendKeys("rahul_dubey@gmail.com");
		
		WebElement dob=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
		dob.sendKeys("18/08/1998");
		
		WebElement gender=driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		//we will use select class if the dropdown tag is <select> else we will use bootstrap method
		Select dd=new Select(gender);
		dd.selectByValue("1");
		
		
		WebElement addr=driver.findElement(By.xpath("//*[@id=\"address-search\"]"));
		addr.sendKeys("Dwarka nagar, Bangalore");
		
//		WebElement phone=driver.findElement(By.xpath("(//*[@id=\"telephone\"])[1]"));
//		phone.sendKeys("+918638337625");
		WebElement mobile_not_uk_checkBox = driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
		mobile_not_uk_checkBox.click();
//		WebElement terms_cond_cb=driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
//		terms_cond_cb.click();
		
		WebElement create_pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		create_pass.sendKeys("Password@1");
		
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
		confirm_pass.sendKeys("Password@1");
		
		WebElement accept_terms=driver.findElement(By.xpath("(//label[@class=\"label choice-box__label\"])[1]"));
		accept_terms.click();		
		
//		WebElement submit_btn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		submit_btn.click();

	}
	
	
}
