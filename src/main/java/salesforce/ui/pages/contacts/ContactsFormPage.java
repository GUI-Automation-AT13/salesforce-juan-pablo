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

public class ContactsFormPage extends BasePage {

    @FindBy(name = "firstName")
    private WebElement firstNameTxtBox;

    @FindBy(name = "salutation")
    private WebElement salutationComboBox;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameTxtBox;

//    @FindBy(xpath = "//input[@name='lastName']")
//    private WebElement lastNameXpath;

    @FindBy(css = "input[placeholder='Search Accounts...']")
    private WebElement accountSearchBox;

    @FindBy(name = "Title")
    private WebElement titleTxtBox;

    @FindBy(name = "Department")
    private WebElement departmentTxtBox;

    @FindBy(name = "Birthdate")
    private WebElement birthdateCalendar;

    @FindBy(css = "input[placeholder='Search Contacts...']")
    private WebElement contactsSearchBox;

    @FindBy(xpath = "(//input[@class='slds-input slds-combobox__input'])[5]")
    private WebElement leadSourcComboBox;

    @FindBy(name = "Phone")
    private WebElement phoneTxtBox;

    @FindBy(name = "HomePhone")
    private WebElement homePhoneTxtBox;

    @FindBy(name = "MobilePhone")
    private WebElement mobilePhoneTxtBox;

    @FindBy(name = "OtherPhone")
    private WebElement otherPhoneTxtBox;

    @FindBy(name = "Fax")
    private WebElement faxTxtBox;

    @FindBy(name = "Email")
    private WebElement emailTxtBox;

    @FindBy(name = "AssistantName")
    private WebElement assistantNameTxtBox;

    @FindBy(name = "AssistantPhone")
    private WebElement assistantPhoneTxtBox;

    @FindBy(xpath = "(//textarea[@name='street'])[1]")
    private WebElement mailingStreetTxtBox;

    @FindBy(xpath = "(///input[@name='postalCode'])[1]")
    private WebElement mailingPostalCodeTxtBox;

    @FindBy(xpath = "(//input[@name='city'])[1]")
    private WebElement mailingCityTxtBox;

    @FindBy(xpath = "(//input[@name='province'])[1]")
    private WebElement mailingProvinceTxtBox;

    @FindBy(xpath = "(//input[@name='country'])[1]")
    private WebElement mailingCountryTxtBox;

    @FindBy(xpath = "(//textarea[@name='street'])[2]")
    private WebElement otherStreetTxtBox;

    @FindBy(xpath = "(///input[@name='postalCode'])[2]")
    private WebElement otherPostalCodeTxtBox;

    @FindBy(xpath = "(//input[@name='city'])[2]")
    private WebElement otherCityTxtBox;

    @FindBy(xpath = "(//input[@name='province'])[2]")
    private WebElement otherProvinceTxtBox;

    @FindBy(xpath = "(//input[@name='country'])[2]")
    private WebElement otherCountryTxtBox;

    @FindBy(name = "Languages__c")
    private WebElement languagesTxtBox;

    @FindBy(xpath = "(//input[@class='slds-input slds-combobox__input'])[6]")
    private WebElement levelComboBox;

    @FindBy(xpath = "(//force-record-layout-section//textarea)[3]")
    private WebElement descriptionTxtBox;

    //    @FindBy(name = "SaveEdit")
//    protected WebElement saveBtn;
    @FindBy(xpath = "//button[@name='SaveEdit']")
    protected WebElement saveBtn;

    private static final By SAVE_BTN = By.xpath("//button[@name='SaveEdit']");

    /**
     * Waits for the element in the page.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
////        wait.until(ExpectedConditions.visibilityOf(saveBtn));
//        wait.until(ExpectedConditions.presenceOfElementLocated(SAVE_BTN));
    }

    /**
     * Sets the firstName field.
     *
     * @param firstName firstName's value.
     */
    public void setFirstNameTxtBox(final String firstName) {
        webElementAction.setInputField(firstNameTxtBox, firstName);
    }

    /**
     * Sets the lastName field.
     *
     * @param lastName lastName's value.
     */
    public void setLastNameTxtBox(final String lastName) {
        webElementAction.setInputField(lastNameTxtBox, lastName);
    }

//    /**
//     * Sets the lastName field.
//     *
//     * @param lastNameX lastName's value.
//     */
//    public void setLastNameXpath(final String lastNameX) {
//        webElementAction.setInputField(lastNameXpath, lastNameX);
//    }

    /**
     * Sets the title field.
     *
     * @param title title's value.
     */
    public void setTitleTxtBox(final String title) {
        webElementAction.setInputField(titleTxtBox, title);
    }

    /**
     * Sets the department field.
     *
     * @param department department's value.
     */
    public void setDepartmentTxtBox(final String department) {
        webElementAction.setInputField(departmentTxtBox, department);
    }

    /**
     * Sets the birthdate field.
     *
     * @param birthdate birthdate' value.
     */
    public void setBirthdateCalendar(final String birthdate) {
        webElementAction.setInputField(birthdateCalendar, birthdate);
    }

    /**
     * Sets the phone field.
     *
     * @param phone phone's value.
     */
    public void setPhoneTxtBox(final String phone) {
        webElementAction.setInputField(phoneTxtBox, phone);
    }

    /**
     * Sets the homePhone field.
     *
     * @param homePhone homePhone's value.
     */
    public void setHomePhoneTxtBox(final String homePhone) {
        webElementAction.setInputField(homePhoneTxtBox, homePhone);
    }

    /**
     * Sets the mobilePhone field.
     *
     * @param mobilePhone mobilePhone's value.
     */
    public void setMobilePhoneTxtBox(final String mobilePhone) {
        webElementAction.setInputField(mobilePhoneTxtBox, mobilePhone);
    }

    /**
     * Sets the otherPhone field.
     *
     * @param otherPhone otherPhone's value.
     */
    public void setOtherPhoneTxtBox(final String otherPhone) {
        webElementAction.setInputField(otherPhoneTxtBox, otherPhone);
    }

    /**
     * Sets the fax field.
     *
     * @param fax fax's value.
     */
    public void setFaxTxtBox(final String fax) {
        webElementAction.setInputField(faxTxtBox, fax);
    }

    /**
     * Sets the email field.
     *
     * @param email email's value.
     */
    public void setEmailTxtBox(final String email) {
        webElementAction.setInputField(emailTxtBox, email);
    }

    /**
     * Sets the assistantName field.
     *
     * @param assistantName assistantName's value.
     */
    public void setAssistantNameTxtBox(final String assistantName) {
        webElementAction.setInputField(assistantNameTxtBox, assistantName);
    }

    /**
     * Sets the assistantPhone field.
     *
     * @param assistantPhone assistantPhone's value.
     */
    public void setAssistantPhoneTxtBox(final String assistantPhone) {
        webElementAction.setInputField(assistantPhoneTxtBox, assistantPhone);
    }

    /**
     * Sets the mailingStreet field.
     *
     * @param mailingStreet mailingStreet's value.
     */
    public void setMailingStreet(final String mailingStreet) {
        webElementAction.setInputField(mailingStreetTxtBox, mailingStreet);
    }

    /**
     * Sets the mailingPostalCode field.
     *
     * @param mailingPostalCode mailingPostalCode's value.
     */
    public void setMailingPostalCode(final String mailingPostalCode) {
        webElementAction.setInputField(mailingPostalCodeTxtBox, mailingPostalCode);
    }

    /**
     * Sets the mailingCity field.
     *
     * @param mailingCity mailingCity's value.
     */
    public void setMailingCity(final String mailingCity) {
        webElementAction.setInputField(mailingCityTxtBox, mailingCity);
    }

    /**
     * Sets the mailingProvince field.
     *
     * @param mailingProvince mailingProvince's value.
     */
    public void setMailingProvince(final String mailingProvince) {
        webElementAction.setInputField(mailingProvinceTxtBox, mailingProvince);
    }


    /**
     * Sets the mailingCountry field.
     *
     * @param mailingCountry mailingCountry's value.
     */
    public void setMailingCountry(final String mailingCountry) {
        webElementAction.setInputField(mailingCountryTxtBox, mailingCountry);
    }

    /**
     * Sets the otherStreet field.
     *
     * @param otherStreet otherStreet's value.
     */
    public void setOtherStreet(final String otherStreet) {
        webElementAction.setInputField(otherStreetTxtBox, otherStreet);
    }

    /**
     * Sets the otherPostalCode field.
     *
     * @param otherPostalCode otherPostalCode's value.
     */
    public void setOtherPostalCode(final String otherPostalCode) {
        webElementAction.setInputField(otherPostalCodeTxtBox, otherPostalCode);
    }

    /**
     * Sets the otherCity field.
     *
     * @param otherCity otherCity's value.
     */
    public void setOtherCity(final String otherCity) {
        webElementAction.setInputField(otherCityTxtBox, otherCity);
    }

    /**
     * Sets the otherProvince field.
     *
     * @param otherProvince otherProvince's value.
     */
    public void setOtherProvince(final String otherProvince) {
        webElementAction.setInputField(otherProvinceTxtBox, otherProvince);
    }

    /**
     * Sets the otherCountry field.
     *
     * @param otherCountry otherCountry's value.
     */
    public void setOtherCountry(final String otherCountry) {
        webElementAction.setInputField(otherCountryTxtBox, otherCountry);
    }

    /**
     * Sets the languages field.
     *
     * @param languages languages's value.
     */
    public void setLanguages(final String languages) {
        webElementAction.setInputField(languagesTxtBox, languages);
    }

    /**
     * Sets the description field.
     *
     * @param description description's value.
     */
    public void setDescription(final String description) {
        webElementAction.setInputField(descriptionTxtBox, description);
    }

    /**
     * Clicks on salutation ComboBox.
     */
    public void clickSalutationComboBox() {
        webElementAction.clickElement(salutationComboBox);
    }

    /**
     * Clicks on account SearchBox.
     */
    public void clickAccountSearchBox() {
        webElementAction.clickElement(accountSearchBox);
    }


    /**
     * Clicks on contacts SearchBox.
     */
    public void clickContactsSearchBox() {
        webElementAction.clickElement(contactsSearchBox);
    }

    /**
     * Clicks on salutation ComboBox.
     */
    public void clickLeadSourceComboBox() {
        webElementAction.clickElement(leadSourcComboBox);
    }

    /**
     * Clicks on salutation ComboBox.
     */
    public void clickLevelComboBox() {
        webElementAction.clickElement(levelComboBox);
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
