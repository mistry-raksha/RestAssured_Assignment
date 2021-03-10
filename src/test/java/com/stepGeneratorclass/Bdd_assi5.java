package com.stepGeneratorclass;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Bdd_assi5 extends Commonsteps {
	
	@Given("click on wrong url")
	public void click_on_wrong_url() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.given().when().log().all().get("https://ratesapi.io/api/");
	}

	@When("store response in res obj")
	public void store_response_in_res_obj() {
	    // Write code here that turns the phrase above into concrete actions
		response_rec=response.getStatusCode();
		response.prettyPrint();
		System.out.println(response_rec+" is Status Code");
	}

	@Then("validate the response")
	public void validate_the_response() {
	    // Write code here that turns the phrase above into concrete actions
		if(response_rec==200)
		{
			JsonPath jsonpatheval=response.jsonPath();
			HashMap<String, Integer> name=jsonpatheval.get("rates");
			System.out.println(name.get("GBP"));

			System.out.println("Response Received");
		}
		else
		{
			System.out.println("error occured");
		}
	}


}
