package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    By alertButton = By.id("alertBtn");

    public void handleAlert() throws Exception {

        driver.findElement(alertButton).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert Text : "
                + alert.getText());

        Thread.sleep(3000);

        alert.accept();

        System.out.println(
                "Alert Accepted Successfully");
    }
}