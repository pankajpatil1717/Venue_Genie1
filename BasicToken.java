package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicToken {
	@
	Test
	public void basicToken() {
	baseURI ="https://github.com";
	
	given().auth().basic("apupatil1717@gmail.com","pankajpatil@1717");
	when().get("/login")
	.then().log().all();
	}

}
