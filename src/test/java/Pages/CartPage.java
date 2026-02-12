package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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

    public void openCart() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(buyButton)).click();
        Thread.sleep(2000);
        cartLink.click();
    }

	public void clickBuy () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(buyButton)).click();
		Thread.sleep(2000);
		buyButton.click();
		
	}
    
    
}