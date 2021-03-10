package com.testngRunnerClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue={"com.stepGeneratorclass"}
		
				
		)
@Test
public class TestngRunnerClass extends AbstractTestNGCucumberTests {
	public void f() {
		Reporter.log("this is string");
		}
	
	 
	    
}



