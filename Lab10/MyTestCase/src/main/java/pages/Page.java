package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends BasePage {
    public Page(WebDriver driver) {
        super(driver);
    }

    private By pasteFindItem = By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/div[5]/div/div[1]/div/div/div[2]/ul/li[1]/a");
    private By pasteAddToFavourites = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div/div[4]/div/div[1]/button/span[2]/svg");

    public void openPage(){
        driver.get("https://www.ellesse.com/");
    }

    public void addToFavourites(){
        driver.findElement(pasteFindItem).click();
        driver.findElement(pasteAddToFavourites).click();
    }
}
