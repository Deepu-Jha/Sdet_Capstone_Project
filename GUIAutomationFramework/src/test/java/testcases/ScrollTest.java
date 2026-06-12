package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class ScrollTest extends BaseTest {

    @Test
    public void scrollValidation()
            throws Exception {

        HomePage home =
                new HomePage(driver);

        Thread.sleep(3000);

        home.scrollToMiddle();

        home.smoothScrollDown();

        Thread.sleep(3000);

        home.smoothScrollUp();

        Thread.sleep(5000);

        System.out.println(
                "Scroll Test Passed");
    }
}