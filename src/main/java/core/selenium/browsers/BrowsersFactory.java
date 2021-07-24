/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

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
