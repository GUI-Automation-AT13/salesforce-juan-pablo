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

import static org.testng.Assert.assertEquals;

public class CreateContactTest extends BaseTest {

    private HomePage homePage;
    private ContactsPage contactsPage;
    private ContactsFormPage contactsFormPage;
    private ContactPage contactPage;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCreateContactOnlyWithRequiredFields() {
        String contactLastName = "Gonzales".concat(DateToString.dateToString());
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
        contactsPage = pageTransporter.navigateToContactsPage();
        contactsFormPage = contactsPage.clickNewBtn();
        contactPage = contactsFormPage.setInputField("lastName", contactLastName).clickSaveBtn();
        softAssert.assertEquals("success\nContact " + "\"" + contactLastName + "\"" + " was created.\nClose",
                contactPage.getTextAlertSuccess());
        contactPage.clickDetailTab();
//        softAssert.assertEquals(contactLastName, contactPage.getNamesText("Name"));
        softAssert.assertEquals(contactLastName, contactPage.getPrincipalName());
        contactsPage = pageTransporter.navigateToContactsPage();
        softAssert.assertEquals(contactLastName,contactsPage.getNamesText(contactLastName));
        softAssert.assertAll();
    }


    @Test
    public void createContactWithAllFields() {
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

        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
        contactsPage = pageTransporter.navigateToContactsPage();
        contactsFormPage = contactsPage.clickNewBtn();
        contactPage = contactsFormPage.selectFromDropdown("Salutation", salutation)
                .setInputField("firstName", firstName)
                .setInputField("lastName", lastName)
                .setInputField("Title", title)
                .setInputField("Department", department)
                .setInputField("Birthdate", birthdate)
                .selectFromDropdown("Lead Source", "Web")
                .setInputField("Phone", phone)
                .setInputField("HomePhone", homePhone)
                .setInputField("MobilePhone", mobilePhone)
                .setInputField("OtherPhone", otherPhone)
                .setInputField("Fax", fax)
                .setInputField("Email", email)
                .setInputField("AssistantName", assistantName)
                .setInputField("AssistantPhone", assistantPhone)
                .setMailingStreet("mailing Street")
                .setMailingPostalCode("postal code")
                .setMailingCity("city")
                .setMailingProvince("province")
                .setMailingCountry("county")
                .setOtherStreet("other street")
                .setOtherPostalCode("other postal code")
                .setOtherCity("other city")
                .setOtherProvince("other Province")
                .setOtherCountry("other country")
                .setInputField("Languages__c", languages)
                .selectFromDropdown("Level", "Primary")
                .setDescription("description")
                .clickSaveBtn();
        String currentDate = DateToString.currentDateToString();
        softAssert.assertEquals("success\nContact " + "\"" + salutation + " " + firstName + " " + lastName + "\"" + " was created.\nClose",
                contactPage.getTextAlertSuccess());
        softAssert.assertEquals(fullName, contactPage.getPrincipalName());
        contactPage.clickDetailTab();
        softAssert.assertEquals(fullName, contactPage.getDetailName());
        softAssert.assertEquals(currentDate,contactPage.getDateText("Created By"));
        softAssert.assertEquals(currentDate,contactPage.getDateText("Last Modified By"));
        contactsPage = pageTransporter.navigateToContactsPage();
        softAssert.assertEquals(testName,contactsPage.getNamesText(testName));
        softAssert.assertAll();
    }
}
