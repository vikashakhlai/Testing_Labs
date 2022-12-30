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

public class DeleteFromFavourites {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Delete from favourites")
    public void Favourites() throws InterruptedException {

        EllesseHomePage ellesseHomePage = new EllesseHomePage(driver);
        ellesseHomePage.OpenMainPage();

        driver.get("https://www.ellesse.com/login.jsp?returnTo=https%3A%2F%2Fwww.ellesse.com%2FaccountHome.account");

        User user = new User("vikto.0222@gmail.com", "");
        logger.info("Create user");

        Thread.sleep(1000);
        WebElement inputEmail = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/div/div[1]/section/div/div[1]/div/form/div[2]/div/div/div[1]/input"));
        inputEmail.click();
        inputEmail.sendKeys(user.getEmail());
        logger.info("Enter email");

        Thread.sleep(1000);
        WebElement inputPassword = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/div/div[1]/section/div/div[1]/div/form/div[3]/div/div/div[1]/input"));
        inputPassword.click();
        inputPassword.sendKeys(user.getPassword());
        logger.info("Enter password");

        Thread.sleep(1000);
        ellesseHomePage.FindElementAndClick("/html/body/div[1]/div[5]/main/div/div[1]/section/div/div[1]/div/form/div[5]/div/button");
        logger.info("authorized");
        Thread.sleep(5000);

        Thread.sleep(5000);
        WebElement favourite = driver.findElement(By.xpath("//div[@class='fc_i_outer']"));
        favourite.click();
        logger.info("press heart button");
        Thread.sleep(5000);

        WebElement delete = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/div[1]/div[2]/div[2]/div[3]/div/div/button"));
        delete.click();
        logger.info("delete from favourites");
        Thread.sleep(5000);

    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
