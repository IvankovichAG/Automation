package com.loop.test.day8_windowtables_config;

import com.loop.test.base.Base;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/*
   1. login as an advisor
   2. go to users
   3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
   4. validate that user name for alex.de.souza@gmail.com is alexdesouze
   5. validate that phone number for alex.de.souza@gmail.com is +994512060042
   6. validate that role for alex.de.souza@gmail.com is client
   7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
    */
public class T1_WebTables extends Base {
    @Test
    public void test_WebTables() throws InterruptedException {

        driver.get("https://beta.docuport.app");
//        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
//
//        Thread.sleep(3000);
//        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
//        users.click();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String expectedFullName = "Alex De Souza";
//        String actualFullName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
//        System.out.println("actualFullName = " + actualFullName);
//  #1
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        Thread.sleep(3000);
//  #2
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//  #3
        String expectedFullName = "Alex De Souza";
        String actualFullName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
        Assert.assertEquals(expectedFullName, actualFullName, "Test fail");
// #4
        String expectedUN = "alexdesouze";
        String actualUN = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "username");
        Assert.assertEquals(expectedUN, actualUN, "Test Fail");
// #5
        String expectedPhoneNumber = "+994512060042";
        String actualPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "phone number");
        Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber, "Test fail");
//  #6
        String expectedRole = "Client";
        String actualRole = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "Role" );
        Assert.assertEquals(actualRole, expectedRole, "Test Fail");
//  #7
        String expectedAdvisor = "Batch1 Group1";
        String actualAdvisor = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "Advisor" );
        Assert.assertEquals(actualAdvisor, expectedAdvisor, "Test Fail");





    }








}
