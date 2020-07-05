package ideals.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriverManagerDriverSource implements DriverSource {

    @Override
    public WebDriver newDriver() {
        WebDriverManager.firefoxdriver().setup();

        return new FirefoxDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

    @Override
    public Class<? extends WebDriver> driverType() {
        return FirefoxDriver.class;
    }
}
