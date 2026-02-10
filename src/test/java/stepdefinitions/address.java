package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.AddressPage;
import Pages.CartPage;

	public class address {

	    WebDriver driver;
	    CartPage cartPage;
	    AddressPage addressPage;

	    @Given("the user is on the home page")
	    public void the_user_is_on_the_home_page() throws InterruptedException {
	        // Initialize driver (Ensure you have the driver executable set up)
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.bookswagon.com/");
	        Thread.sleep(10000);        
	        // Initialize Page Objects
	        cartPage = new CartPage(driver);
	        addressPage = new AddressPage(driver);
	    }

	    @When("the user navigates to the cart")
	    public void the_user_navigates_to_the_cart() {
	        cartPage.openCart();
	    }

	    @And("the user clicks the Buy button")
	    public void the_user_clicks_the_buy_button() throws InterruptedException {
	        cartPage.clickBuy();
	        Thread.sleep(5000);
	    }

	    @Then("the user fills in the delivery address details")
	    public void the_user_fills_in_the_delivery_address_details() {
	        // This calls your existing logic in the AddressPage class
	        addressPage.fillAddressForm();
	    }

	    @And("the user saves the address")
	    public void the_user_saves_the_address() {
	        // Note: Your fillAddressForm() already clicks saveButton.click()
	        // If you want to keep it separate, move saveButton.click() here.
	        System.out.println("Address form submitted.");
	    }

	    @Then("the order should be processed successfully")
	    public void the_order_should_be_processed_successfully() {
	        // Add validation logic here (e.g., checking for a success message)
	        driver.quit();
	    }

}
