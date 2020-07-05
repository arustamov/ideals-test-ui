package ideals.page.container;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignInContainer extends PageObject {

    private static final String CONTAINER_ID = "login_form";
    private static final String EMAIL_INPUT_ID = "email";
    private static final String PASSWORD_ID = "passwd";
    private static final String SIGN_IN_BUTTON_ID = "SubmitLogin";

    public void typeEmail(String email) {
        find(
            By.id(CONTAINER_ID)
        )
            .then(
                By.id(EMAIL_INPUT_ID)
            )
            .type(email);
    }

    public void typePassword(String password) {
        find(
            By.id(CONTAINER_ID)
        )
            .then(
                By.id(PASSWORD_ID)
            )
            .type(password);
    }

    public void clickSignIn() {
        find(
            By.id(CONTAINER_ID)
        )
            .then(
                By.id(SIGN_IN_BUTTON_ID)
            )
            .click();
    }
}
