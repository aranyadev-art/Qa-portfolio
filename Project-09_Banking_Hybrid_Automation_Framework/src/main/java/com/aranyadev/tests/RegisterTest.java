package com.aranyadev.tests;

import com.aranyadev.base.BaseTest;
import com.aranyadev.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aranyadev.pages.LoginPage;

public class RegisterTest extends BaseTest {

    @Test
    public void verifyUserRegistration() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.enterFirstName("Prem");
        registerPage.enterLastName("Kumar");
        registerPage.enterAddress("Delhi");
        registerPage.enterCity("Delhi");
        registerPage.enterState("Delhi");
        registerPage.enterZipCode("110001");
        registerPage.enterPhone("9876543210");
        registerPage.enterSSN("123456789");
        registerPage.enterUsername("prem15");
        registerPage.enterPassword("demo123");
        registerPage.enterConfirmPassword("demo123");

        registerPage.clickRegister();
        Assert.assertTrue(
                registerPage.getSuccessMessage()
                        .contains("Your account was created successfully")
        );

    }

}