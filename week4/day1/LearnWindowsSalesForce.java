package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowsSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup the path
				WebDriverManager.chromedriver().setup();
				
				//disable notifications
				ChromeOptions ch=new ChromeOptions();
				ch.addArguments("--disable-notifications");
				ChromeDriver driver=new ChromeDriver(ch);
				
				//manage your window		
				driver.manage().window().maximize();
				
				//add wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Load url : https://login.salesforce.com
				driver.get("https://login.salesforce.com");
				
				//enter username
				driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");

				//enter password
				driver.findElement(By.id("password")).sendKeys("Password#123");

				//click login button
				driver.findElement(By.id("Login")).click();
				
				//click on the learn more option in the Mobile publisher
				driver.findElement(By.xpath("//span[text()='Learn More']")).click();
				
				//Switch to the next window using Windowhandles.
				
				Set<String> windowHandles = driver.getWindowHandles();
				
				List<String> listHandles = new ArrayList<String>(windowHandles);
				
				driver.switchTo().window(listHandles.get(1));
				
				//click on the confirm button in the redirecting page
				
				driver.findElement(By.xpath("//button[text()='Confirm']")).click();
				
				//Get the title
				System.out.println(driver.getTitle());
				
				//Get back to the parent window
				
				driver.switchTo().window(listHandles.get(0));
				
				System.out.println(driver.getTitle());

				//close the browser
				
				driver.quit();

				

	}

}
