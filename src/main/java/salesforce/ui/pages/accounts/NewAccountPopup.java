package salesforce.ui.pages.accounts;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class NewAccountPopup extends BasePage {

    /**
     * .
     */
    @FindBy(name = "Name")
    protected WebElement accountNameTxtBox;

    /**
     * .
     */
    @FindBy(name = "SaveEdit")
    protected WebElement saveBtn;

    /**
     * .
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
    }

    /**
     * .
     * @param accountName .
     * @return .
     */
    public NewAccountPopup setAccountName(final String accountName) {
        webElementAction.setInputField(accountNameTxtBox, accountName);
        return this;
    }

    /**
     * .
     * @return .
     */
    public AccountPage clickSaveBtn() {
        webElementAction.clickElement(saveBtn);
        return new AccountPage();
    }
}
