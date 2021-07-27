package contacts;

import base.BaseTest;
import core.utils.DateToString;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.contacts.ContactPage;
import salesforce.ui.pages.contacts.ContactsFormPage;
import salesforce.ui.pages.contacts.ContactsPage;

public class CreateContactTest extends BaseTest {

    private HomePage homePage;
    private ContactsPage contactsPage;
    private ContactsFormPage contactsFormPage;
    private ContactPage contactPage;
    SoftAssert softAssert = new SoftAssert();
    String salutation = "Dr.";
    String firstName = "Contact";
    String lastName = "Test".concat(DateToString.dateToString());
    String fullName = salutation + " " + firstName + " " + lastName;
    String testName = firstName + " " + lastName;
    String title = "Title";
    String department = "Tarija";
    String birthdate = "19/7/2021";
    String phone = "1789654";
    String homePhone = "1789654";
    String mobilePhone = "1789654";
    String otherPhone = "1789654";
    String fax = "1789654";
    String email = "example@gmail.com";
    String assistantName = "AssistantName";
    String assistantPhone = "1789654";
    String languages = "English";
    String mailingStreet = "Ballivian";
    String postalCode = " Ballivian ";
    String city = "Tarija";
    String province = "Cercado";
    String country = "Bolivia";
    String otherStreet = "Ballivian";
    String otherPostalCode = " Ballivian ";
    String otherCity = "Tarija";
    String otherProvince = "Cercado";
    String otherCountry = "Bolivia";
    String description = "good test";
    String level = "Primary";
//
//    @Test
//    public void testCreateContactOnlyWithRequiredFields() {
//        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
//        contactsPage = pageTransporter.navigateToContactsPage();
//        contactsFormPage = contactsPage.clickNewBtn();
//        contactPage = contactsFormPage.setInputField("lastName", lastName).clickSaveBtn();
//        softAssert.assertEquals("success\nContact " + "\"" + lastName + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
//        contactPage.clickDetailTab();
//        softAssert.assertEquals(lastName, contactPage.getPrincipalName());
//        contactsPage = pageTransporter.navigateToContactsPage();
//        softAssert.assertEquals(lastName, contactsPage.getNamesText(lastName));
//        softAssert.assertAll();
//    }
//
//
//    @Test
//    public void createContactWithAllFields() {
//        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
//        contactsPage = pageTransporter.navigateToContactsPage();
//        contactsFormPage = contactsPage.clickNewBtn();
//        contactPage = contactsFormPage.selectFromDropdown("Salutation", salutation)
//                .setInputField("firstName", firstName)
//                .setInputField("lastName", lastName)
//                .selectFromDropdown("Lead Source", "Web")
//                .setInputField("Title", title)
//                .setInputField("Department", department)
//                .setInputField("Birthdate", birthdate)
//                .setInputField("Phone", phone)
//                .setInputField("HomePhone", homePhone)
//                .setInputField("MobilePhone", mobilePhone)
//                .setInputField("OtherPhone", otherPhone)
//                .setInputField("Fax", fax)
//                .setInputField("Email", email)
//                .setInputField("AssistantName", assistantName)
//                .setInputField("AssistantPhone", assistantPhone)
//                .setTextAreaField("Mailing Street", mailingStreet)
//                .setInputsField("Mailing Zip/Postal Code", postalCode)
//                .setInputsField("Mailing City", city)
//                .setInputsField("Mailing State/Province", province)
//                .setInputsField("Mailing Country", country)
//                .setTextAreaField("Other Street", otherStreet)
//                .setInputsField("Other Zip/Postal Code", otherPostalCode)
//                .setInputsField("Other City", otherCity)
//                .setInputsField("Other State/Province", otherProvince)
//                .setInputsField("Other Country", otherCountry)
//                .setInputField("Languages__c", languages)
//                .selectFromDropdown("Level", level)
//                .setTextAreaField("Description", description)
//                .clickSaveBtn();
//        String currentDate = DateToString.currentDateToString();
//        softAssert.assertEquals("success\nContact " + "\"" + salutation + " " + firstName + " " + lastName + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
//        softAssert.assertEquals(fullName, contactPage.getPrincipalName());
//        contactPage.clickDetailTab();
//        softAssert.assertEquals(fullName, contactPage.getDetailName());
//        softAssert.assertEquals(currentDate, contactPage.getDateText("Created By"));
//        softAssert.assertEquals(currentDate, contactPage.getDateText("Last Modified By"));
//        contactsPage = pageTransporter.navigateToContactsPage();
//        softAssert.assertEquals(testName, contactsPage.getNamesText(testName));
//        softAssert.assertAll();
//    }
}
