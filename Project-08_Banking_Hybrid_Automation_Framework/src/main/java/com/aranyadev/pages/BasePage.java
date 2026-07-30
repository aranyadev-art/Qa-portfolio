package com.aranyadev.pages;

import com.aranyadev.constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(
                        FrameworkConstants.EXPLICIT_WAIT
                )
        );

    }

    // Wait for element visibility
    public void waitForElement(By locator) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

    }

    // Click method
    public void click(By locator) {

        waitForElement(locator);

        driver.findElement(locator).click();

    }

    // Send Keys method
    public void sendKeys(By locator, String text) {

        waitForElement(locator);

        driver.findElement(locator).sendKeys(text);

    }

    // Get Text method
    public String getText(By locator) {

        waitForElement(locator);

        return driver.findElement(locator).getText();

    }

}