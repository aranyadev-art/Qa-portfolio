package com.aranyadev.tests;

import com.aranyadev.base.BaseTest;
import com.aranyadev.pages.AccountsOverviewPage;
import com.aranyadev.pages.LoginPage;
import com.aranyadev.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        // Accounts Page
        AccountsOverviewPage accountsPage =
                new AccountsOverviewPage(driver);

        // Logout
        accountsPage.logout();

        // Verify Login Page
        Assert.assertTrue(
                driver.getCurrentUrl().contains("index.htm")
        );

    }

}