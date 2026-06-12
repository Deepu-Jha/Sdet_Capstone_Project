package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    By upload = By.id("singleFileInput");

    public void uploadFile(String path)
            throws Exception {

        Thread.sleep(3000);

        driver.findElement(upload)
              .sendKeys(path);

        System.out.println(
                "File Uploaded Successfully");

        Thread.sleep(5000);
    }
}