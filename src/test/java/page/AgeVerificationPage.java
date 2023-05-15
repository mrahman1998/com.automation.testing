package page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class AgeVerificationPage extends Base {
	
	String title = driver.getTitle();
	
	public void age_below() {
		
		WebElement btn_age_uner_18 = driver.findElement(By.xpath("//span[@class=\"button-content-3ns\" and text()=\"I'm under 18\"]"));
	    try {
	    	waitUntilElementVisible(btn_age_uner_18).click();
	    } catch (Exception e) {
			jsExecuterClick(btn_age_uner_18);
		}
		
	}

	
	public void validate_response() throws InterruptedException {
		
		WebElement error_dialogox = driver.findElement(By.xpath("//div[@class=\"dialog-logoWrap-1V9\"]"));
		assertTrue(error_dialogox.isDisplayed());
		
	}
}
