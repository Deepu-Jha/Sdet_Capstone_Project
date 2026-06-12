package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

@Listeners(utilities.TestListener.class)
public class LoginTest extends BaseClass {

    @Test
    public void loginTest() throws Exception {

        driver.get(
        "https://parabank.parasoft.com/parabank/index.htm");

        String username = "test";
        String password = "test";

        LoginPage login =
                new LoginPage(driver);

        login.login(username, password);

        Thread.sleep(3000);

        Assert.assertTrue(
                driver.getPageSource()
                .contains("Accounts Overview"));

        System.out.println("Login Successful");
    }
}