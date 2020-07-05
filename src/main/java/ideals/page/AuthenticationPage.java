package ideals.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:start.page")
public class AuthenticationPage extends PageObject {

    private static final String PAGE_CONTENT_ID = "authentication";

    public Boolean isDisplayed() {
        return getRenderedView().elementIsCurrentlyVisible(
            By.id(PAGE_CONTENT_ID)
        );
    }
}
