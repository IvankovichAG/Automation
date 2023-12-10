package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
   1. Open Chrome browser
   2. Go to docuport
   3. Click on forgot password
   4. validate URL contains: reset-password
   5. validate - Enter the email address associated with your account
   6. enter forgotpasswordg1@gmail.com to email box
   7. validate cancel button is displayed
   8. validate send button is displayed
   9. click send button
   10. validate - We've sent you an email with a link to reset your password. Please check your email
    */
public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");

        //3.Click on forgot password
        WebElement forgPassw = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgPassw.click();

        //4. validate URL contains: reset-password
        String actualURLForResetPassword = driver.getCurrentUrl();

        if (actualURLForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)) {
            System.out.println("TEST PASS: " + actualURLForResetPassword + " contains " + DocuportConstants.RESET_PASSWORD_URL);
        } else {
            System.out.println("TEST FAIL");
        }

        //5. validate - Enter the email address associated with your account

        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage = validateMessage.getText();

        if (actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)) {
            System.out.println("TEST PASS: \"" + actualValidateMessage + "\" contains \"" + DocuportConstants.RESET_PASSWORD_MESSAGE);
        } else {
            System.out.println("TEST FAIL");
        }

        //6. enter forgotpasswordg1@gmail.com to email box

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        //7. 8. validate cancel button is displayed    // validate send button is displayed

        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space()='Cancel']"));
        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space()='Send']"));

        if (cancelButton.isDisplayed()) {
            System.out.println("TEST PASS: Cancel Button is Displayed");
        } else {
            System.out.println("TEST PASS: Cancel Button is NOT Displayed");
        }

        if (sendButton.isDisplayed()) {
            System.out.println("TEST PASS: Send Button is Displayed");
        } else {
            System.out.println("TEST PASS: Send Button is NOT Displayed");
        }

        // 9. click send button

        sendButton.click();

        Thread.sleep(3000);

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(5000);

        // 10. validate - We've sent you an email with a link to reset your password. Please check your email

        try{
            System.out.println(successMessage.getText());
        } catch (StaleElementReferenceException e){
            System.out.println("Element is not there anymore");
           // e.printStackTrace();
        }

    }
}
