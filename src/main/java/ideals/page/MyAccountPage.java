package ideals.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObject {

    private static final String PAGE_CONTENT_ID = "my-account";
    private static final String SIGN_OUT_LINK_CSS = ".logout";

    public Boolean isDisplayed() {
        return getRenderedView().elementIsCurrentlyVisible(
            By.id(PAGE_CONTENT_ID)
        );
    }

    public void clickSignOut() {
        find(
            By.cssSelector(SIGN_OUT_LINK_CSS)
        )
            .click();
    }
}
