package cucumber.steps;

import io.cucumber.java.en.When;
import salesforce.ui.PageTransporter;
import salesforce.ui.Pages;

public class NavigationSteps {

//    @When("^I navigate to (ACCOUNT|CONTACTS) page$")
    @When("^I navigate to \"([^\"]*)\" page$")
    public void i_navigate_to_contacts_page(final Pages page ) {
        System.out.println(page);
        PageTransporter.navigateToURLByPageName(page);
    }
}
