package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import static org.junit.Assert.assertTrue;

public class login {
    WebDriver driver;
    LoginPage loginPage;

    @Before

    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);

    }
    @Given("user is on Bookswagon login page")

    public void user_is_on_login_page() {
         loginPage.openLoginPage();

    }

     @When("user enters invalid username or password")

    public void user_enters_invalid_credentials() {

        loginPage.enterEmail("noorafrah2005@gmail.com");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLogin();

    }



    @When("user clicks login without entering credentials")

    public void user_clicks_login_without_credentials() {

        loginPage.clickLogin();

    }



    @When("user enters valid username and password")

    public void user_enters_valid_credentials() {

        loginPage.enterEmail("noorafrah2005@gmail.com");

        loginPage.enterPassword("bookswagon@0604");

        loginPage.clickLogin();

    }



    @Then("user should see login error message")

    public void user_should_see_error_message() {

        assertTrue(driver.getPageSource().contains("Invalid"));

    }



    @Then("user should see validation message")

    public void user_should_see_validation_message() {

        assertTrue(driver.getPageSource().contains("required"));

    }



    @Then("user should be logged in successfully")

    public void user_logged_in_successfully() {

        assertTrue(driver.getTitle().contains("Bookswagon"));

    }



    @After

    public void tearDown() {

        driver.quit();

    }
}
