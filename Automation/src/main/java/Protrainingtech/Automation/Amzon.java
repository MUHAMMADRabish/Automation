package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amzon {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.expedia.com/");
	   // WebElement searchfield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	  //  searchfield.sendKeys("Computer");
	    driver.manage().window().maximize();
	   /* WebElement CreateNewAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
	   
	    CreateNewAccount.click();
	    Thread.sleep(6000);
	    WebElement months=driver.findElement(By.xpath("//*[@name='birthday_month']"));
	    Select ob=new Select(months);
	    ob.selectByIndex(9);
	    WebElement days=driver.findElement(By.xpath("//*[@name='birthday_day']"));
	    Select ob6=new Select(days);
	    ob6.selectByValue("26");
	    WebElement Gender=driver.findElement(By.xpath("(//*[@value='2'])[3]"));
	    Gender.click();
	    Thread.sleep(6000);
	    WebElement submit=driver.findElement(By.name("submit"));
	    submit.click();
	    Thread.sleep(6000);
	    driver.switchTo().alert().dismiss();*/
	    Thread.sleep(6000);
	    WebElement Departure=driver.findElement(By.xpath("//*[@data-name='d1']"));
	    Departure.click();
	    Thread.sleep(6000);
	    WebElement date=driver.findElement(By.xpath("//*[@aria-label='Aug 26, 2021']"));
	    date.click();
	}

}
