package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.Page;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected Page calculatorPage;

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        calculatorPage = new Page(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }
}
