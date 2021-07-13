package base;

import core.entities.ConfigProperties;
import core.utils.Browsers;
import core.utils.DriverSingleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforece.ui.pages.LoginPage;

public class BaseTest {

    protected LoginPage loginPage;
    protected ConfigProperties configProperties;

    @BeforeClass
    public void beforeClass() {
        WebDriver driver = DriverSingleton.getInstance(Browsers.CHROME);
        driver.get(configProperties.getBaseUri());
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() {
        DriverSingleton.quitInstance();
    }
}
