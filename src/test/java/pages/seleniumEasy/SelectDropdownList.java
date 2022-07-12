package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class SelectDropdownList {
    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

    }

    public static void selectDayFromDropdownList(String value) {
        Common.selectOptionByValue(
                Locators.SeleniumEasy.SelectDropdownList.selectDayOfWeek,
                value
        );
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SelectDropdownList.fieldDayOfWeek);
    }
}
