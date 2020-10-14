package StepDefinitionPages.pages;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import cucumber.api.java.en.And;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;

import static objectRepository.ObjectRepository.QuestionnairePageLocators.*;


public class QuestionnairePage extends PageObject {

    @FindBy(xpath =  YouAreAtARestaurant_xpath)
    private WebElementFacade YouAreAtARestaurantQuestion;

    @FindBy(xpath =  YouAreAtARestaurantAnswer_xpath)
    private WebElementFacade YouAreAtARestaurantAnswer;

    @FindBy(xpath =  YouHaveEnteredTheOffice_xpath)
    private WebElementFacade YouHaveEnteredTheOffice;

    @FindBy(xpath =  YouHaveEnteredTheOfficeAnswer_xpath)
    private WebElementFacade YouHaveEnteredTheOfficeAnswer;

    @FindBy(xpath =  YouHaveTakenThePublicBus_xpath)
    private WebElementFacade YouHaveTakenThePublicBus;

    @FindBy(xpath =  YouHaveTakenThePublicBusAnswer_xpath)
    private WebElementFacade YouHaveTakenThePublicBusAnswer;

    @FindBy(xpath =  YouAreSeatedAtARestaurant_xpath)
    private WebElementFacade YouAreSeatedAtARestaurant;

    @FindBy(xpath =  YouAreSeatedAtARestaurantAnswer_xpath)
    private WebElementFacade YouAreSeatedAtARestaurantAnswer;


    @FindBy(xpath =  YouHaveEnteredTheOffice2_xpath)
    private WebElementFacade YouHaveEnteredTheOffice2;

    @FindBy(xpath =  YouHaveEnteredTheOfficeAnswer2_xpath)
    private WebElementFacade YouHaveEnteredTheOfficeAnswer2;

    @FindBy(xpath =  YouHaveTakenThePublicBus2_xpath)
    private WebElementFacade YouHaveTakenThePublicBus2;

    @FindBy(xpath =  YouHaveTakenThePublicBusAnswer2_xpath)
    private WebElementFacade YouHaveTakenThePublicBusAnswer2;

    @FindBy(xpath =  YouAreSeatedAtARestaurant2_xpath)
    private WebElementFacade YouAreSeatedAtARestaurant2;

    @FindBy(xpath =  YouAreSeatedAtARestaurantAnswer2_xpath)
    private WebElementFacade YouAreSeatedAtARestaurantAnswer2;

    @FindBy(xpath =  YouHaveEnteredTheOffice3_xpath)
    private WebElementFacade YouHaveEnteredTheOffice3;

    @FindBy(xpath =  YouHaveEnteredTheOfficeAnswer3_xpath)
    private WebElementFacade YouHaveEnteredTheOfficeAnswer3;

    @FindBy(xpath =  YouHaveTakenThePublicBus3_xpath)
    private WebElementFacade YouHaveTakenThePublicBus3;

    @FindBy(xpath =  YouHaveTakenThePublicBusAnswer3_xpath)
    private WebElementFacade YouHaveTakenThePublicBusAnswer3;

    @FindBy(xpath =  YouAreSeatedAtARestaurant3_xpath)
    private WebElementFacade YouAreSeatedAtARestaurant3;

    @FindBy(xpath =  YouAreSeatedAtARestaurantAnswer3_xpath)
    private WebElementFacade YouAreSeatedAtARestaurantAnswer3;



    @FindBy(css =  StartButtonPopup_css)
    private WebElementFacade StartButtonPopup;

    @FindBy(xpath =  TryTheNextBattle_xpath)
    private WebElementFacade TryTheNextBattle;

    @FindBy(css =  Continue_css)
    private WebElementFacade Continue;


//    Bus

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBusAnswer_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBusAnswer;

    @FindBy(xpath = Bus_YouAreAtARestaurant_xpath)
    private WebElementFacade Bus_YouAreAtARestaurant;

    @FindBy(xpath = Bus_YouAreAtARestaurantAnswer_xpath)
    private WebElementFacade Bus_YouAreAtARestaurantAnswer;

    @FindBy(xpath = Bus_YouHaveEnteredTheOffice_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOffice;

    @FindBy(xpath = Bus_YouHaveEnteredTheOfficeAnswer_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOfficeAnswer;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus1_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus1;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus1Answer_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus1Answer;

    @FindBy(xpath = Bus_YouAreAtARestaurant1_xpath)
    private WebElementFacade Bus_YouAreAtARestaurant1;

    @FindBy(xpath = Bus_YouAreAtARestaurant1Answer_xpath)
    private WebElementFacade Bus_YouAreAtARestaurant1Answer;

    @FindBy(xpath = Bus_YouHaveEnteredTheOffice1_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOffice1;

    @FindBy(xpath = Bus_YouHaveEnteredTheOffice1Answer_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOffice1Answer;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus2_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus2;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus2Answer_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus2Answer;

    @FindBy(xpath = Bus_YouAreAtARestaurant2_xpath)
    private WebElementFacade Bus_YouAreAtARestaurant2;

    @FindBy(xpath = Bus_YouAreAtARestaurant2Answer_xpath)
    private WebElementFacade Bus_YouAreAtARestaurant2Answer;

    @FindBy(xpath = Bus_YouHaveEnteredTheOffice2_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOffice2;

    @FindBy(xpath = Bus_YouHaveEnteredTheOffice2Answer_xpath)
    private WebElementFacade Bus_YouHaveEnteredTheOffice2Answer;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus3_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus3;

    @FindBy(xpath = Bus_YouHaveTakenThePublicBus3Answer_xpath)
    private WebElementFacade Bus_YouHaveTakenThePublicBus3Answer;

//    Bus ends

//    Office

    @FindBy(xpath = Office_YouHaveEnteredTheOffice_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice;

    @FindBy(xpath = Office_YouHaveEnteredTheOfficeAnswer_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOfficeAnswer;

    @FindBy(xpath = Office_YouHaveTakenThePublicBus_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBus;

    @FindBy(xpath = Office_YouHaveTakenThePublicBusAnswer_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBusAnswer;

    @FindBy(xpath = Office_YouAreAtARestaurant_xpath)
    private WebElementFacade Office_YouAreAtARestaurant;

    @FindBy(xpath = Office_YouAreAtARestaurantAnswer_xpath)
    private WebElementFacade Office_YouAreAtARestaurantAnswer;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice1_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice1;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice1Answer_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice1Answer;

    @FindBy(xpath = Office_YouHaveTakenThePublicBus1_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBus1;

    @FindBy(xpath = Office_YouHaveTakenThePublicBus1Answer_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBus1Answer;

    @FindBy(xpath = Office_YouAreAtARestaurant1_xpath)
    private WebElementFacade Office_YouAreAtARestaurant1;

    @FindBy(xpath = Office_YouAreAtARestaurant1Answer_xpath)
    private WebElementFacade Office_YouAreAtARestaurant1Answer;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice2_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice2;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice2Answer_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice2Answer;

    @FindBy(xpath = Office_YouHaveTakenThePublicBus2_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBus2;

    @FindBy(xpath = Office_YouHaveTakenThePublicBus2Answer_xpath)
    private WebElementFacade Office_YouHaveTakenThePublicBus2Answer;

    @FindBy(xpath = Office_YouAreAtARestaurant2_xpath)
    private WebElementFacade Office_YouAreAtARestaurant2;

    @FindBy(xpath = Office_YouAreAtARestaurant2Answer_xpath)
    private WebElementFacade Office_YouAreAtARestaurant2Answer;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice3_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice3;

    @FindBy(xpath = Office_YouHaveEnteredTheOffice3Answer_xpath)
    private WebElementFacade Office_YouHaveEnteredTheOffice3Answer;

//    Office Ends

//    Game
@FindBy(xpath = AreYouGame_xpath)
private WebElementFacade AreYouGame;

    @FindBy(xpath = AreYouGameAnswer_xpath)
    private WebElementFacade AreYouGameAnswer;

    @FindBy(xpath = AreYouGame0_xpath)
    private WebElementFacade AreYouGame0;

    @FindBy(xpath = AreYouGame0Answer_xpath)
    private WebElementFacade AreYouGame0Answer;


    @FindBy(xpath = AreYouGame1_xpath)
    private WebElementFacade AreYouGame1;

    @FindBy(xpath = AreYouGame1Answer_xpath)
    private WebElementFacade AreYouGame1Answer;

    @FindBy(xpath = AreYouGame2_xpath)
    private WebElementFacade AreYouGame2;

    @FindBy(xpath = AreYouGame2Answer_xpath)
    private WebElementFacade AreYouGame2Answer;

    @FindBy(xpath = AreYouGame3_xpath)
    private WebElementFacade AreYouGame3;

    @FindBy(xpath = AreYouGame3Answer_xpath)
    private WebElementFacade AreYouGame3Answer;

    @FindBy(xpath = AreYouGame4_xpath)
    private WebElementFacade AreYouGame4;

    @FindBy(xpath = AreYouGame4Answer_xpath)
    private WebElementFacade AreYouGame4Answer;

    @FindBy(xpath = AreYouGame5_xpath)
    private WebElementFacade AreYouGame5;

    @FindBy(xpath = AreYouGame5Answer_xpath)
    private WebElementFacade AreYouGame5Answer;

    @FindBy(xpath = AreYouGame6_xpath)
    private WebElementFacade AreYouGame6;

    @FindBy(xpath = AreYouGame6Answer_xpath)
    private WebElementFacade AreYouGame6Answer;

    @FindBy(xpath = AreYouGame7_xpath)
    private WebElementFacade AreYouGame7;

    @FindBy(xpath = AreYouGame7Answer_xpath)
    private WebElementFacade AreYouGame7Answer;

    @FindBy(xpath = AreYouGame8_xpath)
    private WebElementFacade AreYouGame8;

    @FindBy(xpath = AreYouGame8Answer_xpath)
    private WebElementFacade AreYouGame8Answer;

    @FindBy(xpath = AreYouGame9_xpath)
    private WebElementFacade AreYouGame9;

    @FindBy(xpath = AreYouGame9Answer_xpath)
    private WebElementFacade AreYouGame9Answer;

//    Game Ends

    EndUserSteps Superhero;

    public void solveQuestionnaireFor(String type) {
        String field_type = type;

        switch (field_type) {
            case "PublicPlace":
                attackVillainsForPublicPlace();

                break;

            case "Bus":
                attackVillainsFirstFromTheBus();
//
                break;

            case "Office":
                attackVillainsFirstFromTheOffice();
//
                break;

            case "Are you game":
                areYouGame();
//
                break;

            default:
                System.out.print("blah");
                break;
        }
    }

    private void areYouGame() {

        AreYouGame.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGameAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGameAnswer.click();

        ContinueToTheNextQuestion();

        AreYouGame0.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame0Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame0Answer.click();

        ContinueToTheNextQuestion();


        AreYouGame1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame1Answer.click();

        ContinueToTheNextQuestion();

        AreYouGame2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame2Answer.click();

        ContinueToTheNextQuestion();


        AreYouGame3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame3Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame3Answer.click();

        ContinueToTheNextQuestion();

        AreYouGame4.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame4Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame4Answer.click();

        ContinueToTheNextQuestion();



        AreYouGame5.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame5Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame5Answer.click();

        ContinueToTheNextQuestion();


        AreYouGame6.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame6Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame6Answer.click();

        ContinueToTheNextQuestion();


        AreYouGame7.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame7Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame7Answer.click();

        ContinueToTheNextQuestion();

        AreYouGame8.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame8Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame8Answer.click();

        ContinueToTheNextQuestion();

        AreYouGame9.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        AreYouGame9Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        AreYouGame9Answer.click();



    }

    private void attackVillainsFirstFromTheOffice() {
        Office_YouHaveEnteredTheOffice.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveEnteredTheOfficeAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveEnteredTheOfficeAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveTakenThePublicBus.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveTakenThePublicBusAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveTakenThePublicBusAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouAreAtARestaurant.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouAreAtARestaurantAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouAreAtARestaurantAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveEnteredTheOffice1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveEnteredTheOffice1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveEnteredTheOffice1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveTakenThePublicBus1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveTakenThePublicBus1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveTakenThePublicBus1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouAreAtARestaurant1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouAreAtARestaurant1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouAreAtARestaurant1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveEnteredTheOffice2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveEnteredTheOffice2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveEnteredTheOffice2Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveTakenThePublicBus2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveTakenThePublicBus2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveTakenThePublicBus2Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouAreAtARestaurant2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouAreAtARestaurant2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouAreAtARestaurant2Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Office_YouHaveEnteredTheOffice3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Office_YouHaveEnteredTheOffice3Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Office_YouHaveEnteredTheOffice3Answer.click();

    }

    private void attackVillainsFirstFromTheBus() {

        Bus_YouHaveTakenThePublicBus.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveTakenThePublicBusAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveTakenThePublicBusAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouAreAtARestaurant.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouAreAtARestaurantAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouAreAtARestaurantAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouHaveEnteredTheOffice.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveEnteredTheOfficeAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveEnteredTheOfficeAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouHaveTakenThePublicBus1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveTakenThePublicBus1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveTakenThePublicBus1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouAreAtARestaurant1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouAreAtARestaurant1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouAreAtARestaurant1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();


        Bus_YouHaveEnteredTheOffice1.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveEnteredTheOffice1Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveEnteredTheOffice1Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouHaveTakenThePublicBus2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveTakenThePublicBus2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveTakenThePublicBus2Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        Bus_YouAreAtARestaurant2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouAreAtARestaurant2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouAreAtARestaurant2Answer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();


        Bus_YouHaveEnteredTheOffice2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveEnteredTheOffice2Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveEnteredTheOffice2Answer .click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();


        Bus_YouHaveTakenThePublicBus3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Bus_YouHaveTakenThePublicBus3Answer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        Bus_YouHaveTakenThePublicBus3Answer .click();



    }

    public void clickOnStartButtonOnPopup() {
        StartButtonPopup.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        StartButtonPopup.click();

    }

    private void attackVillainsForPublicPlace() {
//        getDriver().switchTo().defaultContent();
        YouAreAtARestaurantQuestion.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouAreAtARestaurantAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouAreAtARestaurantAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveEnteredTheOffice.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveEnteredTheOfficeAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveEnteredTheOfficeAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveTakenThePublicBus.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveTakenThePublicBusAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveTakenThePublicBusAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouAreSeatedAtARestaurant.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouAreSeatedAtARestaurantAnswer.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouAreSeatedAtARestaurantAnswer.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveEnteredTheOffice2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveEnteredTheOfficeAnswer2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveEnteredTheOfficeAnswer2.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveTakenThePublicBus2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveTakenThePublicBusAnswer2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveTakenThePublicBusAnswer2.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouAreSeatedAtARestaurant2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouAreSeatedAtARestaurantAnswer2.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouAreSeatedAtARestaurantAnswer2.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveEnteredTheOffice3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveEnteredTheOfficeAnswer3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveEnteredTheOfficeAnswer3.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouHaveTakenThePublicBus3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouHaveTakenThePublicBusAnswer3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouHaveTakenThePublicBusAnswer3.click();

        tryTheNextBattle();
        clickOnStartButtonOnPopup();

        YouAreSeatedAtARestaurant3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        YouAreSeatedAtARestaurantAnswer3.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(2));
        YouAreSeatedAtARestaurantAnswer3.click();
        waitFor(10).seconds();
    }

    private void tryTheNextBattle() {
        TryTheNextBattle.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        TryTheNextBattle.click();

    }

    public void ContinueToTheNextQuestion(){
        Continue.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        Continue.click();
    }
}
