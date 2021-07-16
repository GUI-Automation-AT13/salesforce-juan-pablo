/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import core.utils.PropertiesReader;

import java.util.Properties;

public final class WebDriverConfig {

    private String browser;
    private int implicitWaitTime;
    private int explicitWaitTime;
    private int waitSleepTime;

    private static WebDriverConfig instance;

    /**
     * Constructor of page WebDriverManager.
     */
    private WebDriverConfig() {
        initialize();
    }

    /**
     * Constructo of WebDriverConfig.
     * Gets WebDriverConfig as Singleton.
     *
     * @return a instance.
     */
    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    /**
     * Initializes According the config file.
     */
    private void initialize() {
        Properties properties = PropertiesReader.getProperties("config.properties");
        browser = properties.getProperty("browser");
        implicitWaitTime = Integer.parseInt(properties.getProperty("implicitWaitTime"));
        explicitWaitTime = Integer.parseInt(properties.getProperty("explicitWaitTime"));
        waitSleepTime = Integer.parseInt(properties.getProperty("waitSleepTime"));
    }

    /**
     * Gets the browser int which the test are being executed.
     *
     * @return Browser.
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Gets the implicit wait time set for the WebDriver.
     *
     * @return The implicit Wait Time.
     */
    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    /**
     * Gets the explicit wait time set for the WebDriver.
     *
     * @return The explicit Wait Time.
     */
    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }

    /**
     * Gets the sleep wait set for the WebDriver.
     *
     * @return The explicit Wait Time.
     */
    public int getWaitSleepTime() {
        return waitSleepTime;
    }
}
