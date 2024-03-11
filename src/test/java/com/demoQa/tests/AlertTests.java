package com.demoQa.tests;

import com.demoQa.pages.AlertPage;
import com.demoQa.pages.HomePage;
import com.demoQa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).confirmCookie().getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void clickByAlertWithTimerTest(){
        new AlertPage(driver).hideIframes();
        new AlertPage(driver).clickByAlertWithTimer();
    }

    @Test
    public void selectResultTest(){
        new AlertPage(driver).hideIframes();
        new AlertPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageFromAlertTest(){
        new AlertPage(driver).hideIframes();
        new AlertPage(driver).sendMessageToAlert("Hallo World!").verifyMessage("Hallo World!");
    }
}
