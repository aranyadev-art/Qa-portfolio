package com.aranyadev.base;
import com.aranyadev.factory.DriverFactory;
import com.aranyadev.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {

        String browser = ConfigReader.getProperty("browser");

        // DriverFactory browser create karega
        driver = DriverFactory.createDriver(browser);

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Application
        driver.get(
                ConfigReader.getProperty("baseUrl")
        );

    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

           // driver.quit();

        }

    }

}