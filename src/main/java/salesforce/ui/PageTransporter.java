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
import salesforce.ui.pages.accounts.AccountsPage;
import salesforce.ui.pages.contacts.ContactsPage;

public class PageTransporter {

    /**
     * .
     */
    private String baseUrl = EnvConfig.getInstance().getBaseUrl();


    /**
     * .Goes to the given URL.
     *
     * @param url Site's URL.
     */
    public void goToURL(final String url) {
        WebDriverManager.getInstance().getDriver().navigate().to(url);
    }

    /**
     * navigates to Accounts page.
     *
     * @return Accounts' instance.
     */
    public AccountsPage navigateToAccountsPage() {
        goToURL(baseUrl.concat("/lightning/o/Account/list?filterName=Recent"));
        System.out.println( baseUrl.concat("/lightning/o/Account/list?filterName=Recent"));
        return new AccountsPage();
    }

    /**
     * navigates to Contacts page.
     *
     * @return Contacts' instance.
     */
    public ContactsPage navigateToContactsPage() {
        System.out.println(baseUrl + "/lightning/o/Account/list?filterName=Recent");
        goToURL(baseUrl.concat("/lightning/o/Contact/list?filterName=Recent"));
        System.out.println(baseUrl + "/lightning/o/Account/list?filterName=Recent");
        return new ContactsPage();
    }
}

