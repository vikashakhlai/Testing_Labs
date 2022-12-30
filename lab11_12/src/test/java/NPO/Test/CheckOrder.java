package NPO.Test;

import NPO.Page.EllesseHomePage;
import NPO.driver.DriverSingleton;
import NPO.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckOrder {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Check Order")
    public void Compare() throws InterruptedException {

        EllesseHomePage ellesseHomePage = new EllesseHomePage(driver);
        ellesseHomePage.OpenMainPage();

        ellesseHomePage.FindElementAndClick("/html/body/footer/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[8]/div");
        logger.info("open track list");
        WebElement searchInput=driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div/div/form/div/div[1]/input"));
        searchInput.sendKeys("search");
        WebElement codeInput=driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div/div/form/div/div[2]/input"));
        codeInput.sendKeys("code");
        ellesseHomePage.FindElementAndClick("/html/body/main/div[2]/div/div/div/div/div/div/form/div/div[3]/button");
        logger.info("track your order");
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
