package Allmethod;
import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;



public class PostRequest {
	RequestSpecification req;
	Response resp;
	
  @Test

   public void postRequest() {
	  
	  JSONObject obj = new JSONObject();   
	  obj.put("email", "asdoiyt@1098gmail.com");
	  obj.put("id", 22);
	  obj.put("idNumber", "AAPavan");
	  obj.put("idProof", "86");
	  obj.put("name", "ASSstring");
	  obj.put("otp", 7386);
	  obj.put("password", "ADC123");
	  obj.put("phone", "2928454892");
	  
	given()
	.contentType(ContentType.JSON)
	.body(obj)
	.when().post("http://localhost:8080/customers")
	.then()

	.assertThat().statusCode(201)
	.log().all();
	  
	  
  }
	

}
