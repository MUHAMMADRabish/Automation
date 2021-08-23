package Protrainingtech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/* i)How to open browser with selenium
		i)Give the path of driver
		ii)Cll the chrome driver class constructor
		iii)Use the webdriver interface*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    //How to open site in the browser
	    //How to go backward
	    //How to move forward
	    //How to maximize the browser
	    //How to get window handle
	    //How to close the browser
	  //  driver.navigate().to("https://www.amazon.com");
	    driver.get("https://www.amazon.com");
	    Thread.sleep(6000);
	    driver.navigate().back();
	    Thread.sleep(6000);
	    driver.get("https://www.bbc.com");
	    driver.navigate().forward();
	    driver.manage().window().maximize();
	String Window=  driver.getWindowHandle();
	    System.out.println(Window);
	    //driver.close();
	    driver.quit();
	}

}
