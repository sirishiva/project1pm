package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class login_page extends BasePage{
	WebDriver driver;
	
public	login_page(WebDriver driver){
	super(driver);
		this.driver=driver;
	}
	// locators
	
	By userid= By.name("uid");
	By password= By.name("password");
	By submit= By.name("btnLogin");
	
	//Action methods
	
	public void Login_Details(String id,String pass) {
		Sendkeys(userid,id);
		Sendkeys(password, pass);
		Click(submit);
		boolean managerid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed();
		Assert.assertTrue(managerid);
		
	}

	
}
