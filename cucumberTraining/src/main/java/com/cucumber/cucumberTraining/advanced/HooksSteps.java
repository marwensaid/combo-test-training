package com.cucumber.cucumberTraining.advanced;// HooksSteps.java
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HooksSteps {

    @Before("@hooks")
    public void beforeScenario() {
        // Code to run before the scenario
        System.out.println("Before Scenario: Setting up the environment");
    }

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        // Implementation to navigate to the home page
        System.out.println("Given: Navigating to the home page");
    }

    @When("the user performs some actions")
    public void the_user_performs_some_actions() {
        // Implementation of actions
        System.out.println("When: Performing some actions");
    }

    @Then("the actions should be completed successfully")
    public void the_actions_should_be_completed_successfully() {
        // Implementation to verify successful completion
        System.out.println("Then: Actions completed successfully");
    }

    @After("@hooks")
    public void afterScenario() {
        // Code to run after the scenario
        System.out.println("After Scenario: Cleaning up the environment");
    }
}
