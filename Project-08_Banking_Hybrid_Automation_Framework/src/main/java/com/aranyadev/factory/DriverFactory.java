package com.aranyadev.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();

            return new EdgeDriver();

        } else {

            throw new RuntimeException(
                    "Browser is not supported: " + browser
            );

        }

    }

}