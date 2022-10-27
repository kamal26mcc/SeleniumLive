package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AssignmentGenerics {

	public WebDriver driver = null;

	public WebDriver openBrowser(String appUrl, String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "./drivers/ie.exe");
			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver", "./drivers/firefox.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "./drivers/edge.exe");
			driver = new EdgeDriver();

		} else {

			System.out.println("browser dirver not cofigured");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;

	}

	public void fullScreen(WebDriver dirver) {
		driver.manage().window().fullscreen();
	}

	public String webSiteTittle(WebDriver dirver) {

		String actualTitle = driver.getTitle();
		System.out.println("this value tittle" + actualTitle);
		return actualTitle;
	}

	public String currentNavigationUrl(WebDriver dirver) {

		String actualURL = driver.getCurrentUrl();
		System.out.println("this website current navigation url stored value :" + actualURL);
		return actualURL;
	}

	public void forwardNavigation(WebDriver dirver) {

		driver.navigate().forward();
	}

	public void backNavigation(WebDriver dirver) {

		driver.navigate().back();
	}

	public String pageSourceCode(WebDriver dirver) {

		String actualSrc = driver.getPageSource();
		System.out.println("this is page sourcecode : " + actualSrc);
		return actualSrc;
	}

	public String browserId(WebDriver dirver) {

		System.out.println("browser reference id : " + driver);
		return null;
	}

	public void refreshBrowser(WebDriver driver) {
		driver.navigate().refresh();
	}

	public String getCurrentURL(WebDriver driver) {
		String urlvalue = driver.getCurrentUrl();
		System.out.println("This is current URL : " + urlvalue);
		return urlvalue;
	}

	public void clickElement(WebElement ele) {
		ele.click();
	}

	public void closeBrowser(WebDriver dirver) {
		// driver.close();
		driver.quit();
	}

}