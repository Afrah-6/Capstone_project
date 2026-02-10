package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddressPage {

	    WebDriver driver;
	   
	 
	    public AddressPage(WebDriver driver) {
	        this.driver = driver;
	       
	        org.openqa.selenium.support.PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(id = "ctl00_CPBody_txtNewRecipientName")
	    WebElement name;
	    
	    @FindBy(id="ctl00_cpBody_txtNewCompanyName")
	    WebElement companyname;

	    @FindBy(id = "ctl00_CPBody_txtNewAddress")
	    WebElement address;
	    
	    @FindBy(id="ctl00$cpBody$txtNewLandmark")
	    WebElement landmark;

	    @FindBy(id = "ctl00_CPBody_ddlNewCountry")
	    WebElement countryDropdown;
	    
	    @FindBy(id="ctl00_cpBody_ddlNewState")
	    WebElement statedropdown;
	    
	    @FindBy(id="ctl00_cpBody_ddlNewCities")
	    WebElement citydropdown;
	    
	    @FindBy(id="ctl00_cpBody_txtNewPincode")
	    WebElement pincode;

	    @FindBy(id = "ctl00_CPBody_txtNewMobile")
	    WebElement mobile;

	    @FindBy(id = "ctl00_CPBody_chkDefault")  
	    WebElement defaultcheckbox;
	    
	    @FindBy(id="ctl00_cpBody_chkUseAddress")
	    WebElement addresscheckbox;

	    @FindBy(id = "ctl00_CPBody_btnSave")
	    WebElement saveButton;
	       

	    public void fillAddressForm() {
	        name.sendKeys("sachin");
	        companyname.sendKeys("tata consultancy services");
	        address.sendKeys("123 Main Street, Bangalore");
	        
	        landmark.sendKeys("near temple");
	        

	        Select country = new Select(countryDropdown);
	        country.selectByVisibleText("India");
	        
	        Select state=new Select(statedropdown);
	        state.deselectByValue("Andhra Pradesh");
	        
	        Select city=new Select(citydropdown);
	        city.selectByValue("Tenali");
	        
	        pincode.sendKeys("522201");

	        mobile.sendKeys("9876543210");

	        if (!defaultcheckbox.isSelected()) {
	            defaultcheckbox.click();
	            
	        }
	        if(!addresscheckbox.isSelected()) {
	        	addresscheckbox.click();
	        }

	        saveButton.click();
	    }
	}

