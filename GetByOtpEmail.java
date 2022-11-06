package Allmethod;

import static io.restassured.RestAssured.*;



import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;





public class GetByOtpEmail {
	@Test
	public void getByOtpEmail() 
	{
		RestAssured.when()
		.get("http://localhost:8080/customers/email/asdoiyt@1098gmail.com")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.and()
		.log().all();
	}


}
