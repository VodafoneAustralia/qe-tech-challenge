import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"C:/VHATechChallenge/VHATechCHallenge/CoVidGame/src/test/resources/features/Regression/Components/Game/AreYouGameBattlefield.feature"},
plugin = {"json:C:/VHATechChallenge/VHATechCHallenge/CoVidGame/target/cucumber-parallel/1.json"},
monochrome = false,
tags = {},
glue = {"DTM.steps"})
public class Parallel01IT {
}