package com.beginningselenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity02Lesson02 {

    private void activityLesson02AutomationScript(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        // the other script code will go here

        driver.quit();
    }

}
