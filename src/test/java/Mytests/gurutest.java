package Mytests;

import org.testng.annotations.Test;

public class gurutest extends BaseTest {
@Test
	void Login() {
 LP.Login_Details(prop.getProperty("userid"), prop.getProperty("password"));
 
}
//Test commit changes
@Test(priority=1)
void NewCustomer() {
	NC.NEW_Customer();
	NC.NC_form(prop.getProperty("CustomerName"), prop.getProperty("DOB"), prop.getProperty("Address"), prop.getProperty("City"), prop.getProperty("State"), prop.getProperty("PIN"), prop.getProperty("Phno"), prop.getProperty("Email"),prop.getProperty("Psw"));
}
@Test(priority=2)
void EditCustomer() {
	EC.EditCustomer();
	EC.EditCustomer_form(prop.getProperty("Cid"));
}
}
