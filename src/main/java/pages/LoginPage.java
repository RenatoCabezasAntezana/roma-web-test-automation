package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(css = "input[name='password']")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement submit;

    public LoginPage withUserName(String userName) {
        sendKeys(this.userName, userName);
        return this;
    }
    public LoginPage withPassword(String password) {
        sendKeys(this.password, password);
        return this;
    }
    public void clickLogin() {
        click(submit);
    }
}
