package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.util.List;

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

    public static void clickMultipleCheckBoxButton() {
        pages.Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.buttonCheckAll);
    }

    public static String getTextOfButtonMultipleCheckBox() {
        return Common.getElementAttributeValue(
                Locators.SeleniumEasy.CheckBoxDemo.buttonCheckAll,
                "value"
        );
    }

    public static boolean checkSelectedStatusOfAllCheckBoxes(boolean expectedStatus) {
        List<Boolean> statusList =
                pages.Common.getSelectedStatusOfCheckboxesByLocator(
                        Locators.SeleniumEasy.CheckBoxDemo.inputMultipleCheckBox
                );
        for (Boolean status : statusList) {
            if (status != expectedStatus) return false;
        }

        return true;
    }
}
