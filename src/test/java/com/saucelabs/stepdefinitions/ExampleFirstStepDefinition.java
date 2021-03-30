package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleFirstStepDefinition {
    // ^ -- means we are searching starting with that specific thing
    // $ -- means we are searching ending with that specific thing

    @Given("This is given {int}")
    public void method1(){

        System.out.println("This is given method1");
    }

    @When("This is {string}")
    public void method2(){
        System.out.println("This is given method2");
    }

    @Then("This is then")
    public void method3(){

        System.out.println("This is given method3");
    }
}
