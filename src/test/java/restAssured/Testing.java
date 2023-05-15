package restAssured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.path.json.JsonPath;

public class Testing {
	
	static String response = "{\r\n"
			+ "	\"dashboard\": {\r\n"
			+ "		\"purchaseAmount\": 910,\r\n"
			+ "		\"website\": \"rahulshettyacademy.com\"\r\n"
			+ "	},\r\n"
			+ "	\"courses\": [\r\n"
			+ "		{\r\n"
			+ "			\"title\": \"Selenium Python\",\r\n"
			+ "			\"price\": 50,\r\n"
			+ "			\"copies\": 6\r\n"
			+ "		},\r\n"
			+ "		{\r\n"
			+ "			\"title\": \"Cypress\",\r\n"
			+ "			\"price\": 40,\r\n"
			+ "			\"copies\": 4\r\n"
			+ "		},\r\n"
			+ "		{\r\n"
			+ "			\"title\": \"RPA\",\r\n"
			+ "			\"price\": 45,\r\n"
			+ "			\"copies\": 10\r\n"
			+ "		}\r\n"
			+ "	]\r\n"
			+ "}";
	public static void main(String[] args) {
		
		
		JsonPath js = new JsonPath(response);
		int totalCourses = js.getInt("courses.size()");
		System.out.println("Number of courses: "+totalCourses);
		
		System.out.println("Purchase Amount: "+js.getInt("dashboard.purchaseAmount"));
		
		System.out.println("Title of the first course: "+js.getString("courses[0].title"));
		
		for(int i=0 ; i<totalCourses; i++) {
			System.out.println("\nTitle of the course: "+js.getString("courses["+i+"].title"));
			System.out.println("Price of the course: "+js.getInt("courses["+i+"].price"));
		}
		
		for(int i=0 ; i<totalCourses; i++) {
			String title=js.getString("courses["+i+"].title");
			if(title.equals("RPA")) {
				System.out.println("\nCopies of RPA course: "+js.getInt("courses["+i+"].copies"));
			}
		}
		
		int totalPrice = 0;
		for(int i=0 ; i<totalCourses; i++) {
			
			int price=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
			price=price*copies;
			totalPrice=totalPrice+price;
		}
		
		int purchaseAmount=js.getInt("dashboard.purchaseAmount");
		
		if(purchaseAmount==totalPrice) {
			System.out.println("\nCourse prices matches with purchase amount");
		}
		
		else {
			System.out.println("\nCourse prices does not match with purchase amount");
		}
		
		
		
	}

}
