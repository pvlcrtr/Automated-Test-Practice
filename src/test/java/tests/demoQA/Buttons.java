package tests.demoQA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Buttons extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.demoQA.Buttons.open();
    }

    @Test
    public void testDoubleClick(){
        String expectedMessage = "You have done a double click";
        pages.demoQA.Buttons.performDoubleClick();
        String actualMessage = pages.demoQA.Buttons.readMessageOfDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
