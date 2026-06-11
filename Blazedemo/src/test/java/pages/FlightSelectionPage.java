package pages;

import org.openqa.selenium.*;

public class FlightSelectionPage {

    WebDriver driver;

    public FlightSelectionPage(WebDriver driver) {

        this.driver = driver;
    }

    public int getFlightCount() {

        return driver.findElements(
                By.xpath("//table/tbody/tr"))
                .size();
    }

    public void chooseFirstFlight() {

        driver.findElement(
        By.xpath("(//input[@value='Choose This Flight'])[1]"))
        .click();
    }
}