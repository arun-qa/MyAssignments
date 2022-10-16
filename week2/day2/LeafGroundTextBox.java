package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Arun G");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		
		boolean enabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		System.out.println(enabled);
		
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		
		String attribute = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println(attribute);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		findElement.sendKeys("arun09it@gmail.com");
		findElement.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("This ia about yourself TextBox");
		
		
		
		

	}

}
