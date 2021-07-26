package cucumber.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.entities.contacts.Contact;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.contacts.ContactPage;
import salesforce.ui.pages.contacts.ContactsFormPage;
import salesforce.ui.pages.contacts.ContactsPage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactsSteps {

    //Pages
    private HomePage homePage;
    private LoginPage loginPage;
    private ContactsPage contactsPage;
    private ContactsFormPage contactsFormPage;
    private ContactPage contactPage;
    SoftAssert softAssert = new SoftAssert();

    @Given("^I login to salesforce site as a(n) {String} user$")
    public void i_login_to_salesforce_site_as_an_user(final String userType) {
        //get credentials
        //login by ui if user isn't logged
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
    }


    @When("^I create a new Contact with fields")
    public void i_create_a_new_contact_with_fields(final Map<String, String> table) {
        //Setear los campos a la entity
        Contact contact = new ObjectMapper().convertValue(table, Contact.class);
        //Crear el contact entity UI
        contactsPage = new ContactsPage();
//        contactPage = contactsFormPage.setInputField("lastName", contact.getLastName()).clickSaveBtn();
//        contactsFormPage = contactsPage.clickNewBtn();
        contactsFormPage.createContactEntity(table.keySet(), contact);
    }

    @Then("^A successful message is displayed$")
    public void a_successful_message_is_displayed() {
//        softAssert.assertEquals("success\nContact " + "\"" + c + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
    }

    @And("^I check header name$")
    public void i_check_header_name(String contactLastName) {
        softAssert.assertEquals(contactLastName, contactPage.getPrincipalName());
    }

    @Then("^I check details fields$")
    public void i_check_details_fields(String contactLastName) {
        contactPage.clickDetailTab();
        softAssert.assertEquals(contactLastName, contactPage.getPrincipalName());
    }

    @Then("^I check the contacts was created$")
    public void i_check_the_contacts_was_created(String contactLastName) {
        softAssert.assertEquals(contactLastName, contactsPage.getNamesText(contactLastName));
        softAssert.assertAll();
    }


}
