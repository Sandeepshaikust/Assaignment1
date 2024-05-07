package AdvantageShoppingOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AdvHomePage_PageObject {
	
	static WebDriver driver;
	boolean res;
	
	//Constructor
	public AdvHomePage_PageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Element References
	By menuSearchIcon = By.id("menuSearch");
	By searchBox_AutoComplete = By.id("autoComplete");
	By results = By.xpath("//*[contains(@class, \"ItemsCount\")]//parent::p");
	
	//Methods
	
	//Method to click Search lens icon
	
	public void clickSearchLens()
	{
		driver.findElement(menuSearchIcon).click();
	}
		
	//Method to check AutoComplete Search Box is present
	
	public boolean checkSearchBox()
	
	{
		try
		{
		driver.findElement(searchBox_AutoComplete);
		res = true;
		}
		catch(NoSuchElementException e)
		{
		res = false;
		}
		return res;
	}
	
   //Method to enter search keyword
	
	public void enterSearch(String s)
	{
		driver.findElement(searchBox_AutoComplete).sendKeys(s + Keys.ENTER);
	}

  //Method to check the search results
	
	public boolean chkresults()
	{
		try {
	    	
	    	String howmanyequalto = driver.findElement(results).getText();	
	    	System.out.println(howmanyequalto);
		    res = true;
	    }		
	
	    catch(NoSuchElementException e)
	    {
	     res = false;
	    }
        return res;
	}
}


