package com.testtraining.testtraining.selenium;// SeleniumTestWithTestNG.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestWithTestNG {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/marwen/Downloads/chromedriver");
        this.driver = new ChromeDriver();
    }

    @Test
    public void testScenarioWithTestNG() {
        this.driver.get("https://example.com");

        WebElement searchInput = this.driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.submit();

        WebElement resultElement = this.driver.findElement(By.cssSelector("h3"));
        String resultText = resultElement.getText();

        Assert.assertTrue(resultText.contains("Selenium"), "Expected result contains 'Selenium', but got: " + resultText);
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
