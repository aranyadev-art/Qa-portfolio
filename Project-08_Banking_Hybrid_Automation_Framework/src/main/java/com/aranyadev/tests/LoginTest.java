package com.aranyadev.tests;

import com.aranyadev.base.BaseTest;
import com.aranyadev.pages.LoginPage;
import com.aranyadev.utils.ConfigReader;
import com.aranyadev.pages.AccountsOverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);

        AccountsOverviewPage accountsPage =
                loginPage.login(
                        ConfigReader.getProperty("username"),
                        ConfigReader.getProperty("password")
                );

    }

}