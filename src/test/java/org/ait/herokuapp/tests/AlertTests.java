package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.AlertsPage;
import org.ait.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {
    // click on link JavaScript Alerts
    @BeforeMethod
    public void preconditions() {

        new HomePage(driver).getAlerts();
    }

    @Test
    public void acceptAlert() {
        // click on Click for JS Alert button
        // click on OK
        // assert text result 'You successfully clicked on alert'
        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

    @Test
    public void confirmAlertTest() {
        // click on Click for JS Confirm button
        // click on OK / cancel
        // assert text result 'OK / Cancel'
        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("Cancel") // ili "ok"
                .verifyResult("Cancel");// ili "ok"
    }

    @Test
    public void sendMessageToAlertTest() {
        // click on Click for JS Prompt button
        // enter 'hello'
        // click on OK
        // assert text result 'hello'
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("hello")
                .acceptAlert()
                .verifyResult("hello");
    }








}
