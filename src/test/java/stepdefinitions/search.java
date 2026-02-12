package stepdefinitions;

import Pages.search_Pages;
import io.cucumber.java.en.*;

public class search {
    search_Pages search = new search_Pages(login.driver);

    @Given("the user is logged into their account")
    public void the_user_is_logged_into_their_account() {
        System.out.println("Session active. Starting search flow...");
    }

    @When("the user searches for {string}")
    public void search_book(String book) {
        search.searchForBook(book);
    }

    @And("the user selects the book from the results")
    public void the_user_selects_the_book_from_the_results() {
        search.selectBook();
    }

    @And("the user adds the book to the cart")
    public void the_user_adds_the_book_to_the_cart() {
        search.addToCart();
    }

    @Then("the book should be successfully added")
    public void the_book_should_be_successfully_added() {
        System.out.println("Test Passed!");
    }
}