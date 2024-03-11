package com.demoQa.tests;

import com.demoQa.pages.BrowserWindowsPage;
import com.demoQa.pages.HomePage;
import com.demoQa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).confirmCookie().getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindows();
    }

    @Test
    public void selectNewTabTest(){
        new BrowserWindowsPage(driver).hideIframes();
        new BrowserWindowsPage(driver).switchToNextTab(1).verifyNewTabTest("This is a sample page");
    }
}
