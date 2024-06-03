import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {
    @Test
    public void makeAnOrderTest() {
        driver.findElement(By.xpath("(//a[@class='list-group-item'])[3]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//a[@class='hrefch'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
        Wait.waitInSeconds(2);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//a[@id='itemc'])[3]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//a[@class='hrefch'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
        Wait.waitInSeconds(1);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//a[@class='hrefch'])[4]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
        Wait.waitInSeconds(1);
        driver.switchTo().alert().accept();
        Wait.waitInSeconds(2);
        driver.findElement(By.cssSelector("#cartur")).click();
        Wait.waitInSeconds(3);
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.cssSelector("#name")).sendKeys(Constants.NAME);
        driver.findElement(By.cssSelector("#country")).sendKeys(Constants.COUNTRY);
        driver.findElement(By.cssSelector("#city")).sendKeys(Constants.CITY);
        driver.findElement(By.cssSelector("#card")).sendKeys(Constants.CARD);
        driver.findElement(By.cssSelector("#month")).sendKeys(Constants.CARD_MONTH);
        driver.findElement(By.cssSelector("#year")).sendKeys(Constants.CARD_YEAR);
        Wait.waitInSeconds(1);
        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
        Wait.waitInSeconds(1);
        String message = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your purchase!')]")).getText();
        Assert.assertEquals(message, "Thank you for your purchase!");
        driver.findElement(By.cssSelector(".confirm.btn.btn-lg.btn-primary")).click();
    }
}
