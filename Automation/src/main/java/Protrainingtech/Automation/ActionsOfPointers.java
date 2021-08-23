package Protrainingtech.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfPointers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Thread.sleep(6000);
	    driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	    driver.manage().window().maximize();
	    Actions ob=new Actions(driver);
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS );
	   /* WebElement loggss=driver.findElement(By.id("nav-link-accountList"));
	    Thread.sleep(6000);
	    ob.moveToElement(loggss).build().perform();
	    Thread.sleep(6000);
	    WebElement Subscriberslinks=driver.findElement(By.linkText("Subscribe & Save Items"));
	    ob.moveToElement(Subscriberslinks).click().build().perform();
	    WebElement dropableclicks=driver.findElement(By.linkText("Droppable"));
	    dropableclicks.click();
	    driver.switchTo().frame(0);
	    WebElement dragged=driver.findElement(By.id("draggable"));
	    WebElement droped=driver.findElement(By.id("droppable"));
	    Thread.sleep(6000);
	    ob.dragAndDrop(dragged, droped).build().perform();
	    driver.switchTo().parentFrame();
	    WebElement resizeablelinksd=driver.findElement(By.linkText("Resizable"));
	    resizeablelinksd.click();
	    driver.switchTo().frame(0);
	    WebElement dr=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	    ob.dragAndDropBy(dr, 0, 100).build().perform();
	    WebElement fields=driver.findElement(By.name("field-keywords"));
	    fields.sendKeys("computer");
	    Thread.sleep(6000);
	    //fields.sendKeys(Keys.ENTER);
	  //  ob.sendKeys(fields, Keys.ENTER).build().perform();
	   
	    ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(6000);
	    ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(6000);
	    //ob.keyDown(Keys.DELETE).keyUp(Keys.DELETE).build().perform();
	    ob.sendKeys(Keys.DELETE).perform();
	    Thread.sleep(6000);
	    ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
	    WebElement pictures=driver.findElement(By.xpath("//img[@style='cursor: pointer;6']"));
	    ob.contextClick(pictures).perform();
	    
	}

}
