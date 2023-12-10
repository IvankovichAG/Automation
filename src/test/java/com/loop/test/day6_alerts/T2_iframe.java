package com.loop.test.day6_alerts;

import com.beust.ah.A;
import com.loop.test.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
1- Open a chrome browser
2- Go to: https://loopcamp.vercel.app/iframe.html
3- Clear text from comment body
4- Type "Loop Academy" in comment body
5- Verify "Loop Academy" text is written in comment body
6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
*/
public class T2_iframe extends Base {

    @Test
    public void iframeYest() {

        driver.get("https://loopcamp.vercel.app/iframe.html");

        // # by xpath
        // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iframe);

        // # directly
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //# by ID
        //driver.switchTo().frame("mce_0_ifr");

        // # by index
        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loop Academy");
        driver.switchTo().defaultContent();   // will take us directly to html

       // driver.switchTo().parentFrame();   // will switch us to parent

        WebElement heading = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String actual = heading.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actual, expected, "Test Fail");

//        WebElement poweredBy = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
//
//        System.out.println(poweredBy.getText());

    }

    @Test
    public void listExample(){
        driver.get("https://amazon.com/");

        List <WebElement> iframe = new ArrayList<>();
        iframe = driver.findElements(By.xpath("//iframe"));
        System.out.println("Iframes: " + iframe.size());





    }



}
