package WebDriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CaptureScreenShot;
import utils.openChromeBrowser;

public class TestLoginFile {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		openChromeBrowser ob = new openChromeBrowser();
		driver=ob.openChrome();
		driver.get("https://the-internet.herokuapp.com/login");
		String U= "tomsmith";
		String P="SuperSecretPassworf";
		driver.findElement(By.id("username")).sendKeys(U);
		driver.findElement(By.id("password")).sendKeys(P);	
		driver.findElement(By.cssSelector("#login > button")).click();
		try {
			driver.findElement(By.partialLinkText("logout"));
			
		}
		
		catch(NoSuchElementException e) {
			
			System.out.println("Login Failed");
			
			fileNameMaker fn= new fileNameMaker();
			String filename=fn.fileNameForLogin(U, P);
			System.out.println(filename);
			CaptureScreenShot cs=new CaptureScreenShot();
			cs.takeSnapShot(driver, filename);
		}
	}
}

		