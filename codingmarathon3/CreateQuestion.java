package codingmarathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateQuestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		
		Thread.sleep(5000);
		
		WebElement clickChatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		
		driver.executeScript("arguments[0].click();", clickChatter);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		
		Thread.sleep(5000);
		
		String text= "Test QA";
		
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(text);
		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//div[@role='textbox']//p[1]")).sendKeys("Test QA");
		
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		
		Thread.sleep(3000);
		
		WebElement confirm = driver.findElement(By.xpath("//div[@class='cuf-body cuf-questionTitle forceChatterFeedBodyQuestionWithoutAnswer']/span"));
		String text1 = confirm.getText();
		System.out.println(text1);
		
		if(text1.equals(text))
		{
			System.out.println("Question appered");
		}
	
		
		
		
		

	}

}
