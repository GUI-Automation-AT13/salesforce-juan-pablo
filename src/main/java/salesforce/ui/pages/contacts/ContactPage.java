/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class ContactPage extends BasePage {

    @FindBy(css = ".slds-theme--success")
    private WebElement alertSuccess;
    @FindBy(xpath = "//li[@class='slds-tabs_default__item slds-is-active']//a[@id='detailTab__item']")
    private WebElement detailsTab;
    @FindBy(xpath = "//span[normalize-space()='Dr. Contact Test']")
    private WebElement spanText;

    /**
     * Waits for the element in the page.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccess));
    }

    /**
     * Gets the alert text.
     *
     * @return the text value.
     */
    public String getTextAlertSuccess() {
        return alertSuccess.getText();
    }



    private static final String SPAN_TEXT = "//span[normalize-space()='%s']";



    public String getContactNameText() {
        return .getText()
    }

}
