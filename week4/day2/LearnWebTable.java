package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement fromStation = driver.findElement(By.xpath("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("ms");
		fromStation.sendKeys(Keys.TAB);
		
		WebElement toStation = driver.findElement(By.xpath("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("chkSelectDateOnly")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		
		int size = allRows.size();
		
		List<String> allTrainNames = new ArrayList<String>();
		
		for (int i = 2; i <= size ; i++) {
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			allTrainNames.add(trainName);
		}
		
		
		int countOfAllTrainsIncludingDuplicates = allTrainNames.size();
		
		//Copy the list of train names into Set // Duplicate train names will not get added
		Set<String> setTrainNames = new LinkedHashSet<String>();
		
		for (String eachTrainName : allTrainNames) {
			if(!setTrainNames.add(eachTrainName)) {
				System.out.println(eachTrainName);
			}
		}
		
				
		/*
		 * int countOfAllTrainsWithOutDuplicates = setTrainNames.size();
		 * 
		 * if(countOfAllTrainsIncludingDuplicates == countOfAllTrainsWithOutDuplicates)
		 * { System.out.println("there is no duplicate train names"); } else {
		 * System.out.println("there are duplicate train names"); }
		 */
		

	}

}
