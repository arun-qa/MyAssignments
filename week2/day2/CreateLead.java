package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
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
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src = new Select(elementSource);
		src.selectByVisibleText("Employee");
		
		WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Ind = new Select(elementIndustry);
		Ind.selectByValue("IND_FINANCE");
		
		WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Own = new Select(elementOwnership);
		Own.selectByIndex(5);
		
		
		
		
		

	}

}
