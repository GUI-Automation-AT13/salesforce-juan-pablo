/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.config;

import core.utils.PropertiesReader;

import java.util.Properties;

public final class EnvConfig {

    private String baseUrl;
    private String loginUrl;
    private String userName;
    private String password;


    private static EnvConfig envConfig;

    private EnvConfig() {
        initialize();
    }

    /**
     * Gets EnvConfig's instance.
     *
     * @return a single instance of config.
     */
    public static EnvConfig getInstance() {
        if (envConfig == null) {
            envConfig = new EnvConfig();
        }
        return envConfig;
    }

    private void initialize() {
        Properties properties = PropertiesReader.getProperties("config.properties");
        loginUrl = properties.getProperty("loginUrl");
        baseUrl = properties.getProperty("baseUrl");
        userName = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    /**
     * Gets base url of config file.
     *
     * @return the base url.
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Gets login url of config file.
     *
     * @return the login url.
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    /**
     * Gets user name of config file.
     *
     * @return the user name.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets password of config file.
     *
     * @return the password.
     */
    public java.lang.String getPassword() {
        return password;
    }
}
