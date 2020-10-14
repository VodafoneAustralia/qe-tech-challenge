package StepDefinitionPages.steps.components.BattlefieldComponent;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class Battlefield_Component {
    @Steps
    public EndUserSteps Superhero;



    @And("^selects his battlefield \"([^\"]*)\"$")
    public void selectsHisBattlefield(String fieldType)  {
        Superhero.selectsBattlefield(fieldType);
    }


}