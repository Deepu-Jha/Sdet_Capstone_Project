package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.*;

public class FlightBookingTest
        extends BaseTest {

    @Test
    public void bookFlight() {

        HomePage home =
                new HomePage(driver);

        FlightSelectionPage flight =
                new FlightSelectionPage(driver);

        PurchasePage purchase =
                new PurchasePage(driver);

        ConfirmationPage confirm =
                new ConfirmationPage(driver);

        home.searchFlights(
                "Boston",
                "London");

        Assert.assertTrue(
                flight.getFlightCount() > 0,
                "No Flights Found");

        System.out.println(
                "Flights Available");

        flight.chooseFirstFlight();

        purchase.purchaseFlight();

        String message =
                confirm.getConfirmationMessage();

        System.out.println(
                "Confirmation = "
                        + message);

        Assert.assertTrue(
                message.contains("Thank you"),
                "Booking Failed");

        System.out.println(
                "Flight Booking Successful");
    }
}