package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//a[@class='list-group-item'])[3]")
    WebElement sonyVaioI5Laptop;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement productBranch;

    @FindBy(xpath = "(//a[@id='itemc'])[3]")
    WebElement appleMonitor24;

    @FindBy(xpath = "(//a[@class='list-group-item'])[1]")
    WebElement samsungGalaxyS6;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSonyVaioI5Laptop() {
        sonyVaioI5Laptop.click();
    }

    public void clickProductBranch() {
        productBranch.click();
    }

    public void clickOnAppleMonitor24() {
        appleMonitor24.click();
    }

    public void clickOnSamsungGalaxyS6() {
        samsungGalaxyS6.click();
    }
}