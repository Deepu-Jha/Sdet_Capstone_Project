package tests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.OpenAccountPage;
import pages.RegisterPage;
import pages.TransferFundsPage;
import utilities.RetryAnalyzer;

@Listeners(utilities.TestListener.class)
public class BankingFlowTest extends BaseClass {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void completeBankingFlow() throws Exception {

        driver.get(
        "https://parabank.parasoft.com/parabank/register.htm");

        String username =
                "Narendra" +
                UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 8);

        String password = "Narendra@123";

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        // Register
        RegisterPage register =
                new RegisterPage(driver);

        register.registerUser(username, password);

        Thread.sleep(5000);

        Assert.assertTrue(
                driver.getPageSource()
                .contains("Your account was created successfully"));

        System.out.println("Registration Successful");

        // Logout
        LoginPage login =
                new LoginPage(driver);

        login.logout();

        Thread.sleep(3000);

        // Login
        login.login(username, password);

        Thread.sleep(5000);

        Assert.assertTrue(
                driver.findElement(
                By.linkText("Accounts Overview"))
                .isDisplayed());

        System.out.println("Login Successful");

        // Open Account
        OpenAccountPage account =
                new OpenAccountPage(driver);

        account.openSavingsAccount();

        Thread.sleep(5000);

        System.out.println(
                "Account Opened Successfully");

        // Verify account page
        driver.findElement(
                By.linkText("Accounts Overview"))
                .click();

        Thread.sleep(3000);

        System.out.println(
                "Accounts Overview Opened");

        // Transfer Funds
        TransferFundsPage transfer =
                new TransferFundsPage(driver);

        transfer.transferFunds("100");

        Thread.sleep(5000);

        String pageText =
                driver.getPageSource();

        if(pageText.contains("Transfer Complete")) {

            System.out.println(
                    "Transfer Fund Successful");

        } else {

            System.out.println(
                    "Transfer Failed");

            System.out.println(
                    driver.getCurrentUrl());

            System.out.println(
                    pageText);
        }

        Assert.assertTrue(
                pageText.contains("Transfer Complete"),
                "Transfer Fund Failed");

        System.out.println("--------------------------------");
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("--------------------------------");
    }
}