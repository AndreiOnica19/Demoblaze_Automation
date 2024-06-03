import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    @Test
    public void createAccountTest() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@class='nav-link'])[8]")).click();
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(Constants.generateRandomEmail());
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("onica3000");
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        Wait.waitInSeconds(1);
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(actualMessage, "Sign up successful.");
        System.out.println(actualMessage);
        driver.switchTo().alert().accept();

    }
}
