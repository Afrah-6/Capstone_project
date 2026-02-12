package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChangePassword_Page {

	By button = By.id("ctl00_lblUser");
    By cptext = By.linkText("Change Password");
	By oldpass = By.name("ctl00$phBody$ChangePassword$txtCurPwd");
	By npass = By.id("ctl00_phBody_ChangePassword_txtNewPassword");
	By conpass = By.id("ctl00_phBody_ChangePassword_txtConfirmPwd");
	By btn = By.id("ctl00_phBody_ChangePassword_imgSubmit");  
	WebDriver driver ;
	
	public void home() 
	{
		driver =stepdefinitions.login.driver;
		
	}
	public void oldpassword(String string) throws InterruptedException 
	{
		driver.findElement(oldpass).sendKeys(string);
		Thread.sleep(2000);
	}
	public void newpassword(String string) throws InterruptedException {
		driver.findElement(npass).sendKeys(string);
		Thread.sleep(2000);
	}
	public void confirmpass(String string) throws InterruptedException {
		driver.findElement(conpass).sendKeys(string);
		Thread.sleep(2000);
	}
	public void btnclick() throws InterruptedException
	{
		driver.findElement(btn).click();
		Thread.sleep(2000);	
	}
	public void hoverexe() 
	{
		WebElement move = driver.findElement(button);
		Actions  a = new Actions(driver);
		a.moveToElement(move).perform();
		
	}
	public void changepassclick() throws InterruptedException 
	{
		driver.findElement(cptext).click();
		Thread.sleep(20000);
		
		driver.quit();
	}

}
