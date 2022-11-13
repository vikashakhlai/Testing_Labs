import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new OperaDriver();
        driver.get("https://pastebin.com");
        WebElement CodeInput=driver.findElement(By.id("postform-text"));
        CodeInput.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --forceHello from WebDriver");

        driver.findElement(By.id("select2-postform-format-container")).click();
        driver.findElement(By.xpath("//li[text()='Bash']")).click();

        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();

        WebElement NameInput = driver.findElement(By.id("postform-name"));
        NameInput.sendKeys("how to gain dominance among developers");

        driver.findElement(By.xpath("//button[@class='btn -big']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
