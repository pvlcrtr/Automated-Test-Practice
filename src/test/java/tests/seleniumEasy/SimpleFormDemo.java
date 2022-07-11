package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class SimpleFormDemo {

    @Test
    public void testSingleInputFieldInSeleniumEasy() {
        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();

        String expectedMessage = "Pavel";
        String actualMessage;

        pages.seleniumEasy.SimpleFormDemo.enterMessage(expectedMessage);
        pages.seleniumEasy.SimpleFormDemo.clickShowMessageButton();
        actualMessage = pages.seleniumEasy.SimpleFormDemo.readMessage();


        Assert.assertEquals(actualMessage, expectedMessage);

        Driver.closeDriver();
    }

    @Test
    public void testTwoInputFieldsSeleniumEasy() {
        String inputA = "5";
        String inputB = "7";
        String inputSum = "12";

        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();

        pages.seleniumEasy.SimpleFormDemo.enterValueA(inputA);
        pages.seleniumEasy.SimpleFormDemo.enterValueB(inputB);
        pages.seleniumEasy.SimpleFormDemo.clickGetTotalButton();
        String textTotal = pages.seleniumEasy.SimpleFormDemo.readTotal();

        Assert.assertEquals(textTotal, inputSum);

        //Driver.closeDriver();
    }
}
