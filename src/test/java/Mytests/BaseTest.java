package Mytests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.EditCustomer_Page;
import pages.NewCustomer_Page;
import pages.login_page;


public class BaseTest {
	WebDriver driver;
	login_page LP;
	NewCustomer_Page NC;
	EditCustomer_Page EC;
	Properties prop;
	
@BeforeTest
	void setup() throws IOException {
	driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demo.guru99.com/v4/");
	LP=new login_page(driver);
	NC=new NewCustomer_Page(driver);
	EC=new EditCustomer_Page(driver);
	prop= new Properties();
	FileInputStream file= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\project1PM\\src\\test\\resources\\config.properties");
	prop.load(file);
	}
@AfterTest
  void Teardown() {
	  driver.quit();
  }
	
	
	
	

}
