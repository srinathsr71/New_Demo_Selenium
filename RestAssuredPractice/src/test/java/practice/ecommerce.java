package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ecommerce {
	public static String Url="http://216.10.245.166";
	//public static String accesstoken;
	
	@Test
	public void addapi() {
		RestAssured.baseURI=Url;
		String sk="{\r\n"
				+ "\r\n"
				+ "    \"location\":{\r\n"
				+ "\r\n"
				+ "        \"lat\" : -38.383494,\r\n"
				+ "\r\n"
				+ "        \"lng\" : 33.427362\r\n"
				+ "\r\n"
				+ "    },\r\n"
				+ "\r\n"
				+ "    \"accuracy\":50,\r\n"
				+ "\r\n"
				+ "    \"name\":\"Frontline house\",\r\n"
				+ "\r\n"
				+ "    \"phone_number\":\"(+91) 983 893 3937\",\r\n"
				+ "\r\n"
				+ "    \"address\" : \"29, side layout, cohen 09\",\r\n"
				+ "\r\n"
				+ "    \"types\": [\"shoe park\",\"shop\"],\r\n"
				+ "\r\n"
				+ "    \"website\" : \"http://google.com\",\r\n"
				+ "\r\n"
				+ "    \"language\" : \"French-IN\"\r\n"
				+ "\r\n"
				+ "}\r\n";

	}
}
