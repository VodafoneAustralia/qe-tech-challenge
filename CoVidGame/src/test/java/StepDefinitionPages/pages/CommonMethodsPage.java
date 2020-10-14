package StepDefinitionPages.pages;

import StepDefinitionPages.steps.serenity.EndUserSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static objectRepository.ObjectRepository.QuestionnairePageLocators.*;

public class CommonMethodsPage extends PageObject {

    @Steps
    public EndUserSteps Superhero;


    @FindBy(css =  StartButtonPopup_css)
    private WebElementFacade StartButtonPopup;






    public void moveToElement(WebElementFacade chooseYourBattleFieldTitle) {
        Actions action = new Actions(getDriver());
        action.moveToElement(find(By.xpath(String.valueOf(chooseYourBattleFieldTitle)))).build().perform();
    }

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


    public void clickOnStartButtonOnPopup() {
        StartButtonPopup.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        StartButtonPopup.click();

    }

}
