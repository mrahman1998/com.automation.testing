package restAssured;
import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

public class Test {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		System.out.println("****POST RESPONSE****");
		String postResponse = given().log().all().queryParam("key", "qaclick123").body("{\r\n"
		 		+ "  \"location\": {\r\n"
		 		+ "    \"lat\": -38.383494,\r\n"
		 		+ "    \"lng\": 33.427362\r\n"
		 		+ "  },\r\n"
		 		+ "  \"accuracy\": 50,\r\n"
		 		+ "  \"name\": \"Frontline house\",\r\n"
		 		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
		 		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
		 		+ "  \"types\": [\r\n"
		 		+ "    \"shoe park\",\r\n"
		 		+ "    \"shop\"\r\n"
		 		+ "  ],\r\n"
		 		+ "  \"website\": \"http://google.com\",\r\n"
		 		+ "  \"language\": \"French-IN\"\r\n"
		 		+ "}").when().post("maps/api/place/add/json").then().log().
				all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(postResponse);
		String placeId = js.getString("place_id");
		
		System.out.println("");
		System.out.println("****GET RESPONSE****");
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).when().
		get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("");
		System.out.println("****PUT RESPONSE****");
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).body("{\r\n"
				+ "    \"place_id\": \""+placeId+"\",\r\n"
				+ "    \"address\": \"71 winter walk, USA\",\r\n"
				+ "    \"key\": \"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").then().log().all().
		assertThat().statusCode(200);
		
		System.out.println("");
		System.out.println("****DELETE RESPONSE****"); 
		given().log().all().queryParam("key", "qaclick123").body("{\r\n"
				+ "\r\n"
				+ "    \"place_id\":\""+placeId+"\"\r\n"
				+ "}").when().delete("maps/api/place/delete/json").then().log().all().assertThat().statusCode(200).body("status", equalTo("OK"));
		
	}

}
