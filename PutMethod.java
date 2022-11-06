package SteapDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class PutMethod {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

	@Given("user want to update the new datas")
	public void user_want_to_update_the_new_datas() {
		JSONObject obj = new JSONObject();
		obj.put("email", "pasfspasa@gmail.com");
		  obj.put("id", 79);
		  obj.put("idNumber", "ppp3aad55");
		  obj.put("idProof", "5366poi");
		  obj.put("name", "saadal");
		  obj.put("otp", 45);
		  obj.put("password", "ppsppp");
		  obj.put("phone",30033333);
		  
		  req=RestAssured.given();
		  req.body(obj);
		  req.contentType(ContentType.JSON);
	    
	}

	@When("user want to update the datas using api {string}")
	public void user_want_to_update_the_datas_using_api(String ur1) {
		res=req.put(ur1);
	    
	}

	@Then("user verify the Status code is {int}")
	public void user_verify_the_status_code_is(Integer int1) {
		validate=res.then();
		validate.assertThat().statusCode(int1);
		validate.log().all();
	    
	}

}
