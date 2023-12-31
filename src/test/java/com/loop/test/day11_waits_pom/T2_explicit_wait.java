package com.loop.test.day11_waits_pom;

import com.loop.pages.LoopPracticeDynamicLoadingPage;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
   1. go https://loopcamp.vercel.app/dynamic_loading/7.html
   2. Wait until title is “Dynamic title”
   3. Assert: Message “Done!” is displayed.
   4. Assert: Image is displayed.
 */
public class T2_explicit_wait {
LoopPracticeDynamicLoadingPage loopPracticeDynamicLoadingPage;
    WebDriverWait wait;

@BeforeMethod
    public void setUpMethod () {
    loopPracticeDynamicLoadingPage = new LoopPracticeDynamicLoadingPage();
    Driver.getDriver().get("https://loopcamp.vercel.app/dynamic_loading/7.html");
}

@Test
    public void explicit_wait_test () {

    wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.titleIs("Dynamic title"));
    Assert.assertEquals(Driver.getDriver().getTitle(), "Dynamic title");
    Assert.assertTrue(loopPracticeDynamicLoadingPage.doneMessage.isDisplayed());
    Assert.assertTrue(loopPracticeDynamicLoadingPage.image.isDisplayed());
}

@AfterMethod
public void tearDown() {
   // Driver.closeDriver();
}

}
