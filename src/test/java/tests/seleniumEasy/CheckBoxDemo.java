package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckBoxDemo extends BaseTest {
    @BeforeMethod
    public void initialise() {
        pages.seleniumEasy.CheckBoxDemo.open();
    }

    @Test
    public void testSingleCheckBox() {
        String actualMessage;
        String expectedMessage = "Success - Check box is checked";
        pages.seleniumEasy.CheckBoxDemo.clickSingleCheckBox();
        actualMessage = pages.seleniumEasy.CheckBoxDemo.readMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @DataProvider(name = "multipleCheckBox")
    public Object[][] MultipleCheckBoxDataProvider() {
        return new Object[][]{
                {"Uncheck All", true},
                {"Check All", false},
        };
    }

    @Test(dataProvider = "multipleCheckBox")
    public void testMultipleCheckBox(String expectedButtonText, boolean expectedStatus) {
        pages.seleniumEasy.CheckBoxDemo.clickMultipleCheckBoxButton();
        if (!expectedStatus) pages.seleniumEasy.CheckBoxDemo.clickMultipleCheckBoxButton();

        String actualButtonText = pages.seleniumEasy.CheckBoxDemo.getTextOfButtonMultipleCheckBox();
        Assert.assertEquals(actualButtonText, expectedButtonText);

        boolean status = pages.seleniumEasy.CheckBoxDemo.checkSelectedStatusOfAllCheckBoxes(expectedStatus);
        Assert.assertTrue(status);
    }
}
