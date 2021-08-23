package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	// WebElement  Rgstred= driver.findElement(By.id("nf-field-27"));
	 Thread.sleep(6000);
	// Rgstred.click();
	 WebElement Viewtocourse=driver.findElement(By.linkText("Customer Service"));
	 Viewtocourse.click();
	 Thread.sleep(6000);
	 WebElement Games=driver.findElement(By.partialLinkText("Toys & Gam"));
	 Games.click();
	 WebElement Searchfield=driver.findElement(By.name("field-keywords"));
	 Searchfield.sendKeys("Computer");
	 WebElement Searchclikcsicon=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	  Searchclikcsicon.click();		 
	}

}
