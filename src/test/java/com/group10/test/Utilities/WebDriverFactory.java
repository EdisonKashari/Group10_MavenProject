package com.group10.test.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public  static WebDriver getDriver(String browserType ) {
        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("Firefox")) {
            WebDriverManager.chromedriver().setup();

            return  new FirefoxDriver();
        }
        else System.out.println("Given browser type is not exist");

        return null;
    }

}
