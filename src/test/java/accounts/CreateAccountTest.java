package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.accounts.AccountPage;
import salesforce.ui.pages.accounts.AccountsPage;
import salesforce.ui.pages.accounts.NewAccountPopup;

public class CreateAccountTest extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private AccountsPage accountsPage;
    private AccountPage accountPage;

    //popups
    private NewAccountPopup newAccountPoppup;

    @Test
    public void testCreateAccountWithRequiredFields() {

        String accountName = "Test Account";
        loginPage = new LoginPage();
        //login
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());

        //Go to Account Home Page
        accountsPage = pageTransporter.navigateToAccountsPage();

        //click on new account
        newAccountPoppup = accountsPage.openAccountPopup();

        //fill account form
        accountPage = newAccountPoppup.setAccountName(accountName).clickSaveBtn();

        //Verify Success message

        //Go to Accounts page
    }


    @Test
    public void testName() {
        loginPage = new LoginPage();
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
        accountsPage = pageTransporter.navigateToAccountsPage();
    }
}
