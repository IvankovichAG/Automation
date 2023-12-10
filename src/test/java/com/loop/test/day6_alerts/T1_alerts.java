package com.loop.test.day6_alerts;
/*
    Information alert practice
    1. Open browser
    2. Go to website: https://loopcamp.vercel.app/javascript-alerts.html
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Validate “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
    4. Click to “Click for JS Confirm” button
    5. Click to Cancel button from the alert
    6. Validate “You clicked: Cancel” text is displayed.

    Prompt alert practice
    1. Click to “Click for JS Prompt” button
    2. Send "Loop Academy"
    3. Click Ok
    4. Validate "You entered: Loop Academy" text is displayed


     */
import com.loop.test.base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class T1_alerts extends Base {


    @Test
    public void informationAlert(){

        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");

//        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//        dropdown.getFirstSelectedOption().getText();
//        List<String> list = new ArrayList<>();
//        List <WebElement> listWebElements = dropdown.getOptions();
//        for (WebElement listWebElement : listWebElements) {
//            list.add(listWebElement.getText());
//        }
//        dropdown.selectByIndex(1);
//        Assert.assertTrue(dropdown.isMultiple());

        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickForJSAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successMessage = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessage.getText();
        String expected = "You successfully clicked an alert";
        assertEquals(actual, expected, "Test fail: actual DOES not match expected");
    }

    @Test
    public void confirmationAlert(){


    driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
    WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
    clickForJSConfirm.click();

    driver.switchTo().alert().accept();   // will click ok and accept
        WebElement successMessageForConfirm = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageForConfirm.getText();
        String expected = "You clicked: Ok";
        assertEquals(actual, expected, "Test fail: actual DOES not match expected");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss();
        String actual1 = successMessageForConfirm.getText();
        String expected1 = "You clicked: Cancel";
        assertEquals(actual1, expected1, "Test fail: actual DOES not match expected");

    }

    @Test
    public void promptAlert() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickJSPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys(text);
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
        WebElement successMessageForPrompt = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageForPrompt.getText();
        String expected = "You entered: " + text;
        assertEquals(actual, expected, "Test fail: actual DOES not match expected");





    }
}
