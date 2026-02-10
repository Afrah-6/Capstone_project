package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="ctl00_lblTotalCartItems")  
    WebElement cartLink;

    @FindBy(name="ctl00$phBody$BookCart$lvCart$imgPayment")
    WebElement buyButton;

    public void openCart() {
        cartLink.click();
    }

    public void clickBuy() {
        buyButton.click();
    }
}
