package salesforce.ui.pages.accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class AccountsPage extends BasePage {

    /**
     *
     */
    @FindBy(css = "a[title='New']")
    private WebElement nextBtn;

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    /**
     * .
     *
     * @return .
     */
    public NewAccountPopup openAccountPopup() {
        return new NewAccountPopup();
    }
}
