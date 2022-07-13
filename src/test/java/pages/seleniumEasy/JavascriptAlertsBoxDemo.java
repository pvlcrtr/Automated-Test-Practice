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
}
