package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazone {
    public static void main(String[] args) {

/*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */

        WebDriverManager.chromedriver().setup();    // here we are setting our driver

        WebDriver driver = new ChromeDriver();    // create an instance variable
        driver.get("https://www.amazone.com");    // what page do you want to navigate
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();


    }
}
