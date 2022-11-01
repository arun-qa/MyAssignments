package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		
		Actions obj = new Actions(driver);
		
		obj.dragAndDrop(source, target).perform();
		
		WebElement source1 = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		
		System.out.println(source1.getLocation());
		
		int xOffset = 200;
		int yOffset = 300;
		obj.dragAndDropBy(source1, xOffset, yOffset).perform();
		

	}

}
