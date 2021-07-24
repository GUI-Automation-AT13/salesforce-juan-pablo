package core.selenium.browsers;

import org.openqa.selenium.WebDriver;

public class BrowsersFactory {

    /**
     * Gets the proper web driver.
     *
     * @param webDriver a String with the web driver's name
     * @return the web driver
     */

    public WebDriver getManagerBrowser(final String webDriver) {
        WebDriver driverManager;
        if (webDriver.equals("CHROME")) {
            driverManager = new ChromeBrowser().getChromeDriver();
        } else {
            driverManager = new FirefoxBrowser().getFirefoxDriver();
        }
        return driverManager;
    }

}
