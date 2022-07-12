package tests.seleniumEasy;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
        // 1. Spaudziam mygtuka 'Check all'
        // 2. Patikrinam mygtuko teksta (turetu buti 'Uncheck all')
        // 3. Patikrinam, kad visi checkbox'ai yra pazymeti
        // 4. Spaudziam mygtuka 'Uncheck all'
        // 5. Patikrinam mygtuko teksta (turetu buti 'Check all')
        // 6. Patikrinma, kad visi checkbox'ai yra nuzymeti

        pages.seleniumEasy.CheckBoxDemo.clickMultipleCheckBoxButton();
        if (!expectedStatus) pages.seleniumEasy.CheckBoxDemo.clickMultipleCheckBoxButton();

        String actualButtonText = pages.seleniumEasy.CheckBoxDemo.getTextOfButtonMultipleCheckBox();
        Assert.assertEquals(actualButtonText, expectedButtonText);

        boolean status = pages.seleniumEasy.CheckBoxDemo.checkSelectedStatusOfAllCheckBoxes(expectedStatus);
        Assert.assertTrue(status);
    }
}
