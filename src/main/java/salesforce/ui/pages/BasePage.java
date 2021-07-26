/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import core.selenium.WebDriverManager;
import core.selenium.WebElementAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {


    /**
     * WebDriver instance.
     */
    protected WebDriver driver;

    /**
     * WebDriverWait instance.
     */
    protected WebDriverWait wait;

    /**
     * WebElementAction instance.
     */
    protected WebElementAction webElementAction;

    /**
     * Constructor method.
     */
    public BasePage() {
        this.driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
        webElementAction = new WebElementAction();
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    protected abstract void waitUntilPageObjectIsLoaded();
}
