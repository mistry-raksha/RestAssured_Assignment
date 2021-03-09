package com.stepGeneratorclass;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Framework {
	Response response;
	int response_rec;
	@Given("User click on link")
	public void user_click_on_link() {
	     // Write code here that turns the phrase above into concrete actions
		response=RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/latest?symbols=USD,GBP");
		
			
	}

	@When("response recieved")
	public void response_recieved() {
	    // Write code here that turns the phrase above into concrete actions
		response_rec=response.getStatusCode();
		response.prettyPrint();
		System.out.println(response_rec+" is Status Code");
	    
	}

	@Then("validate response")
	public void validate_response() {
	    // Write code here that turns the phrase above into concrete actions
		if(response_rec==200)
		{
			JsonPath jsonpatheval=response.jsonPath();
			HashMap<String, Integer> name=jsonpatheval.get("rates");
			System.out.println(name.get("USD"));
			System.out.println("Response Received");
		}
		else
		{
			System.out.println("error occured");
		}
		
		
		
		
	}


}
