package tests.seleniumEasy;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class JavascriptAlertsBoxDemo extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.seleniumEasy.JavascriptAlertsBoxDemo.open();
    }

    @Test
    public void testToCloseAlertBox(){
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickButtonToOpenAlertBox();
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickOkToCloseAlertBox();

        Assert.assertFalse(
                pages.seleniumEasy.JavascriptAlertsBoxDemo.isAlertPresent()
        );
    }
    @Test
    public void testAcceptConfirmBox(){
        String expectedMessage = "OK";
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickOkToCloseConfirmBox();
        String actualMessage = pages.seleniumEasy.JavascriptAlertsBoxDemo.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testRejectConfirmBox(){
        String expectedMessage = "Cancel";
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavascriptAlertsBoxDemo.clickCancelToCloseConfirmBox();
        String actualMessage = pages.seleniumEasy.JavascriptAlertsBoxDemo.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
