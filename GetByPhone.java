package SteapDefination;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByPhone {
	Response res;
	ValidatableResponse validate;
	@When("User want to fetch data by using URI as {string}")
	public void user_want_to_fetch_data_by_using_uri_as(String ur2) {
		 res =RestAssured.get(ur2);
	    
	}

	@Then("User want to verify the status code as {int}")
	public void user_want_to_verify_the_status_code_as(Integer int1) {
		validate=res.then();
		validate.assertThat().statusCode(500);
		validate.log().all(); 
	}

}
