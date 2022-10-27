package com_1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.AssignmentGenerics;

public class MouseActions extends AssignmentGenerics  {
	
	public WebDriver driver = null ;
	
	public void moveToElementAndClick() 
	{
		WebElement solutionsEle = driver.findElement(By.xpath("(//span[@class='nav-link'])[1]"));		
		Actions act = new Actions(driver);
		act.moveToElement(solutionsEle).perform();
		
		WebElement iphoneEle = driver.findElement(By.linkText("iPhone"));
		act.moveToElement(iphoneEle).click().build().perform();	
	}
	
	public void rightClick() throws Exception 
	{
		WebElement AprogramEle = driver.findElement(By.xpath("//a[@class='nav-link']"));
		Actions act = new Actions(driver);
		act.moveToElement(AprogramEle).contextClick().build().perform();
		
		Thread.sleep(2000);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	public void doubleClick() 
	{
		WebElement ele = driver.findElement(By.id("487582"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).doubleClick().build().perform();
	}
	
	public void dragAndDrop() 
	{
		WebElement src = driver.findElement(By.id("487582"));
		WebElement target = driver.findElement(By.id("487582"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}	
	
	

	public static void main(String[] args) throws Exception {
		
		MouseActions obj = new MouseActions ();
		obj.driver = obj.openBrowser("https://www.filemail.com/", "chrome");
		obj.moveToElementAndClick();
		obj.rightClick();
		
		

	}

}
