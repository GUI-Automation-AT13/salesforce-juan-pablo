/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

import java.util.HashMap;

public class ContactPage extends BasePage {

    @FindBy(css = ".slds-theme--success")
    private WebElement alertSuccess;

    @FindBy(xpath = "//a[@id='detailTab__item']")
    private WebElement detailsTab;

    //    @FindBy(xpath = "//span[normalize-space()='Dr. Contact Test']")
    @FindBy(xpath = "//div[contains(@class,'entityNameTitle slds-line-height--reset')]/../..//span[@data-aura-class='uiOutputText']")
    private WebElement spanPrincipalNameText;
    @FindBy(xpath = "//lightning-formatted-name[@data-output-element-id='output-field']")
    private WebElement spanDetailNameText;


    private static final String SPAN_TEXT = "//span[normalize-space()='%s']";
    private static final String SPAN_TEXT_A = "//div[contains(@class,'entityNameTitle slds-line-height--reset')]/../..//span[@data-aura-class='uiOutputText']";
    private static final String SPAN_TEXT_B = "//lightning-formatted-name[contains(@data-output-element-id,'output-field')]";
    private static final String SPAN_TEXT2 = "//lightning-formatted-text[@data-output-element-id='output-field'][normalize-space()='%s']";
    private static final String SPAN_DATE = "//span[normalize-space()='%s']/../.. //lightning-formatted-text";
    private static final HashMap<String, String> SPAN_FIELDS_NAMES = new HashMap<>();

    static {
        SPAN_FIELDS_NAMES.put("name", "Name");
        SPAN_FIELDS_NAMES.put("company name", "Company Name");
    }

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

    /**
     * .
     *
     * @return .
     */
    public String getContactNameText() {
        return spanPrincipalNameText.getText();
    }

    /**
     * Gets the entity or company name text.
     *
     * @param fieldName .
     * @return a String with the entity or company name text.
     */
    public String getNamesText(final String fieldName) {
        return webElementAction.getElementText(driver.findElement(By.xpath(String.format(SPAN_TEXT, fieldName))));
    }

    /**
     * Gets the entity or company name text.
     *
     * @param fieldName .
     * @return a String with the entity or company name text.
     */
    public String getDateText(final String fieldName) {
        return webElementAction.getElementText(driver.findElement(By.xpath(String.format(SPAN_DATE, fieldName))));
    }

    /**
     * .
     */
    public void clickDetailTab() {
        webElementAction.clickElement(detailsTab);
    }

    /**
     * .
     *
     * @return .
     */
    public String getPrincipalName() {
        return webElementAction.getElementText(spanPrincipalNameText);
    }

    /**
     * .
     *
     * @return .
     */
    public String getDetailName() {
        return webElementAction.getElementText(spanDetailNameText);
    }

}
