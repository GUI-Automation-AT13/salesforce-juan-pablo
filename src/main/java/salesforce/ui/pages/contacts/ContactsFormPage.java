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

public class ContactsFormPage extends BasePage {

    @FindBy(css = "input[placeholder='Search Accounts...']")
    private WebElement accountSearchBox;

    @FindBy(css = "input[placeholder='Search Contacts...']")
    private WebElement contactsSearchBox;

    @FindBy(xpath = "(//textarea[@name='street'])[1]")
    private WebElement mailingStreetTxtBox;

    @FindBy(xpath = "(//input[@name='postalCode'])[1]")
    private WebElement mailingPostalCodeTxtBox;

    @FindBy(xpath = "(//input[@name='city'])[1]")
    private WebElement mailingCityTxtBox;

    @FindBy(xpath = "(//input[@name='province'])[1]")
    private WebElement mailingProvinceTxtBox;

    @FindBy(xpath = "(//input[@name='country'])[1]")
    private WebElement mailingCountryTxtBox;

    @FindBy(xpath = "(//textarea[@name='street'])[2]")
    private WebElement otherStreetTxtBox;

    @FindBy(xpath = "(//input[@name='postalCode'])[2]")
    private WebElement otherPostalCodeTxtBox;

    @FindBy(xpath = "(//input[@name='city'])[2]")
    private WebElement otherCityTxtBox;

    @FindBy(xpath = "(//input[@name='province'])[2]")
    private WebElement otherProvinceTxtBox;

    @FindBy(xpath = "(//input[@name='country'])[2]")
    private WebElement otherCountryTxtBox;

    @FindBy(xpath = "(//force-record-layout-section//textarea)[3]")
    private WebElement descriptionTxtBox;

    @FindBy(xpath = "//button[@name='SaveEdit']")
    protected WebElement saveBtn;

    private static final By SAVE_BTN = By.xpath("//button[@name='SaveEdit']");

    private static final String INPUT_XPATH = "//input[@name='%s']";
    private static final String DROPDOWN_XPATH = "//lightning-combobox[label[text()='%s']]//input";
    private static final String DROPDOWN_OPTION_XPATH = "//lightning-base-combobox-item[.//span[text()='%s']]";

    private static final HashMap<String, String> INPUT_FIELD_NAMES = new HashMap<>();

    static {
        INPUT_FIELD_NAMES.put("Account Name", "Name");
        INPUT_FIELD_NAMES.put("SIC Code", "Sic");
    }

    /**
     * Waits for the element in the page.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
//        wait.until(ExpectedConditions.presenceOfElementLocated(SAVE_BTN));
    }

    /**
     * Sets the filed name and its value.
     *
     * @param fieldName  String with elements' name.
     * @param fieldValue String with value's field.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setInputField(final String fieldName, final String fieldValue) {
        String newFileName = fieldName.replaceAll(" ", "");
        webElementAction.setInputField(driver.findElement(By.xpath(String.format(INPUT_XPATH,
                INPUT_FIELD_NAMES.getOrDefault(fieldName, newFileName)))), fieldValue);
        return this;
    }

    /**
     * selects a dropdown option.
     *
     * @param fieldName   String with the dropdown name.
     * @param fieldOption String with the option name.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage selectFromDropdown(final String fieldName, final String fieldOption) {
        webElementAction.clickElement(driver.findElement(By.xpath(String.format(DROPDOWN_XPATH, fieldName))));
        webElementAction.clickElement(driver.findElement(By.xpath(String.format(DROPDOWN_OPTION_XPATH, fieldOption))));
        return this;
    }

    /**
     * Sets the mailingStreet field.
     *
     * @param mailingStreet mailingStreet's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setMailingStreet(final String mailingStreet) {
        webElementAction.setInputField(mailingStreetTxtBox, mailingStreet);
        return this;
    }

    /**
     * Sets the mailingPostalCode field.
     *
     * @param mailingPostalCode mailingPostalCode's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setMailingPostalCode(final String mailingPostalCode) {
        webElementAction.setInputField(mailingPostalCodeTxtBox, mailingPostalCode);
        return this;
    }

    /**
     * Sets the mailingCity field.
     *
     * @param mailingCity mailingCity's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setMailingCity(final String mailingCity) {
        webElementAction.setInputField(mailingCityTxtBox, mailingCity);
        return this;
    }

    /**
     * Sets the mailingProvince field.
     *
     * @param mailingProvince mailingProvince's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setMailingProvince(final String mailingProvince) {
        webElementAction.setInputField(mailingProvinceTxtBox, mailingProvince);
        return this;
    }


    /**
     * Sets the mailingCountry field.
     *
     * @param mailingCountry mailingCountry's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setMailingCountry(final String mailingCountry) {
        webElementAction.setInputField(mailingCountryTxtBox, mailingCountry);
        return this;
    }

    /**
     * Sets the otherStreet field.
     *
     * @param otherStreet otherStreet's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setOtherStreet(final String otherStreet) {
        webElementAction.setInputField(otherStreetTxtBox, otherStreet);
        return this;
    }

    /**
     * Sets the otherPostalCode field.
     *
     * @param otherPostalCode otherPostalCode's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setOtherPostalCode(final String otherPostalCode) {
        webElementAction.setInputField(otherPostalCodeTxtBox, otherPostalCode);
        return this;
    }

    /**
     * Sets the otherCity field.
     *
     * @param otherCity otherCity's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setOtherCity(final String otherCity) {
        webElementAction.setInputField(otherCityTxtBox, otherCity);
        return this;
    }

    /**
     * Sets the otherProvince field.
     *
     * @param otherProvince otherProvince's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setOtherProvince(final String otherProvince) {
        webElementAction.setInputField(otherProvinceTxtBox, otherProvince);
        return this;
    }

    /**
     * Sets the otherCountry field.
     *
     * @param otherCountry otherCountry's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setOtherCountry(final String otherCountry) {
        webElementAction.setInputField(otherCountryTxtBox, otherCountry);
        return this;
    }

    /**
     * Sets the description field.
     *
     * @param description description's value.
     * @return the same NewAccountPopup's instance.
     */
    public ContactsFormPage setDescription(final String description) {
        webElementAction.setInputField(descriptionTxtBox, description);
        return this;
    }

    /**
     * Moves to contact page.
     *
     * @return ContactPage instance.
     */
    public ContactPage clickSaveBtn() {
        saveBtn.click();
        return new ContactPage();
    }
}
