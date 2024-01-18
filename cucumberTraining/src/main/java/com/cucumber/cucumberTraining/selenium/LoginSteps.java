package com.cucumber.cucumberTraining.selenium;// LoginSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/marwen/Downloads/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.get("https://example.com/login");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        WebElement usernameInput = this.driver.findElement(By.id("username"));
        WebElement passwordInput = this.driver.findElement(By.id("password"));

        usernameInput.sendKeys("user123");
        passwordInput.sendKeys("password123");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        WebElement loginButton = this.driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        String currentUrl = this.driver.getCurrentUrl();
        assertEquals("https://example.com/dashboard", currentUrl);

        // Close the browser
        this.driver.quit();
    }
}
