package tests;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;

@Listeners(utilities.TestListener.class)
public class BankingFlowTest extends BaseClass {

    @Test
    public void completeBankingFlow() throws Exception {

        driver.get(
                "https://parabank.parasoft.com/parabank/register.htm");

        Thread.sleep(2000);

        // Unique Username
        String username =
                "Narendra"
                + UUID.randomUUID()
                      .toString()
                      .replace("-", "")
                      .substring(0, 8);

        String password = "Narendra@123";

        System.out.println("Generated Username: " + username);

        // Registration

        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Narendra");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Jha");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Katihar");

        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Katihar");

        driver.findElement(By.id("customer.address.state"))
                .sendKeys("Bihar");

        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("854105");

        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("9875310068");

        driver.findElement(By.id("customer.ssn"))
                .sendKeys("123456789");

        driver.findElement(By.id("customer.username"))
                .sendKeys(username);

        driver.findElement(By.id("customer.password"))
                .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys(password);

        driver.findElement(
                By.xpath("//input[@value='Register']"))
                .click();

        Thread.sleep(5000);

        Assert.assertTrue(
                driver.getPageSource().contains("Welcome"));

        System.out.println("Registration Successful");

        // Logout

        WebElement logout =
                driver.findElement(By.linkText("Log Out"));

        logout.click();

        Thread.sleep(3000);

        // Login

        driver.findElement(By.name("username"))
                .sendKeys(username);

        driver.findElement(By.name("password"))
                .sendKeys(password);

        driver.findElement(
                By.xpath("//input[@value='Log In']"))
                .click();

        Thread.sleep(5000);

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Accounts Overview"));

        System.out.println("Login Successful");

        // Transfer Funds

        driver.findElement(
                By.linkText("Transfer Funds"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount"))
                .sendKeys("100");

        driver.findElement(
                By.xpath("//input[@value='Transfer']"))
                .click();

        Thread.sleep(5000);

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Transfer Complete"));

        System.out.println("Transfer Fund Successful");

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}