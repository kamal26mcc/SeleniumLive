package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.AssignmentGenerics;

public class MyAssignmentBrowserReuseMethod extends AssignmentGenerics {

	public void loginToLinkedIn(WebDriver driver) {
		WebElement emailEle = driver.findElement(By.name("session_key"));
		emailEle.sendKeys("kamal@tcs.com");
		emailEle.clear();
		emailEle.sendKeys("kamalKathirvel@scb.com");

		// String placeholderText = emailEle.getAttribute("required");
		// System.out.println(placeholderText);

		String valueText = emailEle.getAttribute("value");
		System.out.println(valueText);

		WebElement pwdEle = driver.findElement(By.name("session_password"));
		pwdEle.sendKeys("Smile@123");

		// WebElement loginButton = driver.findElement(By.id("join-form-submit"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

	}

	public static void main(String[] args) {

		MyAssignmentBrowserReuseMethod obj = new MyAssignmentBrowserReuseMethod();
		obj.driver = obj.openBrowser("https://www.linkedin.com/home", "chrome");
		
		obj.getCurrentURL(obj.driver);
		obj.fullScreen(obj.driver);
		obj.backNavigation(obj.driver);
		obj.forwardNavigation(obj.driver);
		obj.webSiteTittle(obj.driver);
		obj.currentNavigationUrl(obj.driver);
		obj.browserId(obj.driver);
		obj.loginToLinkedIn(obj.driver);
		obj.pageSourceCode(obj.driver);
		obj.closeBrowser(obj.driver);
		

	}
}
