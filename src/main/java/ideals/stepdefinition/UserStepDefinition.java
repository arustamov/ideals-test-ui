package ideals.stepdefinition;

import cucumber.api.java.en.Given;
import ideals.config.SpringContextAware;
import ideals.entities.Users;
import ideals.entity.User;
import ideals.entity.enums.SessionVariable;
import ideals.step.CommonStep;
import net.thucydides.core.annotations.Shared;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public class UserStepDefinition implements SpringContextAware {

    @Autowired
    private Users users;

    @Shared
    private CommonStep commonStep;

    @Given("^there is a registered user$")
    public void there_is_a_registered_user() {
        final User user = (User) users.random(
            users.getAll()
        );

        commonStep.setSessionVariable(SessionVariable.USER, user);
    }
}
