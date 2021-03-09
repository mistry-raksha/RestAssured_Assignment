package com.stepGeneratorclass;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;


public class Bdd_assi4 extends Commonsteps{
	
	@Given("open the link")
	public void open_the_link() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/latest?symbols=GBP");
		
	}

	@When("response store in obj")
	public void response_store_in_obj() {
	    // Write code here that turns the phrase above into concrete actions
		response_rec=response.getStatusCode();
		response.prettyPrint();
		System.out.println(response_rec+" is Status Code");
	    
	}

	@Then("validate response status code using assertion")
	public void validate_response_status_code_using_assertion() {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(response_rec /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		Assert.assertEquals(response_rec /*actual value*/, 400 /*expected value*/, "Correct status code returned");
		 
	   
	}


}
