package Protrainingtech.Automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Utility {
	public WebDriver driver;
	@Parameters({"browser","uri"})
	@BeforeClass
	public void name(String browser,String uri ) {
		 if(browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(uri);
		 }else if (browser.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get(uri);
			 
		 }else if(browser.equalsIgnoreCase("Edge")) {
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.get(uri);
		 }
	 }
	@AfterClass
	public void close() throws IOException {
		
		driver.close();
	}
	 public void shots(String folder) throws IOException {
		 Date dt=new Date();
	String it=	 dt.toString().replace(" ", "_").replace(":", "_");
	System.out.println(it);
		 System.out.println(dt);
	File acreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	FileHandler.copy(acreenshot, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Pictures\\"+folder+"\\"+it+".jpg"));
	 }

}
