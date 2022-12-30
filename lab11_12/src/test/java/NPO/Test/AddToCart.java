package NPO.Test;

import NPO.Page.EllesseHomePage;
import NPO.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }

    @Test(description = "Add to cart")
    public void Cart() throws InterruptedException {
        EllesseHomePage ellesseHomePage = new EllesseHomePage(driver);
        ellesseHomePage.OpenMainPage();

        WebElement searchInput = driver.findElement(By.id("header-search-input"));
        searchInput.sendKeys("Albany T-Shirt Light Pink");
        logger.info("add text of search");
        searchInput.sendKeys(Keys.RETURN);
        WebElement tShirt=driver.findElement(By.className("athenaProductBlock_imageContainer"));
        tShirt.click();
        logger.info("search product");
        ellesseHomePage.FindElementAndClick("//*[@id=\"mainContent\"]/div[3]/div[2]/div/div[4]/div[2]/div/span/span/button");
        logger.info("add to cart");

    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
