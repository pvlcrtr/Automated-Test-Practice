package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SelectDropdownList extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.seleniumEasy.SelectDropdownList.open();
    }

    @Test
    public void testSelectDropdownList() {
        String actualMessage;
        String expectedMessage = "Friday";

        pages.seleniumEasy.SelectDropdownList.selectDayFromDropdownList(expectedMessage);
        actualMessage = pages.seleniumEasy.SelectDropdownList.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}





