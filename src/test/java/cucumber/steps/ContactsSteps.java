package cucumber.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import core.selenium.WebDriverManager;
import core.utils.DateToString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.entities.contacts.Contact;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.contacts.ContactPage;
import salesforce.ui.pages.contacts.ContactsFormPage;
import salesforce.ui.pages.contacts.ContactsPage;
import java.util.Map;

public class ContactsSteps {

    private HomePage homePage;
    private ContactsPage contactsPage;
    private ContactsFormPage contactsFormPage;
    private ContactPage contactPage;
    private Contact contact;
    SoftAssert softAssert = new SoftAssert();

    private WebDriver driver;
    protected LoginPage loginPage;
    protected PageTransporter pageTransporter;

    @Given("^I login to salesforce site as an? (.*?) user$")
    public void i_login_to_salesforce_site_as_an_user(final String userType) {
        driver = WebDriverManager.getInstance().getDriver();
        driver.get(EnvConfig.getInstance().getLoginUrl());
        loginPage = new LoginPage();
        pageTransporter = new PageTransporter();
        loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
    }


    @When("^I create a new Contact with fields")
    public void i_create_a_new_contact_with_fields(final Map<String, String> table) {
        contact = new ObjectMapper().convertValue(table, Contact.class);
        contact.setLastName(contact.getLastName().concat(DateToString.dateToString()));
        contactsPage = new ContactsPage();
        contactsPage.clickNewBtn();
        contactsFormPage = new ContactsFormPage();
        contactPage = contactsFormPage.createContactEntity(table.keySet(), contact);
    }

    @Then("^A successful message is displayed$")
    public void a_successful_message_is_displayed() {
        softAssert.assertEquals("success\nContact " + "\"" + contact.getLastName() + "\"" + " was created.\nClose",
                contactPage.getTextAlertSuccess());
    }

    @And("^I check header name$")
    public void i_check_header_name() {
        softAssert.assertEquals(contact.getLastName(), contactPage.getPrincipalName());
    }

    @Then("^I check details fields$")
    public void i_check_details_fields() {
        contactPage.clickDetailTab();
        softAssert.assertEquals(contact.getLastName(), contactPage.getPrincipalName());
    }

    @Then("^I check the contacts was created$")
    public void i_check_the_contacts_was_created() {
        softAssert.assertEquals(contact.getLastName(), contactsPage.getNamesText(contact.getLastName()));
        softAssert.assertAll();
    }


}
