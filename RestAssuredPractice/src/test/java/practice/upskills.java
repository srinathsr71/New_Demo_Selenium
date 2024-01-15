package practice;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuthSignature;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class upskills {
public static String url="http://rest-api.upskills.in";
	
	public String token;//"29df6371a20d22cd9ec13bcb6b5ca1ecd3b43544";
	
	
	@Test(enabled=true)
	public void getAccesstoken()
	{
		
		
		JSONObject jy=new JSONObject();
		RestAssured.baseURI=url;
		Response R=RestAssured.given()
				 .header("Authorization", "Basic "+"c2hvcHBpbmdfb2F1dGhfY2xpZW50OnNob3BwaW5nX29hdXRoX3NlY3JldA==")
				 .contentType(ContentType.JSON).accept(ContentType.JSON).body(jy.toJSONString()).
	            post("/api/rest/oauth2/token/client_credentials").then().extract().response();
		
		String resbody=R.getBody().asString();
		
		System.out.println(resbody);
		
		JsonPath js = new JsonPath(resbody);
		 token = js.getString("data.access_token");
		System.out.println(token);
		
		
	}

	
	
	@Test(enabled=false)
	public void register()
	{
		
		
		RestAssured.baseURI=url;
		
		
//		JSONObject js=new JSONObject();
//		
//		JSONArray ja=new JSONArray();
//		JSONObject jy=new JSONObject();
//				;
//		jy.put("1","+364545454");
//		ja.add(jy);
//		js.put("account",jy);
//		
//		js.put("firstname","srinath");
//		js.put("lastname","User");
//		js.put("email","sai537o@vipmail.hu");
//		js.put("password","password");
//		js.put("confirm","password");
//		js.put("telephone","1-541-754-3010");
//		js.put("customer_group_id","1");
//		js.put("agree","1");
//		
//		js.put("custom_field", jy);
		
		String reqbody="{\r\n"
				+ "  \"firstname\": \"Demo\",\r\n"
				+ "  \"lastname\": \"User\",\r\n"
				+ "  \"email\": \"nash1@vipmail.hu\",\r\n"
				+ "  \"password\": \"password\",\r\n"
				+ "  \"confirm\": \"password\",\r\n"
				+ "  \"telephone\": \"1-541-754-3010\",\r\n"
				+ "  \"customer_group_id\": \"1\",\r\n"
				+ "  \"agree\": \"1\",\r\n"
				+ "  \"custom_field\": {\r\n"
				+ "    \"account\": {\r\n"
				+ "      \"1\": \"+364545454\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}\r\n";
		
		
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(reqbody).when()
		.post("/api/rest/register").then().log().all();
		
				
	}	
	
	
	@Test(enabled=false)
	public void login() {
		
		JSONObject jk=new JSONObject();
		jk.put("email","madh5377@vipmail.hu");
		jk.put("password","password");
		
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(jk.toJSONString()).when()
		.post("/api/rest/login").then().log().all();
		
	}
	
	
	@Test(enabled=false)
	public void getaccountdetails() {
		JSONObject jk=new JSONObject();
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(jk.toJSONString()).when()
		.get("/api/rest/account").then().log().all();
	}
	
	
	
	@Test(enabled=false)
	public void Updateaccountdetails() {

			
		JSONObject jp=new JSONObject();
		
		JSONArray jl=new JSONArray();
		JSONObject jn=new JSONObject();
		jn.put("1","+364545454");
		jl.add(jn);
		jp.put("account",jn);
		
		jp.put("firstname","srinath");
		jp.put("lastname","sr");
		jp.put("email","sri5377@vipmail.hu");
		jp.put("password","password");
		jp.put("confirm","password");
		jp.put("telephone","1-541-754-3010");
		jp.put("customer_group_id","1");
		jp.put("agree","1");
		
		jp.put("custom_field", jn);
		
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(jp.toJSONString()).when()
		.put("/api/rest/account").then().log().all();
		
	}
	
	
	@Test(enabled=false)
	public void logout() {
		JSONObject jk=new JSONObject();
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(jk.toJSONString()).when()
		.post("/api/rest/logout").then().log().all();
	}
	
	
	@Test(enabled=false)
	public void Forgotpassword() {
		
		JSONObject jo=new JSONObject();
		jo.put("email","test@test.com");
		given().header("Authorization","Bearer"+token).auth().oauth2(token)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(jo.toJSONString()).when()
		.post("/api/rest/forgotten").then().log().all();
	}
	
	
	
	
	
}














