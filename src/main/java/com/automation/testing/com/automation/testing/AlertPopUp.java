package com.automation.testing.com.automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement js_alert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		js_alert.click();
		
		driver.switchTo().alert().accept();
		
		WebElement js_confirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		js_confirm.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement js_prompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		js_prompt.click();
		
		driver.switchTo().alert().sendKeys("Automation Testing");
		driver.switchTo().alert().accept();
	}

}
