package page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class AgeVerificationPage extends Base {
	
	String title = driver.getTitle();    
	public void age_below() {
	    WebElement agePopUp = driver.findElement(By.xpath("//button[@id=\"btn-entry-age-deny\"]"));
	    agePopUp.click();
	}

	
	public void validate_response() throws InterruptedException {
		Thread.sleep(4000);
		String currentTitle = driver.getTitle();
		assertEquals(title,currentTitle);
		
	}
}
