package com.OrangeHrm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	@Test
	public void LoginWithValidCredentials() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.findElement(By.xpath(xpathExpression));
		driver.findElementByName("txtUsername").sendKeys("Admin");
		driver.findElementByName("txtPassword").sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElementByLinkText("Dashboard").isDisplayed();
		driver.close(); //Closes the current instance of the browser opened by WebDriver where the focus is
		driver.quit(); //Quit will close all the instances of browsers opened by WebDriver
	}

}
