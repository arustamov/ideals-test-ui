package ideals.stepdefinition;

import cucumber.api.java.en.When;
import ideals.config.SpringContextAware;
import ideals.entities.Users;
import ideals.entity.Entity;
import ideals.entity.User;
import ideals.entity.enums.SessionVariable;
import ideals.step.CommonStep;
import java.util.List;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Shared;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public class CommonStepDefinition implements SpringContextAware {

    @Autowired
    private Users users;

    @Shared
    private CommonStep commonStep;

    @When("^I act as the \"([^\"]*)\"$")
    public void i_act_as_the_user(String variable) {
        User user = Serenity.sessionVariableCalled(SessionVariable.from(variable));

        commonStep.setSessionVariable(SessionVariable.ACTOR, user);
    }

    @When("^I select a random \"([^\"]*)\" from the \"([^\"]*)\"$")
    public void i_select_a_random_entity_from_the_entities(String variableName, String variablesName) {
        List<Entity> entities = Serenity.sessionVariableCalled(SessionVariable.from(variablesName));

        Entity entity = users.random(
                entities.stream()
        );

        commonStep.setSessionVariable(SessionVariable.from(variableName), entity);
    }

    @When("^I select a random \"([^\"]*)\" as \"([^\"]*)\" from the \"([^\"]*)\"$")
    public void i_select_a_random_entity_as_from_the_entities(String variableName, List<String> aliases, String variablesName) {
        List<Entity> entities = Serenity.sessionVariableCalled(SessionVariable.from(variablesName));

        entities = users.random(
                entities.stream(),
                aliases.size()
        );

        for (int i = 0; i < aliases.size(); i++) {
            commonStep.setSessionVariable(aliases.get(i) + SessionVariable.from(variableName), entities.get(i));
        }
    }

    @When("^I navigate to the site$")
    public void i_navigate_to_the_site() {
        commonStep.openHomePage();
    }
}
