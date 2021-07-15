package salesforce.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static final By CREATE_BTN_BY = By.cssSelector("div[class*='CreateMenu']");

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.presenceOfElementLocated(CREATE_BTN_BY));
    }
}
