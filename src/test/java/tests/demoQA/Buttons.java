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
        //pages.demoQA.Buttons.open();
        pages.demoQA.Home.open();
        pages.demoQA.Home.clickElementsPage();
        pages.demoQA.Elements.clickButtonPage();
    }

    @Test
    public void testDoubleClick() {
        String expectedMessage = "You have done a double click";

        pages.demoQA.Buttons.performDoubleClick();
        String actualMessage = pages.demoQA.Buttons.readMessageOfDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test
    public void testRightClick() {
        String expectedMessage = "You have done a right click";

        pages.demoQA.Buttons.performRightClick();
        String actualMessage = pages.demoQA.Buttons.readMessageOfRightClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
