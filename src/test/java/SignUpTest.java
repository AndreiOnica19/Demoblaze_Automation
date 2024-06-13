import data.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.SignupPage;
import utils.Wait;

public class SignUpTest extends BaseTest {
    @Test
    public void createAccountTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickSignUpLink();
        Wait.waitInSeconds(1);
        SignupPage signupPage = new SignupPage(driver);
        signupPage.inputEmail();
        signupPage.inputPassword();
        signupPage.clickSignupButton();
        Wait.waitInSeconds(1);
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(actualMessage, Constants.EXPECTED_MESSAGE);
        System.out.println(actualMessage);
        driver.switchTo().alert().accept();
    }
}
