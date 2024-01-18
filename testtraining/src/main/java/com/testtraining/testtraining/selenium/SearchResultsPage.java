package com.testtraining.testtraining.selenium;// SearchResultsPage.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isResultPresent(String keyword) {
        WebElement resultElement = this.driver.findElement(By.cssSelector("h3"));
        return resultElement.getText().contains(keyword);
    }
}
