/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.accounts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

import java.util.HashMap;

public class NewAccountPopup extends BasePage {

    @FindBy(xpath = "//input[@name='Name']")
    protected WebElement accountNameTxtBox;

    @FindBy(xpath = "//input[@name='Fax']")
    protected WebElement faxTxtBox;

    @FindBy(xpath = "//button[@name='SaveEdit']")
    protected WebElement saveBtn;

    private static final String INPUT_XPATH = "//input[@name='%s']";
    private static final String DROPDOWN_XPATH = "//lightning-combobox[label[text()='%s']]//input";
    private static final String DROPDOWN_OPTION_XPATH = "//lightning-base-combobox-item[.//span[text()='%s']]";

    private static final HashMap<String, String> INPUT_FIELD_NAMES = new HashMap<>();

    static {
        INPUT_FIELD_NAMES.put("Account Name", "Name");
        INPUT_FIELD_NAMES.put("SIC Code", "Sic");
    }

    /**
     * Waits form the element.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
    }

    /**
     * Sets the filed name and its value.
     *
     * @param fieldName  String with elements' name.
     * @param fieldValue String with value's field.
     * @return the same NewAccountPopup's instance.
     */
    public NewAccountPopup setInputField(final String fieldName, final String fieldValue) {
        String newFileName = fieldName.replaceAll(" ", "");
        webElementAction.setInputField(driver.findElement(By.xpath(String.format(INPUT_XPATH,
                INPUT_FIELD_NAMES.getOrDefault(fieldName, newFileName)))), fieldValue);
        return this;
    }

    /**
     * selects a dropdown option.
     *
     * @param fieldName   String with the dropdown name.
     * @param fieldOption String with the option name.
     * @return the same NewAccountPopup's instance.
     */
    public NewAccountPopup selectFromDropdown(final String fieldName, final String fieldOption) {
        webElementAction.clickElement(driver.findElement(By.xpath(String.format(DROPDOWN_XPATH, fieldName))));
        webElementAction.clickElement(driver.findElement(By.xpath(String.format(DROPDOWN_OPTION_XPATH, fieldOption))));
        return this;
    }

    /**
     * clicks on save button.
     *
     * @return a new instance for AccountPage.
     */
    public AccountPage clickSaveBtn() {
        webElementAction.clickElement(saveBtn);
        return new AccountPage();
    }
}
