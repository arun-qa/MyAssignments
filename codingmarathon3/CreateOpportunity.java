package codingmarathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpportunity {

	@Test
	public void runCreateOpportunity(String opportunityName, String amountValue ) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		Thread.sleep(2000);

		WebElement oppName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		oppName.sendKeys(opportunityName);
		
		
		WebElement type = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]"));
		type.click();
		Thread.sleep(1000);
		WebElement newCustomer = driver.findElement(By.xpath("//span[@class='slds-truncate'][text()='New Customer']"));
		newCustomer.click();
		
		WebElement leadSource = driver.findElement(By.xpath("(//span[@class='slds-truncate'][text()='--None--'])[3]"));
		leadSource.click();
		Thread.sleep(1000);
		WebElement partner = driver.findElement(By.xpath("//span[@title='Partner Referral']"));
		partner.click();
		Thread.sleep(2000);
		
		
		WebElement amount = driver.findElement(By.xpath("//input[@name='Amount']"));
		amount.sendKeys(amountValue);
		Thread.sleep(2000);
		
		WebElement closeDate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		closeDate.click();
		Thread.sleep(1000);
		
		WebElement nextMonth = driver.findElement(By.xpath("//button[@title='Next Month']"));
		nextMonth.click();
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//span[@class='slds-day'][text()='20']"));
		date.click();
		
		WebElement stage = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));
		stage.click();
		Thread.sleep(1000);
		
		WebElement needAnalysis = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
		needAnalysis.click();
		
		
		WebElement primaryCS = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));
		primaryCS.click();
		Thread.sleep(2000);
		WebElement firstOption = driver.findElement(By.xpath("(//li[@class='slds-listbox__item'])[2]"));
		firstOption.click();
		
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();
		
		
		WebElement message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String text = message.getText();
		System.out.println(text);
		
		if(text.contains("was created"))
		{
			System.out.println("Oppotunity was Created");
		}
		
		

	}

}
