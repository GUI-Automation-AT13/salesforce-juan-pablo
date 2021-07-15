package salesforece.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    /**
     * defines locator for username TextBox.
     */
    @FindBy(id = "username")
    private WebElement userNameTxtBox;

    /**
     * defines locator for password TextBox.
     */
    @FindBy(id = "password")
    private WebElement passwordTxtBox;

    /**
     * defines locator for Login Button.
     */
    @FindBy(id = "Login")
    private WebElement loginBtn;

    /**
     * Constructor for login page.
     *
     * @param driver with WebDriver instance.
     */
    public LoginPage(final WebDriver driver) {
        super(driver);
    }

    /**
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
    }

    /**
     * Sets username's value.
     *
     * @param userName a String with the username's value.
     * @return a LoginPage instance.
     */
    private LoginPage setUserName(final String userName) {
        userNameTxtBox.sendKeys(userName);
        return this;
    }

    /**
     * Sets password's value.
     *
     * @param password a String with the password's value.
     * @return a LoginPage instance.
     */
    private LoginPage setPassword(final String password) {
        passwordTxtBox.sendKeys(password);
        return this;
    }

    private void clickLoginBtn() {
        loginBtn.click();
    }

    /**
     * Sets the username and password's value.
     *
     * @param userName a String with the username's value.
     * @param password a String with the password's value.
     * @return a Homepage instance.
     */
    public HomePage loginSuccessful(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginBtn();
        return new HomePage(driver);
    }
}
