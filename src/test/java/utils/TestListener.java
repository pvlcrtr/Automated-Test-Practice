package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class TestListener implements ITestListener {

    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String directory = "./screenshots";
        File screenshotFile = new File(directory + "/screenshot_" + UUID.randomUUID() + "first_screenshot.png");

        try {
            FileUtils.copyFile(screenshotRaw, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
}
