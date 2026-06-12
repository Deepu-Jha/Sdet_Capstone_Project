package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage {

    WebDriver driver;

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
    }

    By transferFundsLink = By.linkText("Transfer Funds");

    By amount = By.id("amount");

    By transferBtn =
            By.xpath("//input[@value='Transfer']");

    public void transferFunds()
            throws Exception {

        driver.findElement(transferFundsLink).click();

        Thread.sleep(2000);

        driver.findElement(amount).sendKeys("100");

        Thread.sleep(1000);

        driver.findElement(transferBtn).click();

        Thread.sleep(3000);
    }
}