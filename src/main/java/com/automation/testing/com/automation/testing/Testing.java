package com.automation.testing.com.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement cookies=driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		cookies.click();
		
		WebElement age_rest_btn=driver.findElement(By.xpath("//button[@id=\"btn-entry-age-allow\"]"));
		age_rest_btn.click();
		
		WebElement submit_btn=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(submit_btn));
		
		create_account(driver, submit_btn);
		
				
    }
	
	public static void create_account(WebDriver driver, WebElement submit_btn) {
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
		
		WebElement phone=driver.findElement(By.xpath("(//*[@id=\"telephone\"])[1]"));
		phone.sendKeys("+918638337625");
		
		WebElement terms_cond_cb=driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
//		terms_cond_cb.click();
		
		WebElement create_pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		create_pass.sendKeys("Password@1");
		
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
		confirm_pass.sendKeys("Password@1");
		
		WebElement accept_terms=driver.findElement(By.xpath("(//label[@class=\"label choice-box__label\"])[1]"));
		accept_terms.click();		
		
//		WebElement submit_btn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit_btn.click();
		
		
	}
	
} 
