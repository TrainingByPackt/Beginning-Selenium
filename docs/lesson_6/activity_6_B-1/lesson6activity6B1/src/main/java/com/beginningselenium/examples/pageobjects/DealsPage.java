package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealsPage {

    private WebDriver driver;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/activity_6_B-1/deals.html";
    // WebElements
    private WebElement quote;

    public DealsPage (WebDriver webDriver) {
        this.driver = webDriver;
        if (!"Deals".equalsIgnoreCase(this.driver.getTitle())){
            this.open();
        }
    }


    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }

    public void close() {
        this.driver.quit();
    }

    public String getQuote() {
        quote = driver.findElement(By.id("quote"));
        return quote.getText();
    }
}
