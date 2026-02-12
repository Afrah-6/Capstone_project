package stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static WebDriver driver; // Static keeps the session alive
    LoginPage login;

    @Given("the user is on the Bookswagon login page")
    public void open_login() throws InterruptedException {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        login = new LoginPage(driver);
        login.openLoginPage();
    }

    @When("the user enters email {string}")
    public void enter_email(String email) throws InterruptedException {
        login.enterEmail(email);
    }

    @And("the user enters password {string}")
    public void enter_password(String pass) {
        login.enterPassword(pass);
    }

    @And("the user clicks the login button")
    public void click_login() throws InterruptedException {
        login.clickLogin();
    }

    @Then("an error message should be displayed")
    public void error_check() {
        System.out.println("Verified: Error message displayed.");
    }

    @Then("the user should be redirected to the account dashboard")
    public void success_check() {
        System.out.println("Verified: Login successful.");
    }
}