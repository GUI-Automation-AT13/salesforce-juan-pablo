/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.contacts;

import org.openqa.selenium.By;
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

    private By deleteBtn = By.cssSelector("//div[@title='Delete']");
    private By confirmDeleteBtn = By.xpath("//span[text()='Delete']");
    private static final String A_TEXT = "//a[contains(text(),'%s')]";
    @FindBy(xpath = "//a[@title='Show 3 more actions']//lightning-primitive-icon")
    private WebElement arrowMenuIcon;
    /**
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newBtn));
    }

    /**
     * Clicks on new button.
     *
     * @return a ContactsFormPage instance
     */
    public ContactsFormPage clickNewBtn() {
        newBtn.click();
        return new ContactsFormPage();
    }

    /**
     * Gets the entity or company name text.
     *
     * @param fieldName .
     * @return a String with the entity or company name text.
     */
    public String getNamesText(final String fieldName) {
        return webElementAction.getElementText(driver.findElement(By.xpath(
                String.format(A_TEXT, fieldName))));
    }
}
