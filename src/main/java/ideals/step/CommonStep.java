package ideals.step;

import ideals.page.StartPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CommonStep {

    private StartPage startPage;

    @Step
    public void setSessionVariable(Object variableName, Object variableValue) {
        Serenity.setSessionVariable(variableName).to(variableValue);
    }

    @Step
    public void openHomePage() {
        startPage.open();
    }
}
