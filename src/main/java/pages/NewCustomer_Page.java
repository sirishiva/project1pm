package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer_Page extends BasePage {

	WebDriver driver;
	public NewCustomer_Page(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	//LOCATORS
	    By NewCustomer=By.xpath("//a[contains(text(),'New Customer')]");
	    
		By CustomerName= By.name("name");
		By Gender= By.xpath("//input[@value='f']");
		By DOB=By.name("dob");
		By Address= By.name("addr");
		By City= By.name("city");
		By State= By.name("state");
		By PIN= By.name("pinno");
		By Phno=By.name("telephoneno");
		By Email= By.name("emailid");
		By Psw= By.name("password");
		By Submit= By.name("sub");
	//Action method
			public	void NEW_Customer() {
				Click(NewCustomer);
		        Refresh();
		        Click(NewCustomer);
		    
		}
			
	        public void NC_form(String CN, String Dob, String addr, String city, String state, String pin, String mbl, String email, String pw )   {
			Sendkeys(CustomerName,CN);	
			Click(Gender);
			Sendkeys(DOB, Dob);
		    Sendkeys(Address, addr);
			Sendkeys(City, city);
			Sendkeys(State,state);
			Sendkeys(PIN,pin);
			Sendkeys(Phno,mbl);
			Sendkeys(Email,email);
			Sendkeys(Psw,pw);
			Click(Submit);
			
			try {
				driver.switchTo().alert().accept()	;
				}catch(Exception e) {
					System.out.println("No Alert	");
				}
			
			
			
		}
		
	
	
}
