package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class SearchBoxPage extends Base{

	
	public void go_to_search_and_provide_search_text() {
	    WebElement search_box = driver.findElement(By.xpath("//input[@placeholder=\"Search for flavours and devices...\"]"));
	    search_box.sendKeys("vape");
	}

	
	public void press_enter() {
		pressEnterKeyboard(driver);
	}

	
	public void validate_the_response() {
		WebElement validation_elem = driver.findElement(By.xpath("(//p[@class=\"toolbar-count\"])[1]"));
		assertTrue(validation_elem.isDisplayed());
	}
}
