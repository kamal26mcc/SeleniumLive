package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGenerics {

	public WebDriver driver =null;
	
	public WebDriver openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		return driver;
	}
	
	
	public void closeBrowser(WebDriver driver) 
	{
		driver.close();
	}
	
	
	public void refreshBrowser(WebDriver driver) 
	{
		driver.navigate().refresh();
	}
	
	public String getCurrentURL(WebDriver driver) 
	{
		String value = driver.getCurrentUrl();
		return value;
	}
	
	public void clickElement(WebElement ele) 
	{
		ele.click();
	}
	
	
	
}
