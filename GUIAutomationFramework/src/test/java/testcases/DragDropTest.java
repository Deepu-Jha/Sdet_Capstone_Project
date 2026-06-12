package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DragDropPage;

public class DragDropTest extends BaseTest {

    @Test
    public void dragDropValidation()
            throws Exception {

        DragDropPage drag =
                new DragDropPage(driver);

        Thread.sleep(3000);

        drag.performDragDrop();

        Thread.sleep(5000);

        System.out.println(
                "Drag Drop Passed");
    }
}