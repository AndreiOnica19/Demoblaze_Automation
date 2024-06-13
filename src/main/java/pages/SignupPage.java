package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    @FindBy(xpath = "(//input[@type='text'])[3]")
    WebElement emailField;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement passwordField;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    WebElement signupButton;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        emailField.sendKeys(Constants.generateRandomEmail());
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void clickSignupButton() {
        signupButton.click();
    }
}
