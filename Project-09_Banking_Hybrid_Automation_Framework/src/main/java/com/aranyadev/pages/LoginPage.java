package com.aranyadev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    // Locators

  protected By username = By.name("username");
  protected By password = By.name("password");
  protected By loginButton = By.cssSelector("input[type='submit']");
    private By registerLink = By.linkText("Register");


    // Constructor

    public LoginPage(WebDriver driver) {

        super(driver);

    }


    // Actions

    public AccountsOverviewPage login(String user, String pass) {

        sendKeys(username, user);

        sendKeys(password, pass);

        click(loginButton);

        return new AccountsOverviewPage(driver);

    }
    public void clickRegister() {

        click(registerLink);

    }

}