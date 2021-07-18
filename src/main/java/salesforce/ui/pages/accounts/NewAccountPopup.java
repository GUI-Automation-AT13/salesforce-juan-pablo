/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.accounts;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class NewAccountPopup extends BasePage {

    @FindBy(name = "Name")
    protected WebElement accountNameTxtBox;

    @FindBy(name = "SaveEdit")
    protected WebElement saveBtn;

    /**
     * Waits form the element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
    }

    /**
     * Sets a String for username property.
     *
     * @param accountName for username property.
     * @return the same instances for NewAccountPopup.
     */
    public NewAccountPopup setAccountName(final String accountName) {
        webElementAction.setInputField(accountNameTxtBox, accountName);
        return this;
    }

    /**
     * clicks on save button.
     *
     * @return a new instance for AccountPage.
     */
    public AccountPage clickSaveBtn() {
        webElementAction.clickElement(saveBtn);
        return new AccountPage();
    }
}
