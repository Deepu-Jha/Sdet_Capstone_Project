package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {

        driver.findElement(By.linkText("Log Out"))
                .click();
    }

    public void login(String username,String password) {

        driver.findElement(By.name("username"))
                .sendKeys(username);

        driver.findElement(By.name("password"))
                .sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();
    }
}