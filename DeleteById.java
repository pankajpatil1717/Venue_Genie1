package Allmethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteById {
	@Test
	
public void deleteBYID()
{
		RestAssured.when()
		.delete("http://localhost:8080/customers/115")
		
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(404)
		.and()
		.log().all();
		
}
	

}
