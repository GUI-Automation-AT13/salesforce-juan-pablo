/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui;

import core.selenium.WebDriverManager;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;

public class PageTransporter {

    private String baseUrl;

    /**
     * .Goes to the given URL.
     *
     * @param url Site's URL.
     */
    public static void goToURL(final String url) {
        WebDriverManager.getInstance().getDriver().navigate().to(url);
    }

    /**
     * .
     * @param page .
     */
    public static void navigateToURLByPageName(final Pages page) {
        //recuperar la url de alguna forma con un ENUM o un MAPA
        String baseUrl = EnvConfig.getInstance().getBaseUrl();
        goToURL(baseUrl.concat(page.getPageRoute()));
    }

    /**
     * Navigates to login page.
     *
     * @return a LoginPage entity.
     */
    public LoginPage navigateToLoginPage() {
        goToURL(EnvConfig.getInstance().getLoginUrl());
        return new LoginPage();
    }
}

