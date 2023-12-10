package com.loop.test.day4_xpath_findelement;
/*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
         */

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_findElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.nba.com");

        List<WebElement> nbaLinks =  driver.findElements(By.tagName("a"));
        System.out.println("There are " + nbaLinks.size() + " links on this page");

        List<WebElement> nbaLinksXpath =  driver.findElements(By.xpath("//a"));
        System.out.println("There are " + nbaLinksXpath.size() + " links on this page");

        for (WebElement nbaLink : nbaLinks) {
            if (!nbaLink.getText().equals("")) {
                System.out.println(nbaLink.getText());
                System.out.println(nbaLink.getAttribute("href"));
            }
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if (!nbaLinks.get(i).getText().equals("")) {
                System.out.println(nbaLinks.get(i).getText());
                System.out.println(nbaLinks.get(i).getAttribute("href"));

            }
        }

    }
}
