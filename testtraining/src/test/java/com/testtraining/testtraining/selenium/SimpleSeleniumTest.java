package com.testtraining.testtraining.selenium;// SimpleSeleniumTest.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/marwen/Downloads/chromedriver");
        this.driver = new ChromeDriver();
    }

    @Test
    public void testSimpleScenario() {
        // Accéder à la page web
        this.driver.get("https://google.com");

        // Remplir un formulaire
        WebElement searchInput = this.driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");

        // Cliquer sur le bouton de recherche
        searchInput.submit();

        // Vérifier un élément sur la page résultante
        WebElement resultElement = this.driver.findElement(By.cssSelector("h3"));
        assert resultElement.getText().contains("Selenium");
    }

    @AfterClass
    public void tearDown() {
        // Fermer le navigateur à la fin du test
        this.driver.quit();
    }
}
