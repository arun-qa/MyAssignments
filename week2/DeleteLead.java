package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		
		WebElement elementClickFirstResult = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		elementClickFirstResult.click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		WebElement elementFindLeads1 = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads1.click();
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(text);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
		
		System.out.println(displayed);
		
		driver.quit();
		//System.out.println(VerifyMessagedisplayed);
		
		
		
		
		
		

	}

}
