package StepDefinitionPages.pages;

//import StepDefinitionPages.Common_methods.Common_methods;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static objectRepository.ObjectRepository.BattlefieldFieldPageLocators.*;

public class BattlefieldPage extends PageObject {

    CommonMethodsPage commonMethodsPage;
//    Common_methods common_methods;

    @FindBy(xpath =  HeadingOnBattlefieldPage_xpath)
    private WebElementFacade HeadingOnBattlefieldPage;

    @FindBy(xpath =  ChooseYourBattleFieldTitle_xpath)
    private WebElementFacade ChooseYourBattleFieldTitle;

    @FindBy(css =  BattleField_PublicPlace_css)
    private WebElementFacade BattleField_PublicPlace;

    @FindBy(css =  BattleField_Bus_css)
    private WebElementFacade BattleField_Bus;

    @FindBy(css =  BattleField_Office_css)
    private WebElementFacade BattleField_Office;

    @FindBy(css =  BattleField_Game_css)
    private WebElementFacade BattleField_Game;





    public void selectBattledfield(String fieldType) {
        HeadingOnBattlefieldPage.waitUntilPresent().setImplicitTimeout(Duration.ofSeconds(10));
        commonMethodsPage.scrollTillTheEndOfPage();
        ChooseYourBattleFieldTitle.waitUntilPresent().setImplicitTimeout(Duration.ofSeconds(3));

        String type_of_field = fieldType;
        switch (type_of_field) {
            case "PublicPlace":
                BattleField_PublicPlace.waitUntilClickable().click();


                break;

            case "Bus":
                BattleField_Bus.waitUntilClickable().click();
                break;

            case "Office":
                BattleField_Office.waitUntilClickable().click();
                break;

            case "Are you game":
                BattleField_Game.waitUntilClickable().click();
                break;

            default:
                System.out.print("Hurry Up and select your battlefield!!!");
                break;

        }

        }


    }



