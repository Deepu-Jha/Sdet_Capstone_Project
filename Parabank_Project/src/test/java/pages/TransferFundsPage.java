package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage {

    WebDriver driver;

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void transferFunds(String amount)
            throws Exception {

        driver.findElement(
                By.linkText("Transfer Funds"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount"))
                .clear();

        driver.findElement(By.id("amount"))
                .sendKeys(amount);

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[@value='Transfer']"))
                .click();

        Thread.sleep(5000);
    }
}