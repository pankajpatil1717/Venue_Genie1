package SteapDefination;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByEmailPassword {
	Response res;
	ValidatableResponse validate;
	
	@When("User is able to get  data with the help of using api is {string}")
	public void user_is_able_to_get_data_with_the_help_of_using_api_is(String ur2) {
		res =RestAssured.get(ur2);
	}

	@Then("User Verify the status code as {int}")
	public void user_verify_the_status_code_as(Integer int1) {
		validate=res.then();
		validate.assertThat().statusCode(404);
		validate.log().all();
	}

}
