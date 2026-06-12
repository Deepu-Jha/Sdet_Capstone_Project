package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAccountPage {

    WebDriver driver;

    public OpenAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSavingsAccount()
            throws Exception {

        driver.findElement(
                By.linkText("Open New Account"))
                .click();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//input[@value='Open New Account']"))
                .click();

        Thread.sleep(5000);
    }
}