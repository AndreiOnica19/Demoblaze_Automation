package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(xpath = "(//a[@class='hrefch'])[1]")
    WebElement addToCartButton;

    @FindBy(css = ".btn.btn-success.btn-lg")
    WebElement okButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOkButton() {
        okButton.click();
    }
}
