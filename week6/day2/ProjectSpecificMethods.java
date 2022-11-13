package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public String excelfilename;
	@Parameters({"url","browserName"})
	@BeforeMethod
		
		public void bm(String URL,String BrowserName) {
		if(BrowserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(BrowserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("Select edge/chrome browser");
		}
			
			driver.manage().window().maximize();
			driver.get(URL);
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
