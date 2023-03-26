import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTests {

    @Test
    public void OpenHomePageTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url = "http://websitetesting.lovestoblog.com";
        driver.get(url);
        WebElement headerElement = driver.findElement(By.xpath("//*[@class='site-title']/a"));
        Assertions.assertEquals("Web-Application Testing", headerElement.getText());
        driver.quit();
    }
}
