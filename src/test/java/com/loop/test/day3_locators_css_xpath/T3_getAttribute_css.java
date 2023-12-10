package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * go to docuport application
 * identify docuport with css
 * get value of the attribute
 * Validate if  it is "Docuport"
 */
public class T3_getAttribute_css {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");


        WebElement logo = driver.findElement(By.cssSelector("/img/logo.d7557277.svg"));
        String docuport = logo.getAttribute("alt");

        //if ()
    }
}
// locate username with css

// locate password with css

// locate login with css

// login to docuport

// locate home icon of docuport after login

// validate that you logged in