package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownpage {
	
	WebDriver driver= stepdefinitions.login.driver;
	   
	 
    WebDriverWait wait;
    Actions actions;

    String selectedBookName;

    public dropdownpage(WebDriver driver) {
    	 driver.manage().window().maximize();
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.actions = new Actions(driver);
    }

    // Locators
    By kidsMenu = By.xpath("//a[contains(text(),'Kids')]");
    By akbarBirbalCategory = By.xpath("//a[contains(text(),'Akbar') and contains(text(),'Birbal')]");
    By illustratedAkbarBook = By.xpath("//*[@id=\"listpromoproduct\"]/div[2]/div/a/img");  
    By addToCartBtn = By.xpath("//*[@id=\"btnAddtocart\"]");
    By carticon=By.id("btnAddtocart");

    // Launch Website
    public void launchWebsite() {
        driver.get("https://www.bookswagon.com/");
        driver.manage().window().maximize();
    }

    // Hover on Kids
    public void hoverOnKids() {
        WebElement kids = wait.until(ExpectedConditions.visibilityOfElementLocated(kidsMenu));
        actions.moveToElement(kids).perform();
    }

    // Click Akbar & Birbal
    public void clickAkbarBirbal() {
        wait.until(ExpectedConditions.elementToBeClickable(akbarBirbalCategory)).click();
    }

    // Select Illustrated Stories of Akbar
    public void selectIllustratedAkbarBook() {
        WebElement book = wait.until(
                ExpectedConditions.visibilityOfElementLocated(illustratedAkbarBook));
        selectedBookName = book.getText();
    }
}

   

