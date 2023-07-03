package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driver.DriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.Util;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@HappyPath",
        plugin = {"pretty",
                "json:target/cucumber.json"
        },
        monochrome = true)
public class TestRunner {

    @BeforeClass
    public static void start() throws IOException {
        DriverManager.instanceGet().driverInitialize(Util.getOrangeHRM());
    }

    @AfterClass
    public static void end() {
        DriverManager.instanceGet().driverClose();
    }
}
