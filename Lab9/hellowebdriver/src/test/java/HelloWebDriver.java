import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.sites.google.com/site/httpwwwseleniumhqorg/download");

        //2 task
        WebElement searchInput= driver.findElement(By.id("jot-ui-searchInput"));
        searchInput.sendKeys("selenium java");
        WebElement searchElement=driver.findElement(By.id("sites-searchbox-search-button"));
        searchElement.click();

        driver=new EdgeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.quit();

    }
}
