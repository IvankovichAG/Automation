package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value expected - username
     */
public class T2_getText_getAttribute {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual placeholder: \"" + actualHeaderForForm + "\" = Test Passed");
        } else {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual placeholder: \"" + actualHeaderForForm + "\" = Test Failed");
        }


        WebElement userNamePlaceHolder = driver.findElement(By.name("username"));
        String actualPlaceHolderForUserName = userNamePlaceHolder.getAttribute("placeholder");
        //System.out.println("actualPlaceHolderForUserName = " + actualPlaceHolderForUserName);

        if (actualPlaceHolderForUserName.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME)) {
            System.out.println("Expected placeholder for username: " + LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME + " matches actual placeholder " + actualPlaceHolderForUserName + " Passed");
        } else {
            System.out.println("Expected placeholder for username: " + LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME + " DOES NOT match actual placeholder " + actualPlaceHolderForUserName + " Passed");
        }


    }
}
