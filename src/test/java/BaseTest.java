import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
        WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
    }
}
