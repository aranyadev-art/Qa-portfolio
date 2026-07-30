package com.aranyadev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewPage extends BasePage {

    // Locator
    private By accountsOverviewHeading =
            By.xpath("//h1[contains(text(),'Accounts Overview')]");

    private By logoutLink = By.linkText("Log Out");

    // Constructor
    public AccountsOverviewPage(WebDriver driver) {

        super(driver);

    }

    // Verify Accounts Overview page
    public boolean isAccountsOverviewDisplayed() {

        waitForElement(accountsOverviewHeading);

        return driver.findElement(accountsOverviewHeading).isDisplayed();

    }

    public void logout() {

        click(logoutLink);

    }

}