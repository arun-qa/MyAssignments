package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		driver.manage().window().maximize();
		
		WebElement elementTool = driver.findElement(By.className("ui-selectonemenu"));
		Select Tool = new Select(elementTool);
		Tool.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//div[@id='j_idt87:country']//label[1]")).click();
		driver.findElement(By.xpath("//li[(text()='Brazil')]")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[(text()='Select City')]")).click();
		driver.findElement(By.xpath("//li[text()='Salvador']")).click();
		
		WebElement elementCourse = driver.findElement(By.xpath("//button[@aria-label='Show Options']"));
		elementCourse.click();
		WebElement Course1 = driver.findElement(By.xpath("//li[@data-item-label='AWS']"));
		Course1.click();
		WebElement Course2 = driver.findElement(By.xpath("//li[@data-item-label='Appium']"));
		Course2.click();
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[contains(@id,'value_1')]")).click();
		


		
		
		
		
		
		

	}

}
