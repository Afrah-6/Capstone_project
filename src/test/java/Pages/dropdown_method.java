package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class dropdown_method {

	    WebDriver driver;
	    Actions actions;

	    public void BooksPage (WebDriver driver) {
	        this.driver = driver;
	        this.actions = new Actions(driver);
	    }

	    // Locators
	    By booksMenu = By.xpath("//a[text()='Books']");
	    By firstBook = By.xpath("(//div[@class='book-item'])[1]");
	    By addToCartBtn = By.id("add-to-cart");

	    // Generic methods
	    public void hoverOnBooks() {
	        WebElement books = driver.findElement(booksMenu);
	        actions.moveToElement(books).perform();
	    }

	    public void clickBooksByBudget(int min, int max) {
	        driver.findElement(
	            By.xpath("//a[contains(text(),'" + min + "-" + max + "')]")
	        ).click();
	    }

	    public void clickFirstBookAndAddToCart() {
	        driver.findElement(firstBook).click();
	        driver.findElement(addToCartBtn).click();
	    }

	    public void clickMenuByText(String text) {
	        driver.findElement(By.xpath("//a[text()='" + text + "']")).click();
	    }
	    
	    public void clickFirstBookAndAddToCart1() {
	        driver.findElement(firstBook).click();
	        driver.findElement(addToCartBtn).click();
	    }

	    public void clickMenuContainsText(String text) {
	        driver.findElement(By.xpath("//a[contains(text(),'" + text + "')]")).click();
	    }
	    
	    public void clickFirstBookAndAddToCart2() {
	        driver.findElement(firstBook).click();
	        driver.findElement(addToCartBtn).click();
	    }
	    
}

