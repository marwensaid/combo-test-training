package com.cucumber.cucumberTraining.selenium;// ShoppingCartSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class ShoppingCartSteps {

    private WebDriver driver;

    @Given("the user is on the product page")
    public void the_user_is_on_the_product_page() {
        System.setProperty("webdriver.chrome.driver", "chemin/vers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://example.com/products/123");
    }

    @When("the user adds an item to the cart")
    public void the_user_adds_an_item_to_the_cart() {
        WebElement addToCartButton = this.driver.findElement(By.id("addToCartButton"));
        addToCartButton.click();
    }

    @Then("the item should appear in the cart")
    public void the_item_should_appear_in_the_cart() {
        WebElement cartIcon = this.driver.findElement(By.id("cartIcon"));
        assertTrue(cartIcon.isDisplayed());

        // Close the browser
        this.driver.quit();
    }
}
