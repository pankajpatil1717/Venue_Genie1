package SteapDefination;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetById {
	
	Response res;
	ValidatableResponse validate;
	@When("User is able to get single datawith the help ofusing api is {string}")
	public void user_is_able_to_get_single_datawith_the_help_ofusing_api_is(String ur1) {
	    res =RestAssured.get(ur1);
	}

	@Then("To checking  the status code as {int}")
	public void to_checking_the_status_code_as(Integer int1) {
		validate=res.then();
		validate.assertThat().statusCode(200);
		validate.log().all();
	    
	}
	
   
}



