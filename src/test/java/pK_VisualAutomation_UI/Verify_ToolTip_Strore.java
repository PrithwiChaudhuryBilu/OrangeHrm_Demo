package pK_VisualAutomation_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_ToolTip_Strore {
	@Test
	public void Tooltip() throws InterruptedException {

		String Filepath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Filepath + "\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.cssSelector("a[title='T-shirts']"));
		// Get tooltip text
		String toolTipText = element.getAttribute("title");
		System.out.println("Tool tip text present :- " + toolTipText);

		// Compare toll tip text
		Assert.assertEquals("T-shirts", toolTipText);
		driver.quit();
	}
}
