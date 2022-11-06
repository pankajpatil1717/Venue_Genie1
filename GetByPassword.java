package Allmethod;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;






public class GetByPassword {
	@Test
	public void getPassword() 
	{
		RestAssured.when()
		.get("http://localhost:8080/customers/email/pasfspasa@gmail.com/password/ADC123")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(404)
		.and()
		.log().all();
	}

}


