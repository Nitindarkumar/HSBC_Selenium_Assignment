package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.*;

public class StepDefination1 {
	
	Response r;
	
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	  
		System.out.println("given API");
	}

	@When("posted with correct Information")
	public void posted_with_correct_Information() {
	    r = RestAssured.given().when().get("https://api.ratesapi.io/api/latest");
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	   Assert.assertEquals(200,r.getStatusCode());
	   System.out.println(r.asString());
	}
}
