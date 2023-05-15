package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\wasim\\eclipse-workspace\\com.automation.testing\\Data\\Input.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectByVisibleText(WebElement ele, String str) {
		Select s=new Select(ele);
		s.selectByVisibleText(str);
	}
	
	public void pressEnter(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();;
	}
	
	public void scrollToElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.scrollToElement(ele).build().perform();
	}
	
	public void screenshot() {
		TakesScreenshot scr = (TakesScreenshot) driver;
		
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		long currentTime=System.currentTimeMillis();
		
		try {
			FileUtils.copyFile(srcFile, new File("screenshots/"+currentTime+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void jsExecuterClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	public WebElement waitUntilElementVisible(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public WebElement waitUntilElementClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
