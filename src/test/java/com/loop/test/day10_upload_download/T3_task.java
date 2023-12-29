package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_task {

    @Test
   public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank = Driver.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank,debitAccount).perform();
        WebElement fiveK = Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

        action.dragAndDrop(fiveK, debitAmount).perform();

        WebElement sales = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement creditAccount = Driver.getDriver().findElement(By.xpath("//*[@id='loan']/li"));

        action.dragAndDrop(sales, creditAccount).perform();

         WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));
         action.dragAndDrop(fiveK, creditAmount).perform();

         WebElement successMessage = Driver.getDriver().findElement(By.xpath("//a[contains(.,'Perfect')]"));

         String expected = "Perfect!";
         String actual = successMessage.getText();

         Assert.assertEquals(actual, expected, "does not match expected");


    }

}
