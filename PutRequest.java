package Allmethod;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;



public class PutRequest {
	
	@Test
	
	public void putRequest() {
		JSONObject obj2 =new JSONObject();
		obj2.put("email", "qgrrwgarfawr@gmail.com");
		 obj2.put( "id", 22);
		 obj2.put( "idNumber", "sfvsfpam124235");
		 obj2.put( "idProof", "sfvgsamp567");
		  obj2.put("name", "vsvgpatilaaw");
		  obj2.put("otp", 0);
		 obj2.put("password", "sgvssapodja");
		  obj2.put("phone", "9883375544");
		  
		  given()
		  .contentType(ContentType.JSON)
		  .body(obj2)
		  .when()
		  .put("http://localhost:8080/customers")
		  .then()
		  .log().all()
		  .assertThat().statusCode(200)
		  .assertThat().contentType(ContentType.JSON);
		  
	}

}