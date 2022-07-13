package pages.demoQA;

import org.testng.annotations.Test;
import pages.Locators;

public class Buttons {
    public static void open() {
        pages.Common.openUrl("https://demoqa.com/buttons");
    }


    public static void performDoubleClick() {
        pages.Common.doubleClickElement(Locators.DemoQA.Buttons.buttonDoubleClick);
    }

    public static String readMessageOfDoubleClick() {
       return pages.Common.getElementText(Locators.DemoQA.Buttons.fieldDoubleClick);
    }

    public static void performRightClick() {
        pages.Common.rightClickElement(Locators.DemoQA.Buttons.buttonRightClick);
    }

    public static String readMessageOfRightClick() {
        return pages.Common.getElementText(Locators.DemoQA.Buttons.fieldRightClick);
    }
}
