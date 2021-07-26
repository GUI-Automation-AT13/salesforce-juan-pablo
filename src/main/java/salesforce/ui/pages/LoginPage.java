/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

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
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
    }

    /**
     * Sets username's value.
     *
     * @param userName a String with the username's value.
     */
    private void setUserName(final String userName) {
        webElementAction.setInputField(userNameTxtBox, userName);
    }

    /**
     * Sets password's value.
     *
     * @param password a String with the password's value.
     */
    private void setPassword(final String password) {
        webElementAction.setInputField(passwordTxtBox, password);
    }

    private void clickLoginBtn() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
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
        return new HomePage();
    }
}
