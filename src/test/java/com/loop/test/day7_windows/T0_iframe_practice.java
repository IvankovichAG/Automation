package com.loop.test.day7_windows;

import com.loop.test.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

     */
public class T0_iframe_practice extends Base {
    @Test
    public void left(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();
        Assert.assertEquals(actualLeft.trim(), "LEFT");
    }

    @Test
    public void right(){

    }

    @Test
    public void middle(){

    }

    @Test
    public void bottom(){

    }


}