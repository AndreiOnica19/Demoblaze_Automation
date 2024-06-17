import data.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;
import utils.Wait;

public class EndToEndTest extends BaseTest {
    @Test
    public void makeAnOrderTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSonyVaioI5Laptop();
        Wait.waitInSeconds(2);
        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(2);
        productPage.clickOkButton();
        Wait.waitInSeconds(2);
        driver.switchTo().alert().accept();
        homePage.clickProductBranch();
        Wait.waitInSeconds(2);
        homePage.clickOnAppleMonitor24();
        Wait.waitInSeconds(2);
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(2);
        productPage.clickOkButton();
        Wait.waitInSeconds(1);
        driver.switchTo().alert().accept();
        homePage.clickProductBranch();
        Wait.waitInSeconds(2);
        homePage.clickOnSamsungGalaxyS6();
        Wait.waitInSeconds(2);
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(2);
        productPage.clickOkButton();
        Wait.waitInSeconds(1);
        driver.switchTo().alert().accept();
        Wait.waitInSeconds(2);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickOnCartLink();
        Wait.waitInSeconds(3);
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnPlaceOrderButton();
        Wait.waitInSeconds(2);
        cartPage.inputName();
        cartPage.inputCountry();
        cartPage.inputCity();
        cartPage.inputCardNumber();
        cartPage.inputCardMonth();
        cartPage.inputCardYear();
        Wait.waitInSeconds(1);
        cartPage.clickOnPurchaseButton();
        Wait.waitInSeconds(1);
        String message = cartPage.findsThankYouMessage();
        Assert.assertEquals(message, Constants.THANK_YOU_MESSAGE);
        cartPage.clickOnOkButton();
    }
}
