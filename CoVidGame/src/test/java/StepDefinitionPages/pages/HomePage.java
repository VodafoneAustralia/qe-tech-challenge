package StepDefinitionPages.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.By;

import java.time.Duration;

import static objectRepository.ObjectRepository.HomePageLocators.*;



public class HomePage extends PageObject {

    @FindBy(css =  WarriorNameTextbox_css)
    private WebElementFacade WarriorNameTextbox;

    @FindBy(css =  CreateAWarriorButton_css)
    private WebElementFacade CreateAWarriorButton;

    @FindBy(xpath =  StartYourJourney_xpath)
    private WebElementFacade StartYourJourney;




    private EnvironmentVariables environmentVariables;

    public void enterWarriorNameInTextBox(String name) {
        WarriorNameTextbox.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        WarriorNameTextbox.type(name);
        CreateAWarriorButton.click();

    }

    public void clickOnStartYourJourneyButton(String name) {

        StartYourJourney.waitUntilClickable().setImplicitTimeout(Duration.ofSeconds(5));
        String StartYourJourneyButton = "//a[contains(text(),'Start your journey "+name+"')]";
        find(By.xpath(StartYourJourneyButton)).waitUntilClickable().click();

    }
}
