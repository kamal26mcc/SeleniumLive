package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	
	public WebDriver driver =null;
	
	public void openBrowser() 
	{
		System.out.println(driver);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//driver.navigate().back();

		//driver.navigate().forward();
	
		//driver.navigate().refresh();
		
		// getTitle is abstract method of Webdriver interface with return type String
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		String actualSrc= driver.getPageSource();
		//System.out.println(actualSrc);
		
		
		driver.close();
		//driver.quit();
		
		System.out.println(driver);
	}
	
	
	
	
	public static void main(String[] args)  {
		
		BrowserCommands obj = new BrowserCommands();
		obj.openBrowser();
	}
}
