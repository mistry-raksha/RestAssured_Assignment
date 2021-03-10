package com.stepGeneratorclass;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class Bdd_assi6 extends Commonsteps {


@Given("user open wrong url")
public void user_open_wrong_url() {
    // Write code here that turns the phrase above into concrete actions
	response=RestAssured.given().when().log().all().get("https://ratesapi.io/api/");
}

@When("store response into object")
public void store_response_into_object() {
    // Write code here that turns the phrase above into concrete actions
	response_rec=response.getStatusCode();
	response.prettyPrint();
	System.out.println(response_rec+" is Status Code");
}

@Then("assert the response")
public void assert_the_response() {
    // Write code here that turns the phrase above into concrete actions
	
	Assert.assertNotEquals(response_rec /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	Assert.assertEquals(response_rec /*actual value*/, 404 /*expected value*/, "Correct status code returned");
	
}

}
