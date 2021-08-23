package Protrainingtech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CreateAnAccount;
import pages.Home;
import pages.Sign;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestFirst extends Utility {
  @Test(priority = 1)
  public void f() throws InterruptedException {
	Home home=new Home(driver);
	home.PharmaciesClick();
	Thread.sleep(6000);
	driver.navigate().back();
	home.Fashions();
	Thread.sleep(6000);
	driver.navigate().back();
	home.BooksToClick();
	assertEquals(false, true);
  }
  //how to control the flow of execution for test annotations
  
  
  
  @Test(priority = 2,dependsOnMethods = "f")
  public void CreatAnAccountVerification() throws InterruptedException {
	  Home home=new Home(driver);
	  home.PointerHoverSign();
	  home.PointerHoverSignClick();
	  Sign sign=new Sign(driver);
	  sign.CreatButtonClick();
	  CreateAnAccount createanaccount=new CreateAnAccount(driver);
	  //i)How to get text for an element
	WebElement Heading= createanaccount.HeadingVerificationMethod();
	String headingtoverificatio=Heading.getText();
	System.out.println(headingtoverificatio);
	//ii)How to verify the text returned are correct
	SoftAssert softassert=new SoftAssert();
	
	softassert.assertEquals("Create account", headingtoverificatio);
	Thread.sleep(6000);
	createanaccount.CreateAnAccountClick();
	softassert.assertAll();
  }
 
  

  
 }

