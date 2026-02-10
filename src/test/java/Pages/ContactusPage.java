package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactusPage {
	
	    WebDriver driver = new ChromeDriver();;

	    // Locators for the Contact Us form fields
	   private By nameField = By.id("ctl00_phBody_ContactUs_txtFirstName");
	   private By emailField = By.id("ctl00_phBody_ContactUs_txtEmail");
	   private By address = By.id("ctl00_phBody_ContactUs_txtAddress");
	   private By phone = By.id("ctl00_phBody_ContactUs_txtPhone");
	   private By subject = By.id("ctl00_phBody_ContactUs_txtSubject");
	   private  By description = By.id("ctl00_phBody_ContactUs_txtDescription");
	   private By  contact= By.linkText("Contact Us");
	   
	   
	   public void homeP()
	   {
	 
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.bookswagon.com/");
	   }
	   
	   public void clickcontactus()
	   {
	  driver.findElement(contact).click();
	   }
	   public void entername_feild(String string)
	   {
	  driver.findElement(nameField).sendKeys(string);
	   }
	   public void enteremail_field(String string)
	   {
	  driver.findElement(emailField).sendKeys(string);
	   }
	   public void enteraddress_field(String string)
	   {
	  driver.findElement(address).sendKeys(string);
	   }
	   public void enterphone_field(String string)
	   {
	  driver.findElement(phone).sendKeys(string);
	   }
	   public void entersubject_field(String string)
	   {
	  driver.findElement(subject).sendKeys(string);
	   }
	   public void enterdescription_field(String string)
	   {
	  driver.findElement(description).sendKeys(string);
	   }
	   public void selectdrpdown()
	   {
	  WebElement drp = driver.findElement(By.id("ctl00_phBody_ContactUs_ddlSubjectType"));
	  Select sel= new Select(drp);
	  sel.selectByVisibleText("Courier Related");
	 
	   }
}
