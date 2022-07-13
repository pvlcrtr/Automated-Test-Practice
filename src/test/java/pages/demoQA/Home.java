package pages.demoQA;

import pages.Locators;

public class Home {
    public static void open() {
        pages.Common.openUrl("https://demoqa.com/");
    }

    public static void clickElementsPage() {
        pages.Common.clickElementByAction(Locators.DemoQA.Home.menuElements);
    }
}
