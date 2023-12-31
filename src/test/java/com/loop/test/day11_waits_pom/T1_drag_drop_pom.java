package com.loop.test.day11_waits_pom;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
Loop Practice Drag and Drop Test
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. validate expected default text appears on big circle
Expected = "Drag the small circle here."

Loop Practice Drag and Drop Test
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. validate "Drop here." text appears on big circle

1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Move it on top of the big circle
5. validate “Now drop…” text appears on big circ

1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. validate “Try again!” text appears on big circle
 */
public class T1_drag_drop_pom {

    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions action;

    @BeforeMethod
    public void set_up_method () {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        action = new Actions(Driver.getDriver());
    }

    @Test
    public void drag_small_here_test() {
//#1
        String expected = "Drag the small circle here.";
        String actual = loopPracticeDragDropPage.bigCircle.getText();
        assertEquals(actual, expected, "Test Fail");
    }
//#2
    @Test
    public void drop_here() {
        action.moveToElement(loopPracticeDragDropPage.smallCircle)            // method CHAINING
                .clickAndHold()
                .moveByOffset(100,100)
                .pause(3000)
                .perform();
        assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Drop here.", "Teat Fail");
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }


}
