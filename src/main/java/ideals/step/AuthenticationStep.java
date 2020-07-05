package ideals.step;

import ideals.page.LogOutPage;
import ideals.page.MyAccountPage;
import ideals.page.StartPage;
import ideals.page.container.SignInContainer;
import net.thucydides.core.annotations.Step;

public class AuthenticationStep {

    private StartPage startPage;
    private SignInContainer signInContainer;
    private MyAccountPage myAccountPage;
    private LogOutPage logOutPage;

    @Step
    public void goToLogIn() {
        startPage.clickSignIn();
    }

    @Step
    public void provideEmail(final String email) {
        signInContainer.typeEmail(email);
    }

    @Step
    public void providePassword(final String password) {
        signInContainer.typePassword(password);
    }

    @Step
    public void tryLogIn() {
        signInContainer.clickSignIn();
    }

    @Step
    public void navigateToLogOut() {
        logOutPage.open();
    }

    @Step
    public void tryLogOut() {
        myAccountPage.clickSignOut();
    }
}
