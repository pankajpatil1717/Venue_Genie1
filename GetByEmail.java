package SteapDefination;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByEmail {
	Response res;
	ValidatableResponse validate;
	
	@When("User is able to get single data with the help of using api is {string}")
	public void user_is_able_to_get_single_data_with_the_help_of_using_api_is(String ur1) {
		 res =RestAssured.get(ur1);
	    
	}

	@Then("User is checks whether the status code as {int}")
	public void user_is_checks_whether_the_status_code_as(Integer int1) {
		validate=res.then();
		validate.assertThat().statusCode(200);
		validate.log().all();
	    
	}

}
