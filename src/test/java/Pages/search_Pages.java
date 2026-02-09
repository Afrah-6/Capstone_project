package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



@SuppressWarnings("unused")
public class search_Pages {
	private WebDriver driver;
	private final String url="https://www.bookswagon.com/myaccount.aspx";
	@FindBy(id="inputbar")
	private WebElement searchbook ;
	@FindBy(name="ctl00_phBody_ProductDetail_lblTitle")
	private WebElement bookname;
	@FindBy(id="btnAddtocart")
	private WebElement addTocart;
	public void entersearchbook()
	{
	driver.findElement((By) searchbook).click();
	}
	public void getbook ()
	{
	driver.findElement((By) bookname).click();
	}
	public void addtocart() {
	driver.findElement((By) addTocart).click();
	}
}
