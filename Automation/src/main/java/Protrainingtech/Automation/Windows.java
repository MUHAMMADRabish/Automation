package Protrainingtech.Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Thread.sleep(6000);
	    driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	    Actions ob=new Actions(driver);
	    WebElement kb=driver.findElement(By.linkText("Kindle Books"));
	    Thread.sleep(6000);
	    String Currentwindow=driver.getWindowHandle();
	  //  System.out.println(Currentwindow);
	    ob.keyDown(Keys.LEFT_SHIFT).build().perform();
	    kb.click();
	    ob.keyUp(Keys.LEFT_SHIFT).build().perform();
	    
	    
	  Set<String> windowhandles=driver.getWindowHandles();
	  
	  
	  Iterator<String> iterators=windowhandles.iterator();
	  String Firstwdhandle=iterators.next();
	  String Secondwdhandle=iterators.next();
	  System.out.println(Firstwdhandle);
	  System.out.println(Secondwdhandle);
	  driver.switchTo().window(Secondwdhandle);
	  
	  
	  
	    WebElement books=driver.findElement(By.linkText("Kindle Unlimited"));
	    books.click();
	    
	}

}
