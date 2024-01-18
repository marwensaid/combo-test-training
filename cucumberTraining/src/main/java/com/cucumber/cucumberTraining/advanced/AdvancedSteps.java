package com.cucumber.cucumberTraining.advanced;// AdvancedSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class AdvancedSteps {

    @Given("the user is on the profile page")
    public void the_user_is_on_the_profile_page() {
        // Implementation to navigate to the profile page
    }

    @When("the user updates their profile with the following information")
    public void the_user_updates_their_profile_with_the_following_information(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

        // Access data using indices (0-based)
        String firstName = data.get(1).get(1);
        String lastName = data.get(2).get(1);

        // Implementation to update the user profile with the provided information
    }

    @Then("the profile should be updated successfully")
    public void the_profile_should_be_updated_successfully() {
        // Implementation to verify the profile update
    }
}
