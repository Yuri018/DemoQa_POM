package com.demoQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
        click(forms);
        return new SidePanel(driver);
    }

    @FindBy(css = ".fc-button-label")
    WebElement buttonLabel;

    public HomePage confirmCookie() {
        click(buttonLabel);
        return this;
    }

    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        click(alertsFrameWindows);
//        clickWithJS(alertsFrameWindows, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        click(widgets);
//        clickWithJS(widgets, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        click(elements);
//        clickWithJS(widgets, 0, 300);
        return new SidePanel(driver);
    }
}
