package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;

public class AlertTest extends BaseTest {

    @Test
    public void alertValidation() throws Exception {

        AlertPage alertPage =
                new AlertPage(driver);

        Thread.sleep(3000);

        alertPage.handleAlert();

        Thread.sleep(5000);

        System.out.println(
                "Alert Test Passed");
    }
}