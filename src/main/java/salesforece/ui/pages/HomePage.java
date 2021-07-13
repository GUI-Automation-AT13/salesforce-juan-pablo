package salesforece.ui.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    /**
     * WebDriver instance.
     */
    protected WebDriver driver;

    /**
     * HomePage constructor.
     *
     * @param driver instance for home page
     */
    public HomePage(final WebDriver driver) {
        this.driver = driver;
    }
}
