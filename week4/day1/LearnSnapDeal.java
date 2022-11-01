package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		
		WebElement mensFashion = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(mensFashion).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
				
		WebElement count = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		
		String size = count.getText();
		
		System.out.println("Total Number Of Sports Shoes :"+ size);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> Price= driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		List<String> shoes = new ArrayList<String>();
		
		for(int i=0; i<Price.size();i++) {
			String text = Price.get(i).getText();
			System.out.println(text);
			shoes.add(text);
			String replaceAll = text.replaceAll("\\D","");
			//System.out.println(replaceAll);
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(parseInt);
		}
		
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("900");
		
		Thread.sleep(2000);
		
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("1200");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		
		Thread.sleep(2000);

		
		List<WebElement> filtersapplied = driver
				.findElements(By.xpath("//div[@class='filters']//following-sibling::a"));
		System.out.println("Filters Applied:");
		for (int i = 0; i < filtersapplied.size(); i++) {
			System.out.println(filtersapplied.get(i).getText());
		}
		WebElement movetoresult = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		obj.moveToElement(movetoresult).perform();

		//String defaultwindow = driver.getWindowHandle();
		//System.out.println(defaultwindow);

		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		Thread.sleep(5000);
		
		WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println("Price: " + price.getText());

		WebElement perct = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		System.out.println("Offer: " + perct.getText());

		//driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

		driver.close();
		
		Thread.sleep(3000);
		
		driver.quit();

		
		

		
		
	
	
	
	
	
	
	}
	
	
	
	
	

	
}
