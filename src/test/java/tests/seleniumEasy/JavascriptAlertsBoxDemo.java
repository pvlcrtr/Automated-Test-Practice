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
}
