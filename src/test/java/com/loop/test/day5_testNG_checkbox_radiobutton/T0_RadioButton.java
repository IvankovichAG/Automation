package com.loop.test.day5_testNG_checkbox_radiobutton;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*
        https://demoqa.com/radio-button
        wait implicitly 10 seconds
         */
public class T0_RadioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");

        // wait the whole page loads

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // it's in Selenium 3

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // it's in Selenium 4

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));

        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        // is selected()

        System.out.println(red.isSelected() + " before clicking");   // boolean  (true/false)

        red.click();
        Thread.sleep(5000);

        System.out.println(red.isSelected() + " after clicking");   // boolean  (true/false)

        // isEnabled
        System.out.println(red.isEnabled() + " checking if enabled");
        System.out.println(green.isEnabled() + " checking if enabled");












    }
}
