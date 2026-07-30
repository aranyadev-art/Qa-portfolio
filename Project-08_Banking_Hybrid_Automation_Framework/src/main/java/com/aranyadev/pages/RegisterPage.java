package com.aranyadev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    // =========================
    // Locators
    // =========================

    private By firstName = By.id("customer.firstName");
    private By lastName = By.id("customer.lastName");
    private By address = By.id("customer.address.street");
    private By city = By.id("customer.address.city");
    private By state = By.id("customer.address.state");
    private By zipCode = By.id("customer.address.zipCode");
    private By phone = By.id("customer.phoneNumber");
    private By ssn = By.id("customer.ssn");
    private By username = By.id("customer.username");
    private By password = By.id("customer.password");
    private By confirmPassword = By.id("repeatedPassword");

    private By registerButton = By.xpath("//input[@value='Register']");

    private By successMessage =
            By.xpath("//p[contains(text(),'Your account was created successfully')]");

    // =========================
    // Constructor
    // =========================

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // =========================
    // Methods
    // =========================
    public String getSuccessMessage() {

        return getText(successMessage);

    }

    public void enterFirstName(String fname) {
        sendKeys(firstName, fname);
    }

    public void enterLastName(String lname) {
        sendKeys(lastName, lname);
    }

    public void enterAddress(String addr) {
        sendKeys(address, addr);
    }

    public void enterCity(String cityName) {
        sendKeys(city, cityName);
    }

    public void enterState(String stateName) {
        sendKeys(state, stateName);
    }

    public void enterZipCode(String zip) {
        sendKeys(zipCode, zip);
    }

    public void enterPhone(String phoneNo) {
        sendKeys(phone, phoneNo);
    }

    public void enterSSN(String ssnNumber) {
        sendKeys(ssn, ssnNumber);
    }

    public void enterUsername(String userName) {
        sendKeys(username, userName);
    }

    public void enterPassword(String pass) {
        sendKeys(password, pass);
    }

    public void enterConfirmPassword(String confirmPass) {
        sendKeys(confirmPassword, confirmPass);
    }

    public void clickRegister() {
        click(registerButton);
    }

}