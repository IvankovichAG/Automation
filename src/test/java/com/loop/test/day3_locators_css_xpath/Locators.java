package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // locate the element
        WebElement searchBoxWithId = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

       // aboutLink.click();

        // create a String what you want ti search
        searchBoxWithId.sendKeys("Feyruz");
        searchBoxWithId.clear();

        String textToSearch = "Loop Academy";
        searchBoxWithId.sendKeys(textToSearch + Keys.ENTER);




        //driver.quit();

    }
}
