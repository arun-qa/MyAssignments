package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//2. Enter UserName and Password Using Id Locator
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		WebElement elementdecorativeSubmit = driver.findElement(By.className("decorativeSubmit"));
		elementdecorativeSubmit.click();
		
		//4. Click on CRM/SFA Link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		//5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//8. Click on First Resulting Contact
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listHandle = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listHandle.get(1));
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")).click();
		
		//9. Click on Widget of To Contact
				
		driver.switchTo().window(listHandle.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> listHandle1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(listHandle1.get(1));
		
		// 10. Click on Second Resulting Contact
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
				
		driver.switchTo().window(listHandle1.get(0));
		
		// 11. Click on Merge button using Xpath Locator
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//12. Accept the Alert
		
		driver.switchTo().alert().accept();
		
		// 13. Verify the title of the page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
	
	
		

	}

}
