package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DataProvider.XLUtils;

public class FDCalculator extends BasePage {

	public FDCalculator(WebDriver driver) {
		super(driver);
        this.driver=driver;
	}

	public static void main(String[] args) throws IOException {

		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement Inideposit=driver.findElement(By.id(""));
	    WebElement Length=driver.findElement(By.id(""));
	    WebElement IniRate=driver.findElement(By.id(""));
	    WebElement callButton=driver.findElement(By.xpath(""));
	    
	    String path="C:\\Users\\Admin\\eclipse-workspace\\project1PM\\TestData\\FDCal.xlsx";
	    
	    int rows=XLUtils.getRowCount(path, "sheet1");
	    System.out.println("Row count:"+rows);
	    
	    for(int i=1; i<=5; i++) {
	    	//reding excel
	    	
	    	String INDEP=XLUtils.getcelldata(path, "sheet1", i, 0);
	    	String INRATE=XLUtils.getcelldata(path, "sheet1", i, 1);
	    	String MONTH=XLUtils.getcelldata(path, "sheet1", i, 2);
	    	String EXPTOTAL=XLUtils.getcelldata(path, "sheet1", i, 4);
	    	
	    	Inideposit.clear();
	    	Length.clear();
	    	IniRate.clear();
	    	
	    	Inideposit.sendKeys(INDEP);
	    	Length.sendKeys(MONTH);
	    	IniRate.sendKeys(INRATE);
	    	callButton.click();
	    	
	    	String ActualAmount=driver.findElement(By.xpath("")).getText();
	    	System.out.println(ActualAmount);
	    	
	    	if(EXPTOTAL.equals(ActualAmount)) {
	    		XLUtils.Setcelldata(path, "sheet1", i, 5, "Passed");
	    		XLUtils.fillGreenColor(path,"sheet1", i, 5);
	    		
	    	}
	    	else {
	    		XLUtils.Setcelldata(path, "sheet1",i, 5, "Failed");
	    		XLUtils.fillRedColour(path, "sheet1", i, 5);
	    		
	    	}
	    	
	    }
		
	}

}
