package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseTest;

public class NavigationScrollTest extends BaseTest {

    @Test(priority = 1)
    public void homeSection() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        driver.findElement(By.linkText("Home")).click();

        Thread.sleep(5000);

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        System.out.println("Home Completed Successfully");
    }

    @Test(priority = 2)
    public void udemySection() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        driver.findElement(
                By.linkText("Udemy Courses")).click();

        Thread.sleep(5000);

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        System.out.println(
                "Udemy Courses Completed Successfully");
    }

    @Test(priority = 3)
    public void onlineTrainingSection() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        driver.findElement(
                By.linkText("Online Trainings")).click();

        Thread.sleep(5000);

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        System.out.println(
                "Online Trainings Completed Successfully");
    }

    @Test(priority = 4)
    public void blogSection() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        driver.findElement(By.linkText("Blog")).click();

        Thread.sleep(5000);

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        System.out.println(
                "Blog Completed Successfully");
    }

    @Test(priority = 5)
    public void playwrightPracticeSection()
            throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        driver.findElement(
                By.linkText("PlaywrightPractice")).click();

        Thread.sleep(5000);

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        System.out.println(
                "PlaywrightPractice Completed Successfully");
    }
}