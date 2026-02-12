package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_Pages {
    WebDriver driver;

    @FindBy(id="inputbar")
    private WebElement searchBar;

    @FindBy(id="btnTopSearch") // Bookswagon search button id
    private WebElement searchButton;

    @FindBy(className = "cover") // Example selector for first book
    private WebElement bookResult;

    @FindBy(id="btnAddtocart")
    private WebElement addTocart;

    public search_Pages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForBook(String book) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        // Wait for the search bar to be visible before typing
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(searchBar));
        searchBar.clear();
        searchBar.sendKeys(book);
        // Wait for the search button to be clickable
      //  wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(searchButton)).click();
        searchButton.click();
    }

    public void selectBook() {
        bookResult.click();
    }

    public void addToCart() {
        addTocart.click();
    }

	

	
}