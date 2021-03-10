package com.testngRunnerClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue={"com.stepGeneratorclass"}
		
		//tags={"@assi9"} //tag of feature file you want to run
				
		)
@Test
public class TestngRunnerClass extends AbstractTestNGCucumberTests {
	
	public void f() {
		Reporter.log("this is string");
		}
	
	
 
	    
}



