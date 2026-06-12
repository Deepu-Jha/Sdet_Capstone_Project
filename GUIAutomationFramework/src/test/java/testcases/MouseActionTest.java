package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseActionPage;

public class MouseActionTest extends BaseTest {

    @Test
    public void mouseActionValidation()
            throws Exception {

        MouseActionPage mouse =
                new MouseActionPage(driver);

        Thread.sleep(3000);

        mouse.mouseHover();

        Thread.sleep(3000);

        mouse.doubleClick();

        Thread.sleep(5000);

        System.out.println(
                "Mouse Actions Passed");
    }
}