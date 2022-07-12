package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @DataProvider(name = "radioButtonGender")
    public Object[][] radioButtonGenderDataProvider() {
        return new Object[][]{
                {"Male"},
                {"Female"}
        };
    }

    @Test(dataProvider = "radioButtonGender")
    public void testRadioButtonGender(String gender) {
        pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(gender));
    }

    @DataProvider(name = "radioButtonGenderAndAgeGroup")
    public Object[][] radioButtonGenderAndAgeGroupDataProvider() {
        return new Object[][]{
                {"Male", "0 - 5"},
                {"Female", "0 - 5"},
                {"Male", "5 - 15"},
                {"Female", "5 - 15"},
                {"Male", "15 - 50"},
                {"Female", "15 - 50"}
        };
    }

    @Test(dataProvider = "radioButtonGenderAndAgeGroup")
    public void testGroupRadioButtonsDemoByGenderAndByAgeGroup(String gender, String ageGroup) {
        pages.seleniumEasy.RadioButtonsDemo.clickGroupRadioButtonSex(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGroupRadioAgeSelector(ageGroup);
        pages.seleniumEasy.RadioButtonsDemo.clickGetGroupRadioCheckedValue();
        String actualMessage = pages.seleniumEasy.RadioButtonsDemo.readGroupRadioMessage();

        Assert.assertTrue(actualMessage.contains(gender));
    }
}
