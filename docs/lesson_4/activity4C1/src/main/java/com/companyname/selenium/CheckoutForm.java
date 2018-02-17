package com.companyname.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutForm {
    public static void main(String[] args) throws InterruptedException {

        //Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // Go to activity 4-C-1 url
        driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_4/activity_4_C-1.html");

        // Locate all the writable fields, and write on them appropriate values

        // First name
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("John");

        // Last name
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Doe");

        // Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("john@doe.com");

        // Address
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Road Drive 200");

        // Country
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Australia");

        // ZIP
        WebElement zip = driver.findElement(By.id("zip"));
        zip.sendKeys("10117");

        // Save this information for next time
        WebElement saveInfo = driver.findElement(By.id("save-info"));
        saveInfo.click();



        Thread.sleep(3000);


        driver.quit();
    }
}
