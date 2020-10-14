package StepDefinitionPages.pages;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static objectRepository.ObjectRepository.QuestionnairePageLocators.StartButtonPopup_css;

public class CommonMethodsPage extends PageObject {

    @Steps
    public EndUserSteps Superhero;

    @FindBy(css =  StartButtonPopup_css)
    private WebElementFacade StartButtonPopup;

//  Scroll to the bottom of the page
    public void scrollTillTheEndOfPage() {
        try {
            long lastHeight = (long) ((JavascriptExecutor) getDriver()).executeScript("return document.body.scrollHeight");

            while (true) {
                ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(3000);

                long newHeight = (long) ((JavascriptExecutor) getDriver()).executeScript("return document.body.scrollHeight");
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//  Click on the "Start" button on the popup for all the questionnaires (Modal class)
    public void clickOnStartButtonOnPopup() {
        StartButtonPopup.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        StartButtonPopup.click();
    }

}
