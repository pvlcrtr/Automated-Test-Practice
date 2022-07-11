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


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(actualMessage, expectedMessage);

        Driver.closeDriver();
    }
}
