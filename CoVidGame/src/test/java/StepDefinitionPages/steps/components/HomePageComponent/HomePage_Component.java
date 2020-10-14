package StepDefinitionPages.steps.components.HomePageComponent;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomePage_Component {

    @Steps
    public EndUserSteps Superhero;

//  To navigate to the homepage
    @Given("^\"([^\"]*)\" has navigated to the webApp$")
    public void hasNavigatedToTheWebApp(String superhero)  {
        Superhero.navigatesToHomePage();

    }

//  To enter warrior name and start the journey
    @And("^enters his/her warrior name as \"([^\"]*)\" and starts the journey$")
    public void entersHisHerWarriorNameAsAndStartsTheJourney(String name)  {
        Superhero.entersWarriorName(name);
        Superhero.startsJourney(name);
    }
}