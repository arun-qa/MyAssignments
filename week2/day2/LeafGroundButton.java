package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml;");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		driver.getTitle();
		
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		
		System.out.println(enabled);
		
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		
		System.out.println(location);
		
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background");
		
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		
		System.out.println(size);
		
		

	}

}
