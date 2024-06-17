package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    @FindBy(css = ".btn.btn-success")
    WebElement placeOrderButton;

    @FindBy(css = "#name")
    WebElement nameField;

    @FindBy(css = "#country")
    WebElement countryField;

    @FindBy(css = "#city")
    WebElement cityField;

    @FindBy(css = "#card")
    WebElement cardField;

    @FindBy(css = "#month")
    WebElement monthField;

    @FindBy(css = "#year")
    WebElement yearField;

    @FindBy(css = ".confirm.btn.btn-lg.btn-primary")
    WebElement okButton;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    WebElement purchaseButton;

    @FindBy(xpath = "//*[contains(text(),'Thank you for your purchase!')]")
    WebElement thankYouMessage;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.click();
    }

    public void inputName() {
        nameField.sendKeys(Constants.NAME);
    }

    public void inputCountry() {
        countryField.sendKeys(Constants.COUNTRY);
    }

    public void inputCity() {
        cityField.sendKeys(Constants.CITY);
    }

    public void inputCardNumber() {
        cardField.sendKeys(Constants.CARD);
    }

    public void inputCardMonth() {
        monthField.sendKeys(Constants.CARD_MONTH);
    }

    public void inputCardYear() {
        yearField.sendKeys(Constants.CARD_YEAR);
    }

    public void clickOnPurchaseButton() {
        purchaseButton.click();
    }

    public String findsThankYouMessage() {
        return thankYouMessage.getText();
    }

    public void clickOnOkButton() {
        okButton.click();
    }
}
