package com.cucumber.cucumberTraining.calculator;// CalculatorSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number) {
        if (this.firstNumber == 0) {
            this.firstNumber = number;
        } else {
            this.secondNumber = number;
        }
    }

    @When("I press add")
    public void i_press_add() {
        this.result = this.firstNumber + this.secondNumber;
    }

    @When("I press subtract")
    public void i_press_subtract() {
        this.result = this.firstNumber - this.secondNumber;
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedResult) {
        assertEquals(expectedResult, this.result);
    }
}
