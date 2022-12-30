package NPO.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EllesseHomePage {
    public EllesseHomePage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement searchInput;
    private WebElement SearchResult;
    private WebDriver driver;


    public void OpenMainPage(){
        driver.get("https://www.ellesse.com");
    }

    public void SearchTerm(String xpath){
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"_com63ac6dfc731ef\"]/div/div/div[1]/div[4]/span/i"));
        searchInput.click();
        searchInput=driver.findElement((By.xpath("//*[@id=\"search_query_top\"]")));
        searchInput.sendKeys(xpath);
        searchInput.sendKeys(Keys.ENTER);
    }

    public WebElement FindElementAndClick(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        return element;
    }

    public WebElement FindElementByIdAndClick(String id){
        WebElement element = driver.findElement(By.xpath(id));
        element.click();
        return element;
    }

    public WebElement FindElementByClassAndClick(String className){
        WebElement element = driver.findElement(By.xpath(className));
        element.click();
        return element;
    }

    public WebElement FindElementByXpath(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        return element;
    }
}
