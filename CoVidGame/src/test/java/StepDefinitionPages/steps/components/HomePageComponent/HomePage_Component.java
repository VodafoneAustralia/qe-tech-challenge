package StepDefinitionPages.steps.components.HomePageComponent;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class HomePage_Component {

    @Steps
    public EndUserSteps Superhero;


    @Given("^\"([^\"]*)\" has navigated to the webApp$")
    public void hasNavigatedToTheWebApp(String superhero)  {
        Superhero.navigatesToHomePage();


    }

    @And("^enters his/her warrior name as \"([^\"]*)\" and starts the journey$")
    public void entersHisHerWarriorNameAsAndStartsTheJourney(String name)  {
        Superhero.entersWarriorName(name);
        Superhero.startsJourney(name);
    }
}

