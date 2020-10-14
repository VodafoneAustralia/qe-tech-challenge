package StepDefinitionPages.steps.components.QuestionnairePageComponent;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Questionnaire_Component {

    @Steps
    public EndUserSteps Superhero;

    @And("^starts the questionnaire$")
    public void startsTheQuestionnaire() {
//        Superhero.del();
        Superhero.startQuestionnaire();

    }

    @When("^the questions are successfully attacked one at a time until the end \"([^\"]*)\"$")
    public void theQuestionsAreSuccessfullyAttackedOneAtATimeUntilTheEnd(String type)  {
        Superhero.solveQuestionnaire(type);

    }
}
