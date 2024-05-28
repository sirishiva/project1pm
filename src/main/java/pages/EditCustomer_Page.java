package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCustomer_Page extends BasePage {
WebDriver driver;

  public  EditCustomer_Page(WebDriver driver){
    	super(driver);
	this.driver=driver;
}
    //locators
    By EditCustomer=By.xpath("//a[contains(text(),'Edit Customer')]");
    By CustomerID=By.name("cusid");
    By submit=By.name("AccSubmit");


    //Action methods
    public void EditCustomer() {
    	
      Click(EditCustomer);
      Refresh();
      Click(EditCustomer);
      }
    
    public void EditCustomer_form(String Cid) {
    	
    	Sendkeys(CustomerID,Cid);
    	Click(submit);
    	
    	
    	
    	
    }




		
	}

