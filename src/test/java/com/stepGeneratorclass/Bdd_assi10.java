package com.stepGeneratorclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Bdd_assi10 extends Commonsteps{
  @Test(dataProvider = "dp")
  public void f(String s) {
	  
	  response=RestAssured.get("https://api.ratesapi.io/api/"+s);
	  response_rec=response.getStatusCode();
	  Assert.assertEquals(response_rec, 200);
	  System.out.println("Response Received");
	  Reporter.log("this is string");
  }

  @DataProvider
  public Object[] dp() {
	  Object[] ob=new Object[2];
		 ob[0]="2009-04-27";
		 ob[1]="2010-03-27";
	    
		 return ob;
  }
}
