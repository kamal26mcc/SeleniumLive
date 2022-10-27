package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.SeleniumGenerics;

public class WebElementConcept extends SeleniumGenerics{


	public void loginToFB() 
	{
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys("bala@test.com");
		emailEle.clear();
		emailEle.sendKeys("Bala@testIntellect.com");

		String placeholderText = emailEle.getAttribute("placeholder");
		System.out.println(placeholderText);

		String valueText = emailEle.getAttribute("value");
		System.out.println(valueText);

		WebElement pwdEle = driver.findElement(By.name("pass"));
		pwdEle.sendKeys("dhvjhvuhvuhw");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
	}

	public static void main(String[] args)
	{

		WebElementConcept obj = new WebElementConcept();
		obj.openBrowser();
		obj.loginToFB();
		obj.closeBrowser(obj.driver);
		

	}
}
