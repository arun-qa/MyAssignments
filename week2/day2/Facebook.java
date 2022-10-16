package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("9787567757");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		WebElement elementDay = driver.findElement(By.id("day"));
		Select Day = new Select(elementDay);
		Day.selectByVisibleText("18");
		
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select Month = new Select(elementMonth);
		Month.selectByVisibleText("Dec");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select Year = new Select(elementYear);
		Year.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		
		

	}

}
