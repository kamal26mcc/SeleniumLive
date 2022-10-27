package com_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.AssignmentGenerics;

public class FramesScenario  extends AssignmentGenerics {
	
	
	public WebDriver driver = null;
	
	public void  Subscription() throws Exception {
		
		//frames handling
		
		Thread.sleep(10000);
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("name or id");
		
		WebElement emailElement = driver.findElement(By.xpath("//iframe=[@class='zipframe ']"));
		driver.switchTo().frame(emailElement);
		
		
		
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) throws Exception {
		
		FramesScenario obj = new  FramesScenario ();
		obj.driver = obj.openBrowser("https://www.testintellect.com/", "chrome");
		obj.Subscription();
		
		
		
	}

}
