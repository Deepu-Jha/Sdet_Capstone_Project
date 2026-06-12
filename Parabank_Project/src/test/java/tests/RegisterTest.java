package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

    WebDriver driver;

    public RegisterTest(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerBtn = By.xpath("//input[@value='Register']");

    public void registerUser(String user, String pass)
            throws Exception {

        driver.findElement(firstName).sendKeys("Narendra");
        Thread.sleep(500);

        driver.findElement(lastName).sendKeys("Jha");
        Thread.sleep(500);

        driver.findElement(address).sendKeys("Katihar");
        Thread.sleep(500);

        driver.findElement(city).sendKeys("Katihar");
        Thread.sleep(500);

        driver.findElement(state).sendKeys("Bihar");
        Thread.sleep(500);

        driver.findElement(zipCode).sendKeys("854105");
        Thread.sleep(500);

        driver.findElement(phone).sendKeys("9875310068");
        Thread.sleep(500);

        driver.findElement(ssn).sendKeys("123456789");
        Thread.sleep(500);

        driver.findElement(username).sendKeys(user);
        Thread.sleep(500);

        driver.findElement(password).sendKeys(pass);
        Thread.sleep(500);

        driver.findElement(confirmPassword).sendKeys(pass);
        Thread.sleep(500);

        driver.findElement(registerBtn).click();

        Thread.sleep(3000);
    }
}