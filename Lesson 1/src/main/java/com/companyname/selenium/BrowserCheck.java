package com.companyname.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserCheck {

    public static void main(String[] args) {
        // Open and close the Firefox Browser
        System.setProperty("webdriver.gecko.driver", "c:/browserdrivers/geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.close();

        // Open and close the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "c:/browserdrivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.close();

        // Open and close Internet Explorer
        System.setProperty("webdriver.ie.driver", "c:/browserdrivers/iedriverserver.exe");
        WebDriver ie = new InternetExplorerDriver();
        ie.quit();
    }
}
