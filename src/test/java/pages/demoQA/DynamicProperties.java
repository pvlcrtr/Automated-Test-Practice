package pages.demoQA;

import pages.Locators;

public class DynamicProperties {
    public static void open() {
        pages.Common.openUrl("https://demoqa.com/dynamic-properties");
    }

    public static void clickButtonAfterEnabled() {
        pages.Common.waitForElementToBeClickable(Locators.DemoQA.DynamicProperties.buttonAfterEnabled);
        pages.Common.clickElement(Locators.DemoQA.DynamicProperties.buttonAfterEnabled);
    }

    public static void clickButtonAfterColorChange() {
        String atributeName = "class";
        String atributeValue = "text-danger";
        pages.Common.waitForElementAtributeContain(
                Locators.DemoQA.DynamicProperties.buttonAfterColorChangeStatus,
                atributeName,
                atributeValue
        );
        pages.Common.clickElement(Locators.DemoQA.DynamicProperties.buttonAfterColorChangeStatus);
    }
}
