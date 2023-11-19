package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {

        // setup the driver
        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com/");

       // maximize the window
        driver.manage().window().maximize();


        // get title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", => TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", => TEST FAIL");
        }


        // get URL
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.contains(expectedUrl)) {
            System.out.println("Actual title: " + actualUrl + ", matches expected URL: " + expectedUrl + ", => TEST PASS");
        } else {
            System.err.println("Actual title: " + actualUrl + ", DOES NOT match expected Url: " + expectedUrl + ", => TEST FAIL");
        }

        driver.quit();



    }

}
