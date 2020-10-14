package StepDefinitionPages;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(tags = "@scen")
//@WithTags({
//        @WithTag("scen")
//})
@CucumberOptions(features="src/test/resources/features/Regression/Components/")
//@CucumberOptions(features="src/test/resources/features/Regression/Components/", tags = {"Regression"})
//@RunWith(Cucumber.class)
//@CucumberOptions(features = { "classpath:features/*.feature" }, glue = "StepDefinitionFSO", plugin = {
//        "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
//        "junit:target/junit-report.xml", "testng:target/testng-output.xml" }, monochrome = true, tags = {"~@cleanup"})
//public class FeatureRunnerTest {
//
//}
public class DefinitionTestSuite {}
