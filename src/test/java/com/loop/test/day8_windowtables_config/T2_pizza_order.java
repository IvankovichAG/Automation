package com.loop.test.day8_windowtables_config;

import com.loop.test.base.Base;
import com.loop.test.utilities.PizzaOrderWebTableUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
    3. test type
    4. test amount
    5. test date
    6. test street
    7. test city
    8. test state
    9. test zip
    10. test card
    11. test card number
    12. test exp
     */
public class T2_pizza_order extends Base {
@Test
    public void test_pizza_type() {
    driver.get("https://loopcamp.vercel.app/web-tables.html");
    String name = "Alexandra Gray";
    String expectedPizzaType = "Thin Crust";
    String actualPizzaType = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Pizza type");
    Assert.assertEquals(actualPizzaType, expectedPizzaType, "actual does not match expected");

    String expectedAmount = "2";
    String actualAmount = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Amount");
    Assert.assertEquals(actualAmount, expectedAmount, "actual does not match expected");

    String expectedDate = "04/15/2021";
    String actualDate = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Date");
    Assert.assertEquals(actualDate, expectedDate, "actual does not match expected");

    String expectedStreet = "7, Miller Street";
    String actualStreet = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Street");
    Assert.assertEquals(actualStreet, expectedStreet, "actual does not match expected");

    String expectedCity = "Chicago, IL";
    String actualCity = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "City");
    Assert.assertEquals(actualCity, expectedCity, "actual does not match expected");

    String expectedState = "US";
    String actualState = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "State");
    Assert.assertEquals(actualState, expectedState, "actual does not match expected");

    String expectedZip = "748";
    String actualZip = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Zip");
    Assert.assertEquals(actualZip, expectedZip, "actual does not match expected");

    String expectedCard = "VISA";
    String actualCard = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Card");
    Assert.assertEquals(actualCard, expectedCard, "actual does not match expected");

    String expectedCardNumber = "321456789012";
    String actualCardNumber = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Card Number");
    Assert.assertEquals(actualCardNumber, expectedCardNumber, "actual does not match expected");

    String expectedExp = "02/24";
    String actualExp = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Exp");
    Assert.assertEquals(actualExp, expectedExp, "actual does not match expected");

}

}
