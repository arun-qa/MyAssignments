package servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class DeleteCaller extends ProjectSpecificMethods {

	@Test(priority=1)
	public void runDeleteCaller() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("PM$btmhB!5F4");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		
		shadow.findElementByXPath("//div[text()='All']").click();
		
		WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
		filter.sendKeys("Callers");
		
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		
		WebElement frame1 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Arun"+Keys.ENTER);
		
		driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody[1]/tr[1]/td[3]/a[1]")).click();
		
		driver.findElement(By.id("sysverb_delete_bottom")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ok_button")).click();

	}

}
