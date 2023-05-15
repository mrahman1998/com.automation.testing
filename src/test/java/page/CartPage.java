package page;

import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;


public class CartPage extends Base{
	
	
	public static boolean isEmpty(WebElement basket) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String basketText=basket.getText();
		if(basketText.contains("0.00")) {
			return true;
		}
		return false;
			
	}
	
	public static void epmtyBasket(WebElement basket) {
		
		basket.click();
		List<WebElement> delete_ele_list = driver.findElements(By.xpath("//button[@class=\"item-deleteButton-3Eu\"]"));
		int i = delete_ele_list.size()-1;
		
		while(i>=0) {
			delete_ele_list.get(i).click();
			i--;
		}
		
	}
	
	public void check_if_basket_empty_and_remove_items_if_not_empty() {
		
		WebElement basket = driver.findElement(By.xpath("//button[@class=\"cartTrigger-trigger-3Ke cartTrigger-trigger-2w8 clickable-root-2gB\"]"));
		System.out.println("Basket is empty "+isEmpty(basket));
		if(!isEmpty(basket)) {
			System.out.println("Entering inside if block");
			epmtyBasket(basket);
		}
		
		
	}
	
	public void close_basket() {
		WebElement close_basket = driver.findElement(By.xpath("(//span[@class=\"icon-root-XQD\"])[8]"));
		try {
	    	waitUntilElementClickable(close_basket).click();
	    } catch (Exception e) {
			jsExecuterClick(close_basket);
		}
	}

	public void click_on_search_button_and_enter_the_text() {
	    
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class=\"searchTrigger-root-1U9 searchTrigger-root-1ct clickable-root-2gB\"]"));
	    try {
	    	waitUntilElementClickable(searchIcon).click();
	    } catch (Exception e) {
			jsExecuterClick(searchIcon);
		}
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search for flavours and devices...\"]"));
		waitUntilElementClickable(searchBox).sendKeys("vuse device");
		pressEnter(driver);
	}

	public void add_any_item_to_the_basket() {
		WebElement item_add = driver.findElement(By.xpath("(//span[@class=\"button-content-3ns\"and text() = \"Add to Basket\"])[1]"));
		item_add.click();
	}


	public void select_a_item_to_open_description() {
		WebElement item = driver.findElement(By.xpath("(//section[@class=\"productCompactDetail-title-kHJ\"])[1]"));
		item.click();
		
		
	}

	public void add_selected_item_to_basket() {
		
		WebElement item_description = driver.findElement(By.xpath("//span[@class=\"button-content-3ns\" and text() = \"Add to Basket\"]"));
		item_description.click();
	}

	public void validate_item_is_added_to_basket() {
		
		WebElement basket = driver.findElement(By.xpath("//button[@class=\"cartTrigger-trigger-3Ke cartTrigger-trigger-2w8 clickable-root-2gB\"]"));
		basket.click();
		WebElement no_of_items = driver.findElement(By.xpath("//span[@class=\"miniCart-quantity-3g8\"]"));
		String no_of_item = no_of_items.getText();
		assertTrue(no_of_item.contains("1 item"));
	}
	
	
}



