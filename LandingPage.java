package HkPages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	static WebDriver driver;
	boolean res;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	By flashsuccess =By.xpath("//[@class=\"flash success\"]");
	
	public boolean isLoginSuccess()
	{
		try {
			driver.findElement(flashsuccess);
			res=true;
		}
		catch(NoSuchElementException n) {
		res=false;
	}
	return res;
}

}

