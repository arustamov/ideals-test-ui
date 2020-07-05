package ideals.step;

import ideals.page.AuthenticationPage;
import ideals.page.MyAccountPage;
import ideals.page.StartPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class SiteStep {

    private MyAccountPage myAccountPage;
    private AuthenticationPage authenticationPage;
    private StartPage startPage;

    @Step
    public void verifyMyAccountDisplayed() {
        Assertions.assertThat(
            myAccountPage.isDisplayed()
        )
            .isTrue();
    }

    public void verifyAuthenticationPageDisplayed() {
        Assertions.assertThat(
            authenticationPage.isDisplayed()
        )
            .isTrue();
    }

    public void verifyStartPageDisplayed() {
        Assertions.assertThat(
            startPage.isDisplayed()
        )
            .isTrue();
    }
}
