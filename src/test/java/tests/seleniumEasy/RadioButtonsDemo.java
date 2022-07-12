package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @Test
    public void testRadioButtonByMaleGender() {
        String genderMale = "Male";
        String actualMessage;

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(genderMale);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(genderMale));
    }

    @Test
    public void testRadioButtonByFemaleGender() {

        String genderFemale = "Female";
        String actualMessage;

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(genderFemale);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(genderFemale));
    }

    @Test
    public void testGroupRadioButtonsDemoByMaleGenderByAgeFrom0To5() {
        String gender = "Female";
        String ageGroup = "5 - 15";
        String actualMessage;

        pages.seleniumEasy.RadioButtonsDemo.clickGroupRadioButtonSex(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGroupRadioAgeSelector(ageGroup);
        pages.seleniumEasy.RadioButtonsDemo.clickGetGroupRadioCheckedValue();
        actualMessage = pages.seleniumEasy.RadioButtonsDemo.readGroupRadioMessage();

        Assert.assertTrue(actualMessage.contains(gender));


    }
}
