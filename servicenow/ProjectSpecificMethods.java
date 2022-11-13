package servicenow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.ReadExcel;

public class ProjectSpecificMethods {
	
	ChromeDriver driver;
	public String excelfilename;

		// TODO Auto-generated method stub
		
		@BeforeMethod
		
		public void bm() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dev116878.service-now.com/navpage.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		// TODO Auto-generated method stub
		
	
	@AfterMethod
	
		public void am()
		{
			driver.close();
}
	@DataProvider(name = "testData")
	public String[][] sendData() throws IOException {
	String[][] data = ReadExcel.getData(excelfilename);
	return data;
}


	}


