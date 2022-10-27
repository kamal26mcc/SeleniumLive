package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.AssignmentGenerics;

public class FaceBookRegistration extends AssignmentGenerics {

	public void createAccountFB(WebDriver dirver) {

		WebElement createAccountFB = driver.findElement(By.linkText("Create New Account"));
		 clickElement(createAccountFB);
		//createAccountFB.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		firstName.sendKeys("Kamal");

		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastName.sendKeys("Kathirvel");

		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailAddress.sendKeys("kamal26tester@gmail.com");

		WebElement reEmailAddress = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEmailAddress.sendKeys("THEERAN@gmail.com");

		String emailVerify = emailAddress.getAttribute("value");
		System.out.println(emailVerify);

		String reEmailAddress1 = reEmailAddress.getAttribute("value");
		System.out.println(reEmailAddress1);
		
		//To verify email address is same

		if (emailVerify.equalsIgnoreCase(reEmailAddress1)) {

			System.out.println("Both email address is same");
		} else {

			System.out.println("Sorry Both email address not same check it again");
		}

		WebElement passWord = driver.findElement(By.id("password_step_input"));
		passWord.sendKeys("Test@123");

		WebElement dayEle = driver.findElement(By.id("day"));
		Select st = new Select(dayEle);
		st.selectByVisibleText("26");

		// select month
		WebElement monthEle = driver.findElement(By.id("month"));
		Select month = new Select(monthEle);
		month.selectByValue("3");

		// select year
		WebElement yearEle = driver.findElement(By.id("year"));
		Select year = new Select(yearEle);
		year.selectByValue("1991");

	}

	public static void main(String[] args) {

		FaceBookRegistration obj = new FaceBookRegistration();
		obj.driver = obj.openBrowser("https://www.facebook.com/", "chrome");

		obj.backNavigation(obj.driver);
		obj.forwardNavigation(obj.driver);
		obj.getCurrentURL(obj.driver);
		obj.webSiteTittle(obj.driver);
		obj.currentNavigationUrl(obj.driver);
		obj.browserId(obj.driver);
		obj.fullScreen(obj.driver);
		obj.createAccountFB(obj.driver);
		// obj.pageSourceCode(obj.driver);
		//obj.closeBrowser(obj.driver);

	}

}