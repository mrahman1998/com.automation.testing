package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	static Properties prop;
	
	static {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\wasim\\eclipse-workspace\\com.automation.testing\\Data\\Input.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void launch_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public WebDriver get_driver() {
		return driver;
	}
	
	public Properties get_prop() {
		return prop;
	}
	
	
	public void selectByVisibleText(WebElement ele, String str) {
		Select s=new Select(ele);
		s.selectByVisibleText(str);
	}
	
	public void pressEnterKeyboard(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();;
	}
	
	public void scrollToElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.scrollToElement(ele).build().perform();;
	}
	
	
}
