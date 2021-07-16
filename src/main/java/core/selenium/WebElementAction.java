/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementAction {

    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * WebElementAction Constructor.
     */
    public WebElementAction() {
        driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
    }

    /**
     * Sets Input Fields.
     *
     * @param webElement element to set value.
     * @param text       value to set.
     */
    public void setInputField(final WebElement webElement, final String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Clicks on a WebElement.
     *
     * @param element for click
     */
    public void clickElement(final WebElement element) {
        element.click();
    }

    /**
     * Gets WebElement's text.
     *
     * @param element to get text.
     * @return a String the element's text.
     */
    public String getElementText(final WebElement element) {
        return element.getText();
    }
}
