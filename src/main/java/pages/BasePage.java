package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    private WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.instanceGet()
                                   .driverGet();
        PageFactory.initElements(this.driver, this);
    }

    public void click(WebElement webElement) {
        webElement.click();
    }
    public void sendKeys(WebElement webElement, String string) {
        webElement.sendKeys(string);
    }
    public String getText(WebElement webElement) {
        return webElement.getText();
    }

}
