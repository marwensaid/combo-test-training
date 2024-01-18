package com.testtraining.testtraining.selenium;// SeleniumTestWithPOM.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestWithPOM {

    private WebDriver driver;
    private SearchResultsPage searchResultsPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/marwen/Downloads/chromedriver");
        this.driver = new ChromeDriver();
        this.searchResultsPage = new SearchResultsPage(this.driver);
    }

    @Test
    public void testScenarioWithPOM() {
        this.driver.get("https://example.com");

        WebElement searchInput = this.driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.submit();

        Assert.assertTrue(this.searchResultsPage.isResultPresent("Selenium"), "Expected result contains 'Selenium'");
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
