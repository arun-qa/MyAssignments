package codingmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOppurtunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//setup the path
		WebDriverManager.chromedriver().setup();
		
		//disable notifications
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		//manage ur window		
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
		
		//Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();

		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);

		
		//Click on Opportunity tab 
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opp);
		Thread.sleep(3000);
		
		//Click on New button
		WebElement newopp = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click();", newopp);
		
		//Enter 'your name' as account name
	    
	    Thread.sleep(3000);
	    
	  //enter name 
	  	driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Arun G");
	  	
	  	WebElement accnamec = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
		accnamec.sendKeys("ArunG");
		
		
		WebElement accname = driver.findElement(By.xpath("(//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']//strong[text()='ArunG'])[1]"));
		accname.click();
	  		
	  //select stage
	  		WebElement stage = driver.findElement(By.xpath("//button[@role='combobox']"));
	  		driver.executeScript("arguments[0].click();",stage );
	  		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	  		
	  		//enter closing date
	  		WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	  		date.sendKeys("10/22/2022");
	  		
	    //clickSave
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
	    WebElement verifyname = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
	    String name = verifyname.getText();
	    
	    if(name.contains("Arun "))
	    {
	    	System.out.println("opputunity created successfully");
	    }
	    else
	    {
	    	System.out.println("Oppurtunity not created");
	    }
	    
	    
	    }

}
