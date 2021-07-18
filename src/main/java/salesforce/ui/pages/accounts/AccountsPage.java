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

public class AccountsPage extends BasePage {

    @FindBy(css = "a[title='New']")
    private WebElement nextBtn;

    /**
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(nextBtn));
    }

    /**
     * Open the Accounts' form.
     *
     * @return a new instance.
     */
    public NewAccountPopup openAccountPopup() {
        return new NewAccountPopup();
    }
}
