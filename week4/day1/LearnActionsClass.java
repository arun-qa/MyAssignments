package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		//Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		
		//Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Thread.sleep(2000);

		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(brands).perform();
		
		Thread.sleep(2000);

		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
		driver.findElement(By.xpath("//a[contains(text(),'Oreal')]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(2000);
		
		WebElement categoryOption = driver.findElement(By.xpath("//span[@class='filter-name '][1]")); 
		Thread.sleep(2000);
	    categoryOption.click();

		
		//driver.findElement(By.xpath("//span[text()='Category']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//span[text()='MRP:']")).click();
		
		Thread.sleep(2000);

		
		//GO to the new window and select size as 175ml
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listhandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listhandles.get(1));
		
		WebElement findElement = driver.findElement(By.xpath("//select[@title='SIZE']"));
		
		Thread.sleep(2000);

		
		Select size = new Select(findElement);
		
		size.selectByValue("0");
		
		WebElement mrp = driver.findElement(By.xpath("//span[contains(text(),'189')]"));
		
		System.out.println(mrp.getText());
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")));
		
		WebElement grandTotal = driver.findElement(By.xpath("//span[contains(text(),'259')]"));
		
       // StringBuilder sb = new StringBuilder(grandTotal);
        
        //sb.deleteCharAt(0);
        
        //System.out.println(sb);

		
		System.out.println(grandTotal.getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
		WebElement finalGrandTotal = driver.findElement(By.xpath("//span[text()='259']"));
		
		System.out.println(finalGrandTotal.getText());
		
		if(grandTotal==finalGrandTotal)
		{
			System.out.println("Both Grand Total are same");
		}
		else
		{
			System.out.println("Grand Total are not same");
		}
		
		driver.quit();

		
		
		
		
		
		
	}

}
