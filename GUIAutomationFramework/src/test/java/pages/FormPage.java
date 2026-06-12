package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("name");
    By email = By.id("email");
    By phone = By.id("phone");
    By address = By.id("textarea");

    By male = By.id("male");

    By monday = By.id("monday");
    By tuesday = By.id("tuesday");

    By country = By.id("country");

    By colors = By.id("colors");

    By animals = By.id("animals");

    By datePicker1 = By.id("datepicker");

    By datePicker2 = By.id("txtDate");

    By submitBtn = By.xpath("//button[text()='Submit']");

    public void enterName(String value) throws Exception {

        driver.findElement(name).clear();
        driver.findElement(name).sendKeys(value);

        Thread.sleep(500);
    }

    public void enterEmail(String value) throws Exception {

        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(value);

        Thread.sleep(500);
    }

    public void enterPhone(String value) throws Exception {

        driver.findElement(phone).clear();
        driver.findElement(phone).sendKeys(value);

        Thread.sleep(500);
    }

    public void enterAddress(String value) throws Exception {

        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(value);

        Thread.sleep(500);
    }

    public void selectGender() throws Exception {

        driver.findElement(male).click();

        Thread.sleep(500);
    }

    public void selectDays() throws Exception {

        driver.findElement(monday).click();
        driver.findElement(tuesday).click();

        Thread.sleep(500);
    }

    public void selectCountry(String countryName)
            throws Exception {

        Select select =
                new Select(driver.findElement(country));

        select.selectByVisibleText(countryName);

        Thread.sleep(1000);
    }

    public void selectColor() throws Exception {

        Select color =
                new Select(driver.findElement(colors));

        color.selectByVisibleText("Red");

        Thread.sleep(500);

        color.selectByVisibleText("Blue");

        Thread.sleep(500);
    }

    public void selectAnimal() throws Exception {

        Select animal =
                new Select(driver.findElement(animals));

        animal.selectByVisibleText("Dog");

        Thread.sleep(1000);
    }

    public void enterDatePicker1() throws Exception {

        driver.findElement(datePicker1).clear();

        driver.findElement(datePicker1)
              .sendKeys("06/06/2026");

        Thread.sleep(1000);
    }

    public void enterDatePicker2() throws Exception {

        driver.findElement(datePicker2).click();

        Thread.sleep(500);

        driver.findElement(datePicker2)
              .sendKeys("06/06/2026");

        Thread.sleep(1000);
    }

    public void clickSubmit() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                driver.findElement(submitBtn));

        Thread.sleep(1000);

        js.executeScript(
                "arguments[0].click();",
                driver.findElement(submitBtn));

        Thread.sleep(3000);
    }
}