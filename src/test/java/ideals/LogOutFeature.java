package ideals;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/report/logout.json"},
    glue = "ideals.stepdefinition",
    features = "classpath:features/logout.feature"
)
public class LogOutFeature {
}
