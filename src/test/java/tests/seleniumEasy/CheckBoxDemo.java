package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckBoxDemo extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.seleniumEasy.SimpleFormDemo.open();
    }

    @Test
    public void testSingleCheckBox() {
        String actualMessage;
        String expectedMessage = "Success - Check box is checked";
        pages.seleniumEasy.CheckBoxDemo.clickSingleCheckBox();
        actualMessage = pages.seleniumEasy.CheckBoxDemo.readMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
