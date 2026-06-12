package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadPage;

public class UploadTest extends BaseTest {

    @Test
    public void uploadFileTest()
            throws Exception {

        UploadPage upload =
                new UploadPage(driver);

        Thread.sleep(3000);

        upload.uploadFile(
            "C:\\Users\\naren\\OneDrive\\TestData1.xlsx");

        Thread.sleep(5000);

        System.out.println(
                "Upload Test Passed");
    }
}