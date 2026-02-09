package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dropdown {
	WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
	

@Given("User is on home page")
public void user_is_on_home_page() {
	 driver.get("https://www.bookswagon.com");
}

@When("User clicks on Books")
public void user_clicks_on_books() {
	   WebElement books = driver.findElement(By.xpath("//a[text()='Books']"));
       actions.moveToElement(books).perform();
  
}

@When("User clicks on {int}-{int} under Books by Budget")
public void user_clicks_on_under_books_by_budget(Integer int1, Integer int2) {
	 WebElement budget =
             driver.findElement(By.xpath("//a[contains(text(),'" + int1 + "-" + int2 + "')]"));
     budget.click();
 
   
}

@Then("user clicks on first book and adds to cart")
public void user_clicks_on_first_book_and_adds_to_cart() {
	   driver.findElement(By.xpath("(//div[@class='book-item'])[1]")).click();
       driver.findElement(By.id("add-to-cart")).click();
   
}

@When("User clicks on Fiction")
public void user_clicks_on_fiction() {
	 WebElement fiction = driver.findElement(By.xpath("//a[text()='Fiction']"));
     actions.moveToElement(fiction).click().perform();
}




@When("User clicks on Fiction-BestSellers under Best-Sellers")
public void user_clicks_on_fiction_best_sellers_under_best_sellers() {
	 
	        driver.findElement(By.xpath("//a[text()='Fiction BestSellers']")).click();
}

@When("User clicks on Non-Fiction")
public void user_clicks_on_non_fiction() {
	   driver.findElement(By.xpath("//a[text()='Non-Fiction']")).click();
}

@When("User clicks on Best Books Of The Year under Browse")
public void user_clicks_on_best_books_of_the_year_under_browse() {
	 driver.findElement(By.xpath("//a[text()='Best Books Of The Year']")).click();   
}

@When("User clicks on Teens& Ya")
public void user_clicks_on_teens_ya() {
    driver.findElement(By.xpath("//a[contains(text(),'Teens')]")).click();
}

@When("User clicks on RelationShip Stories Under Top Subjects")
public void user_clicks_on_relation_ship_stories_under_top_subjects() {
  
	 driver.findElement(By.xpath("//a[text()='Relationship Stories']")).click();
}

@When("User clicks on Kids")
public void user_clicks_on_kids() {
	driver.findElement(By.xpath("//a[text()='Kids']")).click();   
}

@When("User clicks on Akbar and Birbal  under Popular Series")
public void user_clicks_on_akbar_and_birbal_under_popular_series() {
	 driver.findElement(By.xpath("//a[text()='Akbar and Birbal']")).click();   
}

@When("User clicks on Exams")
public void user_clicks_on_exams() {
	driver.findElement(By.xpath("//a[text()='Exams']")).click();
}

@When("User clicks on Banking\\(IBPS, SBI) under Government Exams")
public void user_clicks_on_banking_ibps_sbi_under_government_exams() {
	driver.findElement(By.xpath("//a[contains(text(),'IBPS')]")).click();
   
}



}
