package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args)  throws InterruptedException{

        // setting up the web driver
        WebDriverManager.chromedriver().setup();    // here we are setting our driver

        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();    // create an instance variable
       // Thread.sleep(5000);

        // navigate to web page

       driver.get("https://www.google.com");    // what page do you want to navigate
        //driver.navigate().to("https://www.google.com");

        //maximize
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        driver.navigate().to("https://www.etsy.com");

        // navigate back
       driver.navigate().back();

        // navigate forward

        //driver.navigate().forward();   // google - etsy - google - etsy

        driver.navigate().refresh();   // refreshed the page

        // quit and close
        //driver.quit();
        driver.close();









    }
}
