package test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyTestCase {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ellesse.com/");
        WebElement searchInput=driver.findElement(By.id("header-search-input"));
        Thread.sleep(2000);
        searchInput.sendKeys("Albany T-Shirt Light Pink");
        Thread.sleep(2000);
        driver.findElement(By.id("headerSearch_spyglass")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement heart=driver.findElement(By.className("heart"));
        heart.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
