package com.cucumber.cucumberTraining;// RunCucumberTest.java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.cucumber.cucumberTraining",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
