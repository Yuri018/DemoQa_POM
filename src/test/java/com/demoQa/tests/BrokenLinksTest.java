package com.demoQa.tests;

import com.demoQa.pages.BrokenLinksPage;
import com.demoQa.pages.HomePage;
import com.demoQa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectBrokenLinks();
    }

    @Test
    public void checkBrokenLinks(){
        new BrokenLinksPage(driver).hideIframes();
        new BrokenLinksPage(driver).checkBrokenLinks();
    }
}
