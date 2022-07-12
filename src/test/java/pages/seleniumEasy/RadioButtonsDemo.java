package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.time.LocalDate;

public class RadioButtonsDemo {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        
    }

    public static void clickRadioButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGender(gender));
    }

    public static void clickGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetCheckedValue);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldCheckedValue);
    }

    public static void clickGroupRadioButtonSex(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGenderForGroupRadio(gender));
    }
    public static void clickGroupRadioAgeSelector(String ageGroup) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputFrom0To5AgeSelectForGroupRadio(ageGroup));
    }
    public static void clickGetGroupRadioCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetValuesForGroupRadio);

    }
    public static String readGroupRadioMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldGetValueForGroupRadio);
    }


}
