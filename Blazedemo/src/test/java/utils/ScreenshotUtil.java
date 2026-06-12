package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static String captureScreenshot(
            WebDriver driver,
            String testName) {

        String screenshotDir =
                System.getProperty("user.dir")
                + "/screenshots";

        File directory =
                new File(screenshotDir);

        if (!directory.exists()) {
            directory.mkdirs();
        }

        String screenshotPath =
                screenshotDir + "/"
                + testName + ".png";

        try {

            File srcFile =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(
                                    OutputType.FILE);

            File destFile =
                    new File(screenshotPath);

            FileHandler.copy(
                    srcFile,
                    destFile);

            System.out.println(
                    "Screenshot saved at: "
                    + screenshotPath);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return screenshotPath;
    }
}