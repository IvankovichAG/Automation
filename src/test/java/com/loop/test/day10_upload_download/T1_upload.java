package com.loop.test.day10_upload_download;
  /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
     */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_upload {

    @Test
    public void upload_file () throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("guru.url"));
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        String path = "/Users/annaivankovich/Desktop/note.txt";
        chooseFile.sendKeys(path);

        WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//input[@id='terms']"));
        acceptButton.click();

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submitButton.click();
        Thread.sleep(3000);

        WebElement successMessage = Driver.getDriver().findElement(By.id("res"));
        System.out.println(successMessage.getText());
        String expectedMessage = "1 file\n" +
                "has been successfully uploaded.";
       Assert.assertEquals(successMessage.getText(), expectedMessage, "Test Fail");
        Driver.closeDriver();





    }


}
