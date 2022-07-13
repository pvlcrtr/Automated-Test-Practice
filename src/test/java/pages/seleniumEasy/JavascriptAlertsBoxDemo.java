package pages.seleniumEasy;

import org.openqa.selenium.NoAlertPresentException;
import pages.Locators;
import utils.Driver;

public class JavascriptAlertsBoxDemo {

    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html\n");
    }

    public static void clickButtonToOpenAlertBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.JavascriptAlertsBoxDemo.buttonOpenAlertBox);
    }

    public static void clickOkToCloseAlertBox() {
        pages.Common.acceptAlert();
    }

    public static boolean isAlertPresent() {
        return pages.Common.isAlertPresent();
    }

    public static void clickButtonToOpenConfirmBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.JavascriptAlertsBoxDemo.buttonOpenConfirmBox);
    }

    public static void clickOkToCloseConfirmBox() {
        pages.Common.acceptAlert();
    }

    public static void clickCancelToCloseConfirmBox() {
        pages.Common.dismissAlert();
    }

    public static String readMessageFromConfirmBox() {
        return pages.Common.getElementText(Locators.SeleniumEasy.JavascriptAlertsBoxDemo.fieldMessageOfConfirmBox);
    }
}
