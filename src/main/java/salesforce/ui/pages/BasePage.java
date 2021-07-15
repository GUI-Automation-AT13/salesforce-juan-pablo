package salesforce.ui.pages;


import core.selenium.WebDriverManager;
import core.selenium.WebElementAction;
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
     * WebElementAction instance.
     */
    protected WebElementAction webElementAction;

    /**
     * Constructor method.
     *
     * @param driver with the driver we need.
     */
    public BasePage() {
        this.driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
        webElementAction = new WebElementAction();
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    protected abstract void waitUntilPageObjectIsLoaded();
}
