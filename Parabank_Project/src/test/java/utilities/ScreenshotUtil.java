package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(
            WebDriver driver,
            String fileName) throws Exception {

        File src =
                ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);

        String path =
                System.getProperty("user.dir")
                + "/screenshots/"
                + fileName + ".png";

        FileUtils.copyFile(src, new File(path));

        return path;
    }
}