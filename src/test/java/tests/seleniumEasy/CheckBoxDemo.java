package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Driver;

public class CheckBoxDemo {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
        pages.seleniumEasy.CheckBoxDemo.open();
       // pages.seleniumEasy.SimpleFormDemo.closeAd();
    }

    @Test
    public void testSingleCheckBox(){
        String actualMessage;
        String expectedMessage = "Success - Check box is checked";

        pages.seleniumEasy.CheckBoxDemo.clickSingleCheckBox();
        actualMessage = pages.seleniumEasy.CheckBoxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
