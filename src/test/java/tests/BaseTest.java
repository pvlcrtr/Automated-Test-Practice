package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
//        pages.seleniumEasy.SimpleFormDemo.open();
//        pages.seleniumEasy.SimpleFormDemo.closeAd();

    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
