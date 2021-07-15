package accounts;

import base.BaseTest;
import salesforece.ui.pages.HomePage;

public class CreateAccountTest extends BaseTest {
    HomePage homePage = loginPage.loginSuccessful(configProperties.getUsername(),configProperties.getPassword());
}
