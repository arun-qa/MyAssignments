package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("demosalesmanager");
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementdecorativeSubmit = driver.findElement(By.xpath("//input[@value='Login']"));
		elementdecorativeSubmit.click();
		WebElement elementCRMSFA = driver.findElement(By.xpath("//div[@for='crmsfa']"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads.click();
		WebElement elementFirstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		elementFirstName.sendKeys("Arun");
		WebElement elementFindLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeads1.click();
		Thread.sleep(5000);
		WebElement elementClickFirstResult = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		elementClickFirstResult.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement elementEditCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		elementEditCompanyName.clear();
		elementEditCompanyName.sendKeys("TCS");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		driver.close();
		

	}

}
