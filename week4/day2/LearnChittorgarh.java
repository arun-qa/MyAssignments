package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnChittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals')]")).click();
		
		List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
		int size = listOfNames.size();
		System.out.println(size);
		
		List<String> allSecurityNames = new ArrayList<String>();
		
		for(WebElement each:listOfNames) {
			
			String text = each.getText();
			allSecurityNames.add(text);
			}
		System.out.println(allSecurityNames);
		
		Set<String> set = new HashSet<String>(allSecurityNames);
		
		System.out.println(set);
		
		if(allSecurityNames.size()!= set.size())
		{
			System.out.println("Contains Duplicates");
		}
		else
		{
			System.out.println("No Duplicates found");
		}	
		

	}

}
