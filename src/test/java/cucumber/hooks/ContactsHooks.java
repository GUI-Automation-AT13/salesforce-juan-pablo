package cucumber.hooks;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.LoginPage;

public class ContactsHooks {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected PageTransporter pageTransporter;

    @BeforeClass
    public void setup() {
        driver = WebDriverManager.getInstance().getDriver();
        driver.get(EnvConfig.getInstance().getLoginUrl());
        loginPage = new LoginPage();
        pageTransporter = new PageTransporter();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
