package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Thread.sleep(6000);
	    driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	    driver.manage().window().maximize();
	    Actions ob=new Actions(driver);
	    
	    WebDriverWait wt=new WebDriverWait(driver, 20);
	    wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@style='cursor: pointer;6']")));
	    WebElement pictures=driver.findElement(By.xpath("//img[@style='cursor: pointer;6']"));
	    ob.contextClick(pictures).perform();
	}

}
