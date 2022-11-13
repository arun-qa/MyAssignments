package servicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewCaller extends ProjectSpecificMethods {
	
	@BeforeTest
	public void SetData() {
		excelfilename = "tc003";
	}
	
	@Test(dataProvider="testData")

	public void runCreateNewCaller(String uname, String pwd, String fname, String lname, String title, String email, String bphone, String mphone) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.id("user_name")).sendKeys(uname);
		driver.findElement(By.id("user_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		
		shadow.findElementByXPath("//div[text()='All']").click();
		
		WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
		filter.sendKeys("Callers");
		
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		
		//Thread.sleep(3000);
		
		WebElement frame1 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		driver.findElement(By.id("sys_user.first_name")).sendKeys(fname);
		
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lname);
		
		/*driver.findElement(By.xpath("//span[@class='icon icon-lightbulb']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listHandles.get(1));
		
		driver.findElement(By.linkText("Vice President")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(listHandles.get(0));
		
		Thread.sleep(3000);*/
		
		driver.findElement(By.id("sys_user.title")).sendKeys(title);
		
		WebElement email1 = driver.findElement(By.id("sys_user.email"));
		email1.sendKeys(email);
		
		
		driver.findElement(By.id("sys_user.phone")).sendKeys(bphone);
		
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys(mphone);
		
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Arun"+Keys.ENTER);
		
		driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody[1]/tr[1]/td[3]/a[1]")).click();

		String email2 = driver.findElement(By.id("sys_user.email")).getText();
				

	}

}
