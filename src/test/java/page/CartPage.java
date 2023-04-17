package page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class CartPage extends Base{

	public void click_on_shop_now_button() {
	    WebElement shop_now_btn = driver.findElement(By.xpath("(//a[@class=\"pagebuilder-button-primary\"])[2]"));
	    shop_now_btn.click();
	}

	
	public void add_item_to_basket() {
		
		WebElement shop_now_btn = driver.findElement(By.xpath("(//div[@class=\"product-item-info product-card\"])[1]"));
		mouseHover(driver, shop_now_btn);
		WebElement add_to_basket = driver.findElement(By.xpath("(//button[@title=\"Add to basket\"])[1]"));
		add_to_basket.click();
		//add
	}

	
	public void validate_item_is_added_to_basket() {
		WebElement no_of_times = driver.findElement(By.xpath("//span[@class=\"count\"]"));
		String items = no_of_times.getText();
		assertEquals(items, "2");
	}
	
	
}



