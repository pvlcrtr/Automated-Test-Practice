package pages;


import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy {
        public static class SimpleFormDemo {
            public static By formAd = By.xpath("//div[@id='at-cv-lightbox-content']");
            public static By buttonCloseAd = By.xpath("//*[@id='at-cv-lightbox-close']");
            public static By inputMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//*[@id='get-input']//button");
            public static By readMessage = By.xpath("//span[@id='display']");
            public static By inputFieldA = By.xpath("//*[@id='sum1']");
            public static By inputFieldB = By.xpath("//*[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By readTotal = By.xpath("//*[@id='displayvalue']");


        }
    }
}
