package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	
	By UN = By.id("email");
	By PWD = By.id("pass");
	By Button = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]");
	
	static WebDriver driver ;
	//public static String browser="firefox";
	
	
	
	public static WebDriver openBrowser(int browserInput) {
		 
		switch (browserInput) {
		case 1:			
			driver = WebDriverManager.chromedriver().create();
			break;
		case 2:			
			driver = WebDriverManager.firefoxdriver().create();
			break;
		default:
			driver = WebDriverManager.edgedriver().create();
			break;
		}
//		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		return driver;
		}
	
	

	public void enterUserName() {
		driver.findElement(UN).sendKeys("Name");
	}
	
	public void enterPassword() {
		driver.findElement(PWD).sendKeys("Pass");
	}
	
	public void clickLoginButton() {
		driver.findElement(Button).click();
	}
}
