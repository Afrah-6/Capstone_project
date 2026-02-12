package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import Pages.dropdownpage;

public class dropdown {

    WebDriver driver;
    dropdownpage page;

    @Given("User launches the Bookswagon website")
    public void user_launches_website() {
        driver = new ChromeDriver();
        page = new dropdownpage(driver);
        page.launchWebsite();
    }

    @When("User hovers on Kids menu")
    public void user_hovers_on_kids() {
        page.hoverOnKids();
    }

    @When("User clicks on Akbar and Birbal category")
    public void user_clicks_akbar_birbal() {
        page.clickAkbarBirbal();
    }

    @Then("User selects {string} book")
    public void user_selects_book(String bookName) {
        page.selectIllustratedAkbarBook();
        System.out.println("the book is selected from a dropdown");
    }

    
}

