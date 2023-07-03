package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static DriverManager driverManager;
    private WebDriver driver;
    private DriverManager() {
    }
    private synchronized static void instanceCreate() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
    }
    public static DriverManager instanceGet() {
        instanceCreate();
        return driverManager;
    }

    public void driverInitialize(String url) {
        try {
            String webdriver = System.getProperty("browser", "CHROME");
            switch (webdriver.toUpperCase()) {
                case "CHROME":
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/webDriver/mac/chromedriver");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get(url);
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;

                default:
                    break;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public WebDriver driverGet() {
        return driver;
    }

    public void driverClose() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}

