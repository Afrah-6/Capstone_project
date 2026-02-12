package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.ChangePassword_Page;

public class changepassword {

	
	ChangePassword_Page chance = new ChangePassword_Page();
	
	private By button = By.className("usernametext");
	private By cptext = By.linkText("Change Password");
	WebDriver driver ;
@Given("I am on the BooksWagon home page")
public void i_am_on_the_books_wagon_home_page() {
	chance.home();
}

@When("I hover over the username menu")
public void i_hover_over_the_username_menu()  {
	chance.hoverexe();
}

@When("I click on the link")
public void i_click_on_the_link() throws InterruptedException {
	chance.changepassclick();
}

@When("I enter {string} as the current password")
public void i_enter_as_the_current_password(String string) throws InterruptedException {
	chance.oldpassword("bookswagon@0604");
}

@When("I enter {string} as the new password")
public void i_enter_as_the_new_password(String string) throws InterruptedException {
    chance.newpassword("aaaaa");
}

@When("I enter {string} as the confirm password")
public void i_enter_as_the_confirm_password(String string) throws InterruptedException
{
   chance.confirmpass("bbbbb");
}

@When("I click the submit button")
public void i_click_the_submit_button() throws InterruptedException {
    chance.btnclick();
}

}
