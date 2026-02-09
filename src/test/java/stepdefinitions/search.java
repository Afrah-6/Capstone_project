package stepdefinitions;


import Pages.search_Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	@Given("browser is open")


	public void browser_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bookswagon.com/myaccount.aspx");
	   // Write code here that turns the phrase above into concrete actions
	   //throw new io.cucumber.java.PendingException();
	}

	@When("search for a book")
	public  void search_for_a_book() throws InterruptedException {
	       WebElement searchBox=driver.findElement(By.id("inputbar"));
	searchBox.sendKeys("Carton");
	searchBox.sendKeys(Keys.ENTER);

	}              
	@When("select the book")
	public void select_the_book() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[1]/div[3]/div[1]/a")).click();
	Thread.sleep(4000);


	    }

	@Then("add to cart and verify the cart")
	public void add_to_cart_and_verify_the_cart() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"btnAddtocart\"]")).click();


	driver.findElement(By.xpath("//*[@id=\"lblcartmsg_39510693\"]")).click();
	Thread.sleep(2000);
	 }
}
