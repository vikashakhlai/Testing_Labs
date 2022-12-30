package NPO.Test;

import NPO.Page.EllesseHomePage;
import NPO.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sort {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Sort items")
    public void Sort() throws InterruptedException {

        EllesseHomePage ellesseHomePage=new EllesseHomePage(driver);
        ellesseHomePage.OpenMainPage();
       driver.get("https://www.ellesse.com/mens/mens-slides.list?pageNumber=1&sortOrder=salesRank");

       ellesseHomePage.FindElementAndClick("/html/body/div[4]/div[1]/main/div[2]/div/div[1]/div[4]/span/button");
       logger.info("click sort");
       ellesseHomePage.FindElementAndClick("/html/body/div[4]/div[1]/main/div[2]/div/div[1]/div[4]/div/div[3]/ul/li/span");
       logger.info("select color product");
       ellesseHomePage.FindElementAndClick("/html/body/div[4]/div[1]/main/div[2]/div/div[1]/div[3]/span/button");
       logger.info("click block size");
       ellesseHomePage.FindElementAndClick("/html/body/div[4]/div[1]/main/div[2]/div/div[1]/div[3]/div/div[3]/ul/li[1]/span");
       logger.info("select size");
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
