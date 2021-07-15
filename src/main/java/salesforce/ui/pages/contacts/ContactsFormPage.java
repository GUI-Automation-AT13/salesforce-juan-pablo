package salesforce.ui.pages.contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class ContactsFormPage extends BasePage {

    @FindBy(name = "firstName")
    private WebElement firstNameTxtBox;

    @FindBy(name = "lastName")
    private WebElement lastNameTxtBox;

    @FindBy(name = "Title")
    private WebElement titleTxtBox;

    @FindBy(name = "Department")
    private WebElement departmentTxtBox;

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

    @FindBy(xpath = "(//force-record-layout-section//textarea)[3]")
    private WebElement descriptionTxtBox;

    @FindBy(name = "SaveEdit")
    protected WebElement saveBtn;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
    }

    public void setFirstNameTxtBox(final String firstName) {
        webElementAction.setInputField(firstNameTxtBox, firstName);
    }

    public void setLastNameTxtBox(final String lastName) {
        webElementAction.setInputField(lastNameTxtBox, lastName);
    }

    public void setTitleTxtBox(final String title) {
        webElementAction.setInputField(titleTxtBox, title);
    }

    public void setDepartmentTxtBox(final String department) {
        webElementAction.setInputField(departmentTxtBox, department);
    }

    public void setPhoneTxtBox(final String phone) {
        webElementAction.setInputField(phoneTxtBox, phone);
    }

    public void setHomePhoneTxtBox(final String homePhone) {
        webElementAction.setInputField(homePhoneTxtBox, homePhone);
    }

    public void setMobilePhoneTxtBox(final String mobilePhone) {
        webElementAction.setInputField(mobilePhoneTxtBox, mobilePhone);
    }

    public void setOtherPhoneTxtBox(final String otherPhone) {
        webElementAction.setInputField(otherPhoneTxtBox, otherPhone);
    }

    public void setFaxTxtBox(final String fax) {
        webElementAction.setInputField(faxTxtBox, fax);
    }

    public void setEmailTxtBox(final String email) {
        webElementAction.setInputField(emailTxtBox, email);
    }

    public void setAssistantNameTxtBox(final String assistantName) {
        webElementAction.setInputField(assistantNameTxtBox, assistantName);
    }

    public void setMailingStreet(final String mailingStreet) {
        webElementAction.setInputField(mailingStreetTxtBox, mailingStreet);
    }

    public void setMailingPostalCode(final String mailingPostalCode) {
        webElementAction.setInputField(mailingPostalCodeTxtBox, mailingPostalCode);
    }

    public void setMailingCity(final String mailingCity) {
        webElementAction.setInputField(mailingCityTxtBox, mailingCity);
    }

    public void setMailingProvince(final String mailingProvince) {
        webElementAction.setInputField(mailingProvinceTxtBox, mailingProvince);
    }

    public void setMailingCountry(final String mailingCountry) {
        webElementAction.setInputField(mailingCountryTxtBox, mailingCountry);
    }

    public void setOtherStreet(final String otherStreet) {
        webElementAction.setInputField(otherStreetTxtBox, otherStreet);
    }

    public void setOtherPostalCode(final String otherPostalCode) {
        webElementAction.setInputField(otherPostalCodeTxtBox, otherPostalCode);
    }

    public void setOtherCity(final String otherCity) {
        webElementAction.setInputField(otherCityTxtBox, otherCity);
    }

    public void setOtherProvince(final String otherProvince) {
        webElementAction.setInputField(otherProvinceTxtBox, otherProvince);
    }

    public void setOtherCountry(final String otherCountry) {
        webElementAction.setInputField(otherCountryTxtBox, otherCountry);
    }

    public void setLanguages(final String languages) {
        webElementAction.setInputField(languagesTxtBox, languages);
    }

    public void setDescription(final String description) {
        webElementAction.setInputField(descriptionTxtBox, description);
    }

    public void clickSaveBtn() {
        saveBtn.click();
    }
}
