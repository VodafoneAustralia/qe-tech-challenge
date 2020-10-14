package StepDefinitionPages.steps.serenity;

//import StepDefinitionPages.Common_methods.Common_methods;
import StepDefinitionPages.pages.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class EndUserSteps {

    QuestionnairePage questionnairepage;
    HomePage homepage;
    BattlefieldPage battlefieldPage;
    CommonMethodsPage commonMethodsPage;




    public void navigatesToHomePage() {
        homepage.open();
        getDriver().manage().window().maximize();

    }

    public void entersWarriorName(String name) {
        homepage.enterWarriorNameInTextBox(name);
    }


    public void startsJourney(String name) {
        homepage.clickOnStartYourJourneyButton(name);
    }

    public void selectsBattlefield(String fieldType) {
        battlefieldPage.selectBattledfield(fieldType);
    }

    public void startQuestionnaire() {
        commonMethodsPage.clickOnStartButtonOnPopup();
    }

    public void solveQuestionnaire(String type) {
        questionnairepage.solveQuestionnaireFor(type);
    }
}

