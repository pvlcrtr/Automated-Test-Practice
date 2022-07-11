package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Driver;

public class SimpleFormDemo {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();

    }

    @Test
    public void testSingleInputFieldInSeleniumEasy() {
        String expectedMessage = "Pavel";
        String actualMessage;

        pages.seleniumEasy.SimpleFormDemo.enterMessage(expectedMessage);
        pages.seleniumEasy.SimpleFormDemo.clickShowMessageButton();
        actualMessage = pages.seleniumEasy.SimpleFormDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testTwoInputFieldsSeleniumEasy() {
        String inputA = "5";
        String inputB = "7";
        String inputSum = "12";
        String actualSum;

        pages.seleniumEasy.SimpleFormDemo.enterValueA(inputA);
        pages.seleniumEasy.SimpleFormDemo.enterValueB(inputB);
        pages.seleniumEasy.SimpleFormDemo.clickGetTotalButton();
        actualSum = pages.seleniumEasy.SimpleFormDemo.readTotal();

        Assert.assertEquals(actualSum, inputSum);
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
