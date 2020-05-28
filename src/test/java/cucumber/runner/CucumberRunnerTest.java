package cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import capabilities.DriverFactoryManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,
        features = "features",
        glue = "StepsDefinitions",
        tags = {"@teste","~@unit", "~@notIntegrated"},
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty"})

public class CucumberRunnerTest {

    @BeforeClass
    public static void tearUp() {
//        DriverFactoryManager.appiumServerUp();
        DriverFactoryManager.startDriverByMavenParameter(System.getProperty("environment"));
    }

    @AfterClass
    public static void tearDown() {
//        DriverFactoryManager.appiumServerDown();
        DriverFactoryManager.quitDriver();
    }

}