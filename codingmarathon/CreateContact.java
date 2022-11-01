package codingmarathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		Thread.sleep(9000);

		
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		
		driver.executeScript("arguments[0].click();", accounts);
		
		Thread.sleep(9000);


		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(6000);

		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("ArunG");
		
		
		WebElement ownership = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		driver.executeScript("arguments[0].click();", ownership);
		
		Thread.sleep(5000);
		
		WebElement pub = driver.findElement(By.xpath("(//span[text()='Public'])"));
		pub.click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		
		System.out.println(text);
		
		if(text.contains("was created.")) {
			
			System.out.println("Account created successfully");
		}

	}

}
