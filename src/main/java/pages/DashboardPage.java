package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(css = "span > p")
    private WebElement user;

    public String getUser() {
        return getText(user);
    }

}
