package SteapDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;


public class Delete {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	@When("I hit the api with delete request and end point as {string}")
	public void i_hit_the_api_with_delete_request_and_end_point_as(String deleteur1) {
	  res = when().delete(deleteur1);
	}


	@Then("User want to verify the status code as {int} and status line as {string}")
	public void user_want_to_verify_the_status_code_as_and_status_line_as(Integer int1, String string) {
	    res.then()
	    .assertThat().statusCode(404)
	    //.assertThat().statusLine("HTTP/1.1 404")
	    .log().all();
	    
	}
	
}
