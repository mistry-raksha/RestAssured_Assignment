package com.stepGeneratorclass;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;


public class Bdd_assi7 extends Commonsteps{

@Given("user open link with future date")
public void user_open_link_with_future_date() {
    // Write code here that turns the phrase above into concrete actions
	response=RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/2021-03-12");
}

@When("response store to object")
public void response_store_to_object() {
    // Write code here that turns the phrase above into concrete actions
	response_rec=response.getStatusCode();
	response.prettyPrint();
	System.out.println(response_rec+" is Status Code");
}

@Then("validate date")
public void validate_date() {
    // Write code here that turns the phrase above into concrete actions
	if(response_rec==200)
	{
		
		System.out.println("Response Received");
	}
	else
	{
		System.out.println("Error occured , Status Code is not 200");
	}
	
	
}

}
