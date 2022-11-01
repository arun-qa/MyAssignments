package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		String firstWindowHandle = driver.getWindowHandle();
		
		System.out.println(firstWindowHandle);
		
		//Click and Confirm new Window Opens
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listHandles.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		
		//Find the number of opened tabs
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> listHandles1 = new ArrayList<String>(windowHandles1);
		
		System.out.println("Number of Opened Tabs :"+listHandles1.size());
		
		for (String eachHandle1 : windowHandles1) {
			
			if(!eachHandle1.equals(firstWindowHandle)) {
				driver.switchTo().window(eachHandle1);
				driver.close();
			}
		}
		
		driver.switchTo().window(listHandles1.get(0));

		//Close all windows except Primary
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> listHandles2 = new ArrayList<String>(windowHandles2);
		
		for (String eachHandle2 : windowHandles2) {
			
			if(!eachHandle2.equals(firstWindowHandle)) {
				driver.switchTo().window(eachHandle2);
				driver.close();
		
		
		}

}
		driver.switchTo().window(listHandles2.get(0));

		//Wait for 2 new tabs to open
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Thread.sleep(5000);
		
		
	
	}
}
