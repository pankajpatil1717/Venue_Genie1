package SteapDefination;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByEmailOtp {
	Response res;
	ValidatableResponse validate;

@When("User want to read the data by using the URI as {string}")
public void user_want_to_read_the_data_by_using_the_uri_as(String ur2) {
	 res =RestAssured.get(ur2);
}

@Then("User want to verify the  status code as {int}")
public void user_want_to_verify_the_status_code_as(Integer int2) {
	validate=res.then();
	validate.assertThat().statusCode(200);
	validate.log().all();
    
}
	    
	}


