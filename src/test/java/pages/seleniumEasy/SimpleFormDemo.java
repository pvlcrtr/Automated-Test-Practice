package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class SimpleFormDemo {

    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(Locators.SeleniumEasy.SimpleFormDemo.formAd);
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonCloseAd);

    }

    public static void enterMessage(String expectedMessage) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.SimpleFormDemo.inputMessage,
                expectedMessage
        );
    }

    public static void enterValueA(String expectedMessage) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.SimpleFormDemo.inputFieldA,
                expectedMessage
        );
    }

    public static void enterValueB(String expectedMessage) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.SimpleFormDemo.inputFieldB,
                expectedMessage
        );
    }

    public static void clickShowMessageButton() {
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonShowMessage);
    }

    public static void clickGetTotalButton() {
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonGetTotal);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SimpleFormDemo.readMessage);
    }

    public static String readTotal() {
        return Common.getElementText(Locators.SeleniumEasy.SimpleFormDemo.readTotal);
    }
}
