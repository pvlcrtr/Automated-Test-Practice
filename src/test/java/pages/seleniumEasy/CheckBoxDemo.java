package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.util.concurrent.RecursiveTask;

public class CheckBoxDemo {

    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void clickSingleCheckBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.inputSingleCheckBox);
    }

    public static String readMessage() {
        return pages.Common.getElementText(Locators.SeleniumEasy.CheckBoxDemo.fieldSingleCheckBox);
    }
}
