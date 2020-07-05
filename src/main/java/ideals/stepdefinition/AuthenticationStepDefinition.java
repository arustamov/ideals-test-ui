package ideals.stepdefinition;

import cucumber.api.java.en.When;
import ideals.config.SpringContextAware;
import ideals.entity.User;
import ideals.entity.enums.SessionVariable;
import ideals.step.AuthenticationStep;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Shared;

@SuppressWarnings("unchecked")
public class AuthenticationStepDefinition implements SpringContextAware {

    @Shared
    private AuthenticationStep authenticationStep;

    @When("I go to log in")
    public void i_go_to_log_in() {
        authenticationStep.goToLogIn();
    }

    @When("^I log in$")
    public void i_log_in() {
        final User actor = Serenity.sessionVariableCalled(SessionVariable.ACTOR);

        authenticationStep.provideEmail(
            actor.getEmail()
        );

        authenticationStep.providePassword(
            actor.getPassword()
        );
        authenticationStep.tryLogIn();
    }

    @When("^I navigate to log out$")
    public void i_navigate_to_log_out() {
        authenticationStep.navigateToLogOut();
    }

    @When("^I log out$")
    public void i_log_out() {
        authenticationStep.tryLogOut();
    }
}
