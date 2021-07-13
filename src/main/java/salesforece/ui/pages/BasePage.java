package salesforece.ui.pages;

import core.entities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    /**
     * WebDriver instance.
     */
    protected WebDriver driver;

    /**
     * WebDriverWait instance.
     */
    protected WebDriverWait wait;

    /**
     * ConfigProperties instance.
     */
    protected ConfigProperties configProperties;

    /**
     * Constructor method.
     *
     * @param driver with the driver we need.
     */
    public BasePage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Integer.parseInt(configProperties.getImplicitWaitTime()));
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();
}
