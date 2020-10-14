package StepDefinitionPages.steps.components.QuestionnairePageComponent;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Questionnaire_Component {

    @Steps
    public EndUserSteps Superhero;

//  Start the selected battlefield
    @And("^starts the questionnaire$")
    public void startsTheQuestionnaire() {
        Superhero.startQuestionnaire();
    }

//  Go through all the questionnaires and mark the correct answer
    @When("^the questions are successfully attacked one at a time until the end \"([^\"]*)\"$")
    public void theQuestionsAreSuccessfullyAttackedOneAtATimeUntilTheEnd(String type)  {
        Superhero.solveQuestionnaire(type);
    }
}
