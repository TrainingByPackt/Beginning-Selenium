package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03Concept03 {

  public static void main(String[] args) {
    interactingWithTextAreas();
  }

  private static void interactingWithTextAreas() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      WebElement masters = driver.findElement(By.cssSelector("input[value='masters']"));
      if (masters.isEnabled() && masters.isDisplayed()) {
        System.out.println("The radio button is enabled and visible.");
        if (!masters.isSelected()) {
          masters.click();
          if (masters.isSelected()) {
            System.out.println("It worked, the 'Masters' option was selected");
          } else {
            System.out.println("Something went wrong, 'Masters' was not selected.");
          }
        }

      } else {
        System.out.println("Something went wrong, the lement 'Masters' was not enabled and visible.");
      }
    } finally {
      driver.quit();
    }
  }

}

/*
public class ActivityLesson03 {

  private WebDriver driver;

  public void ActivityLesson03() {
    driver = new ChromeDriver();
    driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");
  }

  public void Test() {
    WebElement masters = driver.findElement(By
      .xpath("//input[@value='Masters']"));
    if (masters.isEnabled() && masters.isDisplayed())
    {
      System.out.println("Load of the test worked, the radio button is enabled and visible");
      if (!masters.isSelected())
      {
        masters.click();
        if (masters.isSelected())
            System.out.println("Load of the test worked, Masters was chosen as degree");
        else
            System.out.println("Something went wrong with the test, Masters was not chosen as degree");
      }
      else
         System.out.println("Something went wrong with the test, Masters is already selected");
    }
    else
      System.out.println("Something went wrong with the test, the radio button is not enabled or it is invisible");

  }

  driver.quit();

}
 */