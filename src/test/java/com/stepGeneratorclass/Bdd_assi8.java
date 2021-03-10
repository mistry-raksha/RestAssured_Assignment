package com.stepGeneratorclass;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class Bdd_assi8 extends Commonsteps{
	
	@Given("click link with future date")
	public void click_link_with_future_date() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/2021-03-12");
	}

	@When("store status code in response obj")
	public void store_status_code_in_response_obj() {
	    // Write code here that turns the phrase above into concrete actions
		response_rec=response.getStatusCode();
		response.prettyPrint();
		System.out.println(response_rec+" is Status Code");

	}

	@Then("assert the response code")
	public void assert_the_response_code() {
	    // Write code here that turns the phrase above into concrete actions
				
		Assert.assertEquals(response_rec /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		Assert.assertNotEquals(response_rec /*actual value*/, 400 /*expected value*/, "Correct status code returned");
	
	}

}
