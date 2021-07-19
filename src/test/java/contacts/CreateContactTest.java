package contacts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.contacts.ContactPage;
import salesforce.ui.pages.contacts.ContactsFormPage;
import salesforce.ui.pages.contacts.ContactsPage;

public class CreateContactTest extends BaseTest {

    private HomePage homePage;
    private  ContactsPage contactsPage;
    private ContactsFormPage contactsFormPage;
    private ContactPage contactPage;

    @Test
    public void testCreateContactOnlyWithRequiredFields() {
        String contactLastName = "Contact Test";
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(),EnvConfig.getInstance().getPassword());
        contactsPage = pageTransporter.navigateToContactsPage();
        contactsFormPage = contactsPage.clickNewBtn();
        contactsFormPage.setLastNameTxtBox(contactLastName);
        contactPage = contactsFormPage.clickSaveBtn();
        Assert.assertEquals("success\nContact " + "\"" + contactLastName + "\"" + " was created.\nClose",
                contactPage.getTextAlertSuccess());
    }


    @Test
    public void createContactWithAllFields() {
        String firstName = "Contact";
        String lastName = "Test";
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(),EnvConfig.getInstance().getPassword());
        contactsPage = pageTransporter.navigateToContactsPage();
        contactsFormPage = contactsPage.clickNewBtn();
        contactsFormPage.setFirstNameTxtBox(firstName);
        contactsFormPage.setLastNameTxtBox(lastName);
        contactsFormPage.setTitleTxtBox("title");
        contactsFormPage.setDepartmentTxtBox("department");
        contactsFormPage.setPhoneTxtBox("phone");
        contactsFormPage.setHomePhoneTxtBox("homephone");
        contactsFormPage.setMobilePhoneTxtBox("mobilephone");
        contactsFormPage.setOtherPhoneTxtBox("otherphone");
        contactsFormPage.setFaxTxtBox("fax");
        contactsFormPage.setEmailTxtBox("jp@gmail.com");
        contactsFormPage.setAssistantNameTxtBox("assistant name");
        contactsFormPage.setAssistantPhoneTxtBox("assistant phone");
        contactsFormPage.setMailingStreet("mailing Street");
        contactsFormPage.setMailingPostalCode("postal code");
        contactsFormPage.setMailingCity("city");
        contactsFormPage.setMailingProvince("province");
        contactsFormPage.setMailingCountry("county");
        contactsFormPage.setOtherStreet("other street");
        contactsFormPage.setOtherPostalCode("other postal code");
        contactsFormPage.setOtherCity("other city");
        contactsFormPage.setOtherProvince("other Province");
        contactsFormPage.setOtherCountry("other country");
        contactsFormPage.setLanguages("languages");
        contactsFormPage.setDescription("description");
        contactPage = contactsFormPage.clickSaveBtn();
        Assert.assertEquals("success\nContact " + "\"" + firstName+" "+lastName+ "\"" + " was created.\nClose",
                contactPage.getTextAlertSuccess());
    }
}
