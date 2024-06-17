package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(css = "(//a[@class='nav-link'])[8]")
    WebElement signupLink;

    @FindBy(css = "#cartur")
    WebElement cartLink;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpLink() {
        signupLink.click();
    }

    public void clickOnCartLink() {
        cartLink.click();
    }
}
