package MasterRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/feature", // Path to your separate feature files
    glue = "stepdefinitions",                // Path to your separated step definitions
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        // This line enables the Extent Reports you added to your POM
    },
    monochrome = true,
    publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    
}