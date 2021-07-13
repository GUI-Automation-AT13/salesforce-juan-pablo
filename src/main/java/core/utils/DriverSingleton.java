package core.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverSingleton {

    /**
     * Web driver instance for singleton.
     */
    private static WebDriver instance;

    private DriverSingleton() {
    }

    /**
     * Gets the static instance for singleton pattern.
     *
     * @param browser enum with the browser name we need.
     * @return a WebDriver with the instance of browser
     */
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

    /**
     * Closes the instance browser.
     */
    public static void closeInstance() {
        instance.close();
        instance = null;
    }

    /**
     * Quits the instance browser.
     */
    public static void quitInstance() {
        instance.quit();
        instance = null;
    }
}
