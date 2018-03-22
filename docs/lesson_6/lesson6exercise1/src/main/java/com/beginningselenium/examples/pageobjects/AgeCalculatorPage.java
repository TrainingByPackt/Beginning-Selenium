package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgeCalculatorPage {
    //WebElements
    private WebElement dayOfBirth;
    private WebElement monthOfBirth;
    private WebElement yearOfBirth;
    private WebElement age;
    private WebElement zodiacSign;
    private WebElement calculate;

    ///WebDriver
    private WebDriver driver;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html";

    //Class Constructor
    public AgeCalculatorPage(WebDriver webDriver) {
        driver = webDriver;

        // Initialize variables
        dayOfBirth = driver.findElement(By.id("dayOfBirth"));
        monthOfBirth = driver.findElement(By.id("monthOfBirth"));
        yearOfBirth = driver.findElement(By.id("yearOfBirth"));
        age = driver.findElement(By.id("age"));
        zodiacSign = driver.findElement(By.id("zodiacSign"));
        calculate = driver.findElement(By.id("calculate"));
    }

    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }
    public void close() {
        this.driver.close();
    }

    //Method to execute the test
    public void calculate(String day, String month, String year) {
        dayOfBirth.sendKeys(day);
        monthOfBirth.sendKeys(month);
        yearOfBirth.sendKeys(year);
        calculate.click();
    }

    //Methods to read values from required WebElements
    public String getAge() {
        return age.getAttribute("value");
    }

    public String getZodiacSign() {
        return zodiacSign.getAttribute("value");
    }
}
