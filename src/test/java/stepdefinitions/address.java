package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddressPage;
import Pages.CartPage;

	public class address {

	    WebDriver driver=login.driver;
	    CartPage cartPage;
	    AddressPage addressPage;
	   //CartPage cartPage =  new CartPage(driver);
	   //AddressPage addressPage =  new AddressPage(driver);

	    @Given("the user is on the home page")
	    public void the_user_is_on_the_home_page() throws InterruptedException {
	        // Initialize driver (Ensure you have the driver executable set up)
	    	 cartPage =  new CartPage(driver);
	 	     addressPage =  new AddressPage(driver);

	        driver.manage().window().maximize();
	    }

	    @When("the user navigates to the cart")
	    public void the_user_navigates_to_the_cart() throws InterruptedException {
	        cartPage.openCart();
	    }
	    

	    @And("the user clicks the Buy button")
	    public void the_user_clicks_the_buy_button() throws InterruptedException {
	        cartPage.clickBuy();
	        
	    }

	   /* @Then("the user fills in the delivery address details")
	    public void the_user_fills_in_the_delivery_address_details() throws InterruptedException {
	        // This calls your existing logic in the AddressPage class
	        addressPage.fillAddressForm();
	    } */
	    
	    @Then("the user fills in the delivery address details:")
	    public void the_user_fills_in_the_delivery_address_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	    	  addressPage.fillAddressForm();
	    }

	    @And("the user saves the address")
	    public void the_user_saves_the_address() {
	        
	        System.out.println("Address form submitted.");
	    }

	    @Then("the order should be processed successfully")
	    public void the_order_should_be_processed_successfully() {
	      System.out.println("Order is in Process");
	    }
	   
}
