package practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class upskills1 {
	
	public static String baseurl="http://rest-api.upskills.in/";
	public static String accesstoken;
	
	
	
@Test(enabled=true)
public void getaccesstoken() {
	RestAssured.baseURI=baseurl;
	Response res=given().header("Content-Type","application/json")
			.header("Authorization","Basic c2hvcHBpbmdfb2F1dGhfY2xpZW50OnNob3BwaW5nX29hdXRoX3NlY3JldA==")
			.when().post("api/rest/oauth2/token/client_credentials")
			.then().contentType(ContentType.JSON).extract().response();	
	
	String jsonresponse=res.asString();
	System.out.println(jsonresponse);
	JsonPath jsu=new JsonPath(jsonresponse);
	accesstoken=jsu.getString("data.access_token");
	System.out.println(accesstoken);
			
	
}

@Test(enabled=false)
public void register() {
	RestAssured.baseURI=baseurl;
	String reqbody="{\r\n"
			+ "  \"firstname\": \"Demo\",\r\n"
			+ "  \"lastname\": \"User\",\r\n"
			+ "  \"email\": \"srinath@gmail.com\",\r\n"
			+ "  \"password\": \"demo\",\r\n"
			+ "  \"confirm\": \"demo\",\r\n"
			+ "  \"telephone\": \"1-541-754-3010\",\r\n"
			+ "  \"customer_group_id\": \"1\",\r\n"
			+ "  \"agree\": \"1\",\r\n"
			+ "  \"custom_field\": {\r\n"
			+ "    \"account\": {\r\n"
			+ "      \"1\": \"+364545454\"\r\n"
			+ "    }\r\n"
			+ "  }\r\n"
			+ "}\r\n";
	
	Response reg=given().header("Content-Type","application/json")
			.header("Authorization","bearer"+accesstoken).body(reqbody).when().post("api/rest/register").then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).extract().response();
	
		String response=reg.asString();
		System.out.println(response);
		
}

@Test(enabled=false)
public void forgotpassword() {
	RestAssured.baseURI=baseurl;
	String reqb="{\r\n"
			+ "  \"email\": \"srinath@gmail.com\"\r\n"
			+ "}\r\n";
	
	Response ty=given().header("Content-Type","application/json").header("Authorization","bearer"+accesstoken)
				.body(reqb).when().post("api/rest/forgotten").then().contentType(ContentType.JSON).assertThat().statusCode(200)
				.extract().response();
	String response=ty.asString();
	System.out.println(response);
}


@Test(enabled=false)
public void login() {
	RestAssured.baseURI=baseurl;
	String loginreq="{\r\n"
			+ "  \"email\": \"srinath@gmail.com\",\r\n"
			+ "  \"password\": \"demo\"\r\n"
			+ "}\r\n";
	
	Response rth=given().header("Content-Type","application/json").header("Authorization","bearer"+accesstoken)
			.body(loginreq).when().post("api/rest/login").then().contentType(ContentType.JSON).assertThat().statusCode(200)
			.extract().response();
	
		String response=rth.asString();
		System.out.println(response);	
}


@Test(enabled=false)
public void getaccountdetails() {
	RestAssured.baseURI=baseurl;
	Response th=given().header("Content-Type","application/json").header("Authorization","bearer"+accesstoken)
			.when().get("api/rest/account").then().assertThat().statusCode(200).extract().response();
	String respose=th.asString();
	System.out.println(respose);
	
}

@Test(enabled=false)
public void updateaccountdetails() {
	RestAssured.baseURI=baseurl;
	String updatebody="{\r\n"
			+ "  \"firstname\": \"Demo\",\r\n"
			+ "  \"lastname\": \"User\",\r\n"
			+ "  \"email\": \"nash1@vipmail.hu\",\r\n"
			+ "  \"telephone\": \"1-541-754-3010\",\r\n"
			+ "  \"custom_field\": {\r\n"
			+ "    \"account\": {\r\n"
			+ "      \"1\": \"+364545454\"\r\n"
			+ "    }\r\n"
			+ "  }\r\n"
			+ "}\r\n";
	
	Response up=given().header("Content-Type","application/json").header("Authorization","bearer"+accesstoken)
			.body(updatebody).when().put("api/rest/account").then().contentType(ContentType.JSON).assertThat().statusCode(200)	
			.extract().response();
	
	String sk=up.asString();
	System.out.println(sk);
	
	
}



@Test(enabled=false)
public void logout() {
	
	RestAssured.baseURI=baseurl;
	Response kl=given().header("Content-Type","application/json").header("Authorization","bearer"+accesstoken)
			.when().post("api/rest/logout").then().assertThat().statusCode(200).extract().response();
	String iu=kl.asString();
	System.out.println(iu);
	
}





















}


