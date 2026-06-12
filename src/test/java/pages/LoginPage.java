package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//input[@value='Log In']");

    public void login(String user, String pass) throws Exception {

        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);

        Thread.sleep(500);

        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);

        Thread.sleep(500);

        driver.findElement(loginBtn).click();

        Thread.sleep(3000);
    }
}