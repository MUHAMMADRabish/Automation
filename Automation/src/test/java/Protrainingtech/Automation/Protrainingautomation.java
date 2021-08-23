package Protrainingtech.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Protrainingautomation extends Utility {
  @Test(groups = {"Adhoc","Positive"})
  public void f() throws IOException, InterruptedException {
	 		  GiantToHome homeit=new GiantToHome(driver);
		  GiantToSign signit=new GiantToSign(driver);
		  List<WebElement> linked=driver.findElements(By.tagName("a"));
		  System.out.println(linked.size());
		  for (WebElement lk : linked) {
			  System.out.println(lk.getText());
		  }
		 
		 /*Properties pro=new Properties();
		 FileInputStream it=new FileInputStream("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\Automation\\Pro.properties");
		  pro.load(it);
		String id=  pro.getProperty("Email");
		String ki=  pro.getProperty("Password");
		 homeit.SignToClick();
		  homeit.SignedToClick();
		  Thread.sleep(6000);
		  signit.NameSendKeys(id);
		  signit.PsswdSendKeys(ki);
		  Thread.sleep(6000);
		  signit.SignIsClicking();
		  signit.CloseToWindow();
		  Thread.sleep(6000);*/
		  
	  }
  @Test(groups= {"Positive"})
  public void groups() {
	  System.out.println("this to positive group");
	  
  }
  @Test(groups= {"Negative","Positive"})
  public void town() {
	  System.out.println("this to negative group");
	  
  }
  }

