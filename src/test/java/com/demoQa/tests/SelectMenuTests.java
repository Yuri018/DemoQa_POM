package com.demoQa.tests;

import com.demoQa.pages.HomePage;
import com.demoQa.pages.SelectMenuPage;
import com.demoQa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getSelectMenu();
    }

    @Test
    public void selectOldStyleTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).selectOldStyle("Red");
    }

    @Test
    public void multiSelectTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).multiSelect(new String[]{"Green", "Blue", "Black"});
    }

    @Test
    public void standardMultiSelectTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).standardMultiSelect(2);
    }
}
