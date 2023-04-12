package com.automation.testing.com.automation.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
   		WebElement multiple_tabs = driver.findElement(By.xpath("//button[@id=\"newTabsWindowsBtn\"]"));
   		multiple_tabs.click();
   		
   		Set<String> window_ids = driver.getWindowHandles();
   		
   		for (String id:window_ids) {
   			driver.switchTo().window(id);
   			String title=driver.getTitle();
   			
   			if(title.contains("Contact Me")) {
   				break;
   			}
   		}
   		
   		WebElement name = driver.findElement(By.xpath("(//input[@id=\"ContactForm1_contact-form-name\"])[1]"));
   		name.sendKeys("Manish");
		

	}

}
