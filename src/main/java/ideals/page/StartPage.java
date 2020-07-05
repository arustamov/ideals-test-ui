package ideals.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;

@DefaultUrl("page:start.page")
public class StartPage extends PageObject {

    private static final String PAGE_CONTENT_ID = "index";
    private static final String SIGN_IN_LINK_CSS = ".login";

    @WhenPageOpens
    public void waitForPageContentLoaded() {
        getRenderedView().waitFor(
            By.id(PAGE_CONTENT_ID)
        );
    }

    public Boolean isDisplayed() {
        return getRenderedView().elementIsCurrentlyVisible(
            By.id(PAGE_CONTENT_ID)
        );
    }

    public void clickSignIn() {
        find(
            By.cssSelector(SIGN_IN_LINK_CSS)
        )
            .click();
    }
}
