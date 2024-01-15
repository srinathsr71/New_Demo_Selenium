package practice;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class airline {
	public String url="https://api.instantwebtools.net";
	
	@Test(enabled=false)
	public void getairlineslist() {
		RestAssured.baseURI=url;
		given().get("/v1/airlines").then().statusCode(200).log().all();
		
		
	}
	@Test(enabled=true)
	public void getallpassengerlist() {
		RestAssured.baseURI=url;
		given().get("/v1/passenger?page=0&size=10").then().statusCode(200).log().all();
		
		
	}

//	@Test
//	public void getonepassengerbyid() {
//		
//	}
}
