package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityB1Lesson03 {

  public static void main(String[] args) {
    gettingStaleElementReferenceException();
  }

  private static void gettingStaleElementReferenceException(){

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_B-1.html");

      WebElement email = driver.findElement(By.id("inputEmail"));
      WebElement spanish = driver.findElement(By.id("spanish"));
      spanish.click();

      if (email.isDisplayed() && email.isEnabled()) {
        System.out.println("Script worked, the email text box is displayed and enabled.");

        email.sendKeys("email@gmail.com");

        if (email.getText().equalsIgnoreCase("email@gmail.com")) {
          System.out.println("Script worked, 'email@gmail.com' was typed.");
        } else {
          System.out.println("Something went wrong with the script, 'email@gmail.com' was not set in the email box.");
        }
      } else {
        System.out.println("Script did not work, the email text box is not displayed and enabled.");
      }

    } finally {
      driver.quit();
    }
  }

}