package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	void Click(By locators) {
		driver.findElement(locators).click();
	}
	
	void Refresh() {
		driver.navigate().refresh();
	}
	
	void Sendkeys(By locators, String text) {
		driver.findElement(locators).sendKeys(text);
	}
	
}
