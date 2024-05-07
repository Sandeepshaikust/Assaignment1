package TestCases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AdvantageShoppingOnline.AdvHomePage_PageObject;
import utilsPackage.OpenChromeBrowser;

public class AdvHomePage_TestCase{
	static WebDriver driver;
	boolean res;
	static AdvHomePage_PageObject advhp;

	@AfterClass
	public void CloseDriver()
	{
		//driver.quit();
	}
	
	
	@BeforeClass
	public void initDriver()
	{
		OpenChromeBrowser ob = new OpenChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://www.advantageonlineshopping.com/#/");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    advhp = new AdvHomePage_PageObject(driver);
		
	}
	
	@Test 
	public void clickSearchLens()
	{
		advhp.clickSearchLens();
	}
	
	
	@Test (dependsOnMethods = "clickSearchLens" )
	public void checkSearchBoxIsPresent()
	{
		Assert.assertEquals(true, advhp.checkSearchBox());
	}
	
	@Test (dependsOnMethods = "checkSearchBoxIsPresent" )
	public void enterSearchWord()
	{
		advhp.enterSearch("mouse");
	}
	
	
	@Test (dependsOnMethods = "enterSearchWord" )
	public void checkSearchResults()
	{
		Assert.assertEquals(true, advhp.chkresults());
	}
	
	//driver.findElement(By.id("autoComplete")).sendKeys(srch + Keys.ENTER);   
        
	
}	
