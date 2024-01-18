package com.cucumber.cucumberTraining.advanced;// RestAssuredSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestAssuredSteps {

    private Response response;

    @Given("the user has a valid API key")
    public void the_user_has_a_valid_api_key() {
        // Implementation to set up authentication or API key
    }

    @When("the user makes a GET request to the API")
    public void the_user_makes_a_get_request_to_the_api() {
        this.response = get("https://api.example.com/data");
    }

    @Then("the API should respond with status code {int}")
    public void the_api_should_respond_with_status_code(Integer expectedStatusCode) {
        this.response.then().statusCode(expectedStatusCode);
    }
}
