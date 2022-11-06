package Allmethod;





import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class GetById {
	@Test
	public void getById() 
	{
		RestAssured.when()
		.get("http://localhost:8080/customers/22")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.and()
		.log().all();
	}


}










