package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.LoginPage;

public class BaseTest {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected PageTransporter pageTransporter;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
