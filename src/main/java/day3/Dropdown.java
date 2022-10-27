package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.SeleniumGenerics;

public class Dropdown extends SeleniumGenerics {

	public WebDriver driver=null;

	public void selectDateOfBirth() 
	{
		WebElement linkEle = driver.findElement(By.linkText("Create New Account"));
		clickElement(linkEle);

		WebElement dayEle = driver.findElement(By.id("day"));
		Select st = new Select(dayEle);
		//st.selectByIndex(1);
		//st.selectByValue("12");
		st.selectByVisibleText("25");

		String value=st.getFirstSelectedOption().getText();
		System.out.println(value);
		
	}

	public static void main(String[] args) {

		Dropdown obj = new Dropdown();
		obj.driver= obj.openBrowser();
		obj.selectDateOfBirth();

	}
}
