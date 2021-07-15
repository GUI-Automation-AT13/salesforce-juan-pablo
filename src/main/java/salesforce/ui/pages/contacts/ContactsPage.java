package salesforce.ui.pages.contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class ContactsPage extends BasePage {

    /**
     * defines locator for Login Button.
     */
    @FindBy(css = "a[title='New']")
    private WebElement newBtn;

    /**
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newBtn));
    }

    private void clickNewBtn() {
        newBtn.click();
    }

//    /**
//     * Sets the username and password's value.
//     *
//     * @param userName a String with the username's value.
//     * @param password a String with the password's value.
//     * @return a Homepage instance.
//     */
//    public FormularioPage newSuccessful(final String userName, final String password) {
//        clickNewBtn();
//        return new FormularioPage(driver);
//    }
}
