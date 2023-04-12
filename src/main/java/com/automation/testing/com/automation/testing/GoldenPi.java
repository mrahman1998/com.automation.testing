package com.automation.testing.com.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoldenPi {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://goldenpi.com/");
		driver.manage().window().maximize();
		
		WebElement discover = driver.findElement(By.xpath("//a[@class=\"menu-item-text gtm-menu-discover\"]"));
		
		Actions cursor=new Actions(driver);
		cursor.moveToElement(discover).build().perform();
		WebElement ncd_ipo = driver.findElement(By.xpath("(//div[@class=\"content\"])[2]"));
		cursor.moveToElement(ncd_ipo);
		cursor.click().build().perform();
		
		WebElement faqs = driver.findElement(By.xpath("(//h2[@class=\"heading\"])[2]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(faqs));
		
		WebElement  blogs= driver.findElement(By.xpath("//a[@class=\"menu-item-text gtm-menu-Blogs\"]"));
		cursor.moveToElement(blogs);
		cursor.click().build().perform();
		

	}

}
