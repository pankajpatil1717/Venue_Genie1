package authentication;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;




public class BearerToken {
	
	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		JSONObject obj = new JSONObject();
		obj.put("name", "Venue_Genie1");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
	}


