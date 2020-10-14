import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"C:/VHATechChallenge/VHATechCHallenge/CoVidGame/src/test/resources/features/Regression/Components/PublicPlace/PublicPlaceBattlefield.feature"},
plugin = {"json:C:/VHATechChallenge/VHATechCHallenge/CoVidGame/target/cucumber-parallel/4.json"},
monochrome = false,
tags = {},
glue = {"DTM.steps"})
public class Parallel04IT {
}