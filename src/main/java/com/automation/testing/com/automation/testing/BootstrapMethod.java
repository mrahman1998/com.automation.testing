package com.automation.testing.com.automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapMethod {

//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
//		driver.manage().window().maximize();
//		
//		WebElement element=driver.findElement(By.xpath("//button[@id=\"menu1\"]"));
//		element.click();
//		
//		List<WebElement> dd_values=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li"));
//		
//		for (WebElement values: dd_values ) {
//			if(values.getText().equals("JavaScript")) {
//				values.click();
//				break;
//			}
//			
//		}
//	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testuserautomation.github.io/DropDown/");
		driver.manage().window().maximize();
		
		WebElement city_dd_element=driver.findElement(By.xpath("//select[@name=\"Cities\"]"));
		city_dd_element.click();
		
		Select s1=new Select(city_dd_element);
//		s1.selectByValue("New york");
		s1.selectByIndex(3);
		
		
		WebElement bills_dd_element=driver.findElement(By.xpath("//select[@id=\"Bill\"]"));
		bills_dd_element.click();
		Select s2=new Select(bills_dd_element);
		s2.selectByIndex(0);
		s2.selectByIndex(1);
		
//		WebDriverWait wait=new WebDriverWait();
		
		
		
		
	}

}
