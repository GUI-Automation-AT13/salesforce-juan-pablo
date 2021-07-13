package core.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public final class DriverSingleton {

    private static WebDriver instance;

    private DriverSingleton() {
    }

    public static WebDriver getInstance(final Browsers browser) {
        if (instance == null) {
            if (browser == Browsers.CHROME) {
                WebDriverManager.chromedriver().setup();
                instance = new ChromeDriver();
            } else if (browser == Browsers.FIREFOX) {
                WebDriverManager.firefoxdriver().setup();
                instance = new FirefoxDriver();
            } else if (browser == Browsers.EDGE) {
                WebDriverManager.edgedriver().setup();
                instance = new EdgeDriver();
            }
        }
        instance.manage().window().maximize();
        return instance;
    }

    public static void closeInstance() {
        instance.close();
        instance = null;
    }

    public static void quitInstance() {
        instance.quit();
        instance = null;
    }
}
