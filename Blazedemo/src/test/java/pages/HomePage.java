package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By fromCity = By.name("fromPort");

    By toCity = By.name("toPort");

    By findFlightsBtn =
            By.xpath("//input[@value='Find Flights']");

    public void searchFlights(
            String departure,
            String destination) {

        Select from =
                new Select(driver.findElement(fromCity));

        from.selectByVisibleText(departure);

        Select to =
                new Select(driver.findElement(toCity));

        to.selectByVisibleText(destination);

        driver.findElement(findFlightsBtn).click();
    }
}