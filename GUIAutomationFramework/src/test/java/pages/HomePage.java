package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToBottom() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);
    }

    public void scrollToTop() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0,0)");

        Thread.sleep(5000);
    }

    public void scrollToMiddle() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,500)");

        Thread.sleep(3000);
    }

    public void smoothScrollDown() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        for(int i = 0; i <= 3000; i += 300) {

            js.executeScript(
                    "window.scrollTo(0," + i + ")");

            Thread.sleep(1000);
        }
    }

    public void smoothScrollUp() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        for(int i = 3000; i >= 0; i -= 300) {

            js.executeScript(
                    "window.scrollTo(0," + i + ")");

            Thread.sleep(1000);
        }
    }

    public String getPageTitle() {

        return driver.getTitle();
    }
}