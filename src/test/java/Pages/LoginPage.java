package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
public class LoginPage {
	WebDriver driver;
    
	By loginLink = By.xpath("//span[text()='My Account']");

    By emailField = By.id("ctl00_phBody_SignIn_txtEmail");

    By passwordField = By.id("ctl00_phBody_SignIn_txtPassword");

    By loginButton = By.id("ctl00_phBody_SignIn_btnLogin");



    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }
    public void openLoginPage() {

        driver.get("https://www.bookswagon.com/");

        driver.findElement(loginLink).click();

    }

  public void enterEmail(String email) {

        driver.findElement(emailField).sendKeys(email);

    }



    public void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);

    }
     public void clickLogin() {

        driver.findElement(loginButton).click();

    }

}



