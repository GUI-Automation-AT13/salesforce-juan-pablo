package salesforece.ui.pages;

import core.entities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ConfigProperties configProperties;

    public BasePage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Integer.parseInt(configProperties.getImplicitWaitTime()));
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();
}
