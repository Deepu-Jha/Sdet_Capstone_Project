package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void purchaseFlight() {

        driver.findElement(By.id("inputName"))
                .sendKeys("Narendra Kumar Jha");

        driver.findElement(By.id("address"))
                .sendKeys("Katihar");

        driver.findElement(By.id("city"))
                .sendKeys("Katihar");

        driver.findElement(By.id("state"))
                .sendKeys("Bihar");

        driver.findElement(By.id("zipCode"))
                .sendKeys("854105");

        Select card =
                new Select(driver.findElement(
                        By.id("cardType")));

        card.selectByVisibleText("Visa");

        driver.findElement(
                By.id("creditCardNumber"))
                .sendKeys("1234567890123456");

        driver.findElement(
                By.id("creditCardMonth"))
                .clear();

        driver.findElement(
                By.id("creditCardMonth"))
                .sendKeys("12");

        driver.findElement(
                By.id("creditCardYear"))
                .clear();

        driver.findElement(
                By.id("creditCardYear"))
                .sendKeys("2029");

        driver.findElement(
                By.id("nameOnCard"))
                .sendKeys("Narendra Kumar Jha");

        driver.findElement(
                By.xpath("//input[@value='Purchase Flight']"))
                .click();
    }
}