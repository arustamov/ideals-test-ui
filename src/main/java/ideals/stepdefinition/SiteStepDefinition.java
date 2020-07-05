package ideals.stepdefinition;

import cucumber.api.java.en.Then;
import ideals.config.SpringContextAware;
import ideals.step.SiteStep;
import net.thucydides.core.annotations.Shared;

@SuppressWarnings("unchecked")
public class SiteStepDefinition implements SpringContextAware {

    @Shared
    private SiteStep siteStep;

    @Then("I should see my account")
    public void i_should_see_my_account() {
        siteStep.verifyMyAccountDisplayed();
    }

    @Then("I should see authentication page")
    public void i_should_see_authentication_page() {
        siteStep.verifyAuthenticationPageDisplayed();
    }

    @Then("I should see start page")
    public void i_should_see_start_page() {
        siteStep.verifyStartPageDisplayed();
    }
}
