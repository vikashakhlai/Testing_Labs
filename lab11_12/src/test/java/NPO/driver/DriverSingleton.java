package NPO.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static final String RESOURCES_PATH = "src\\test\\resources\\";
    private static WebDriver driver;


    private DriverSingleton() {
    }

    public static WebDriver getDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}