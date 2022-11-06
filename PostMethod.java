package SteapDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMethod {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

	

@Given("as a user wanT to pass the data into database")
public void as_a_user_wan_t_to_pass_the_data_into_database() 
{
	JSONObject obj = new JSONObject();
	obj.put("email", "pppppp@gmail.com");
	  obj.put("id", 0);
	  obj.put("idNumber", "ppp3455");
	  obj.put("idProof", "536356xx");
	  obj.put("name", "spatil");
	  obj.put("otp", 0);
	  obj.put("password", "pppppp");
	  obj.put("phone",3333333);
	  req=RestAssured.given();
	  req.body(obj);
	  req.contentType(ContentType.JSON);
    
}

@When("as a user wanT to give the data using URI {string}")
public void as_a_user_wan_t_to_give_the_data_using_uri(String ur1) {
	res=req.post(ur1);
    
}

@Then("as a user wanT to Check the Status code {int}")
public void as_a_user_wan_t_to_check_the_status_code(Integer int1) {
	validate=res.then();
	validate.assertThat().statusCode(int1);
	validate.log().all();
    
    
}
}
