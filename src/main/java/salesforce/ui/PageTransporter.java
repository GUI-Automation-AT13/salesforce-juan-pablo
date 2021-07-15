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
     * .Goes to the given URL
     *
     * @param url Site's URL.
     */
    public void goToURL(final String url) {
        WebDriverManager.getInstance().getDriver().navigate().to(url);
    }

    /**
     * .
     *
     * @return .
     */
    public AccountsPage navigateToAccountsPage() {
        goToURL(baseUrl.concat("/lightning/o/Account/list?filterName=Recent"));
        return new AccountsPage();
    }

    /**
     * .
     *
     * @return .
     */
    public ContactsPage navigateToContactsPage() {
        goToURL(baseUrl.concat("/lightning/o/Contact/list?filterName=Recent"));
        return new ContactsPage();
    }
}
