package Protrainingtech.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Prmetere extends Utility {
  @Test(dataProvider = "parameter")
  public void f(String n, String s) throws InterruptedException {
	  GiantToHome homeit=new GiantToHome(driver);
	  GiantToSign signit=new GiantToSign(driver);
	 
	  homeit.SignToClick();
	  homeit.SignedToClick();
	  Thread.sleep(6000);
	  signit.NameSendKeys(n);
	  signit.PsswdSendKeys(s);
	  Thread.sleep(6000);
	  signit.SignIsClicking();
	  signit.CloseToWindow();
	  Thread.sleep(6000);
  }

  @DataProvider
  public Object[][] parameter() {
    return new Object[][] {
      new Object[] { "Asim@protrainingtech.com", "asim" },
      new Object[] { "Shahbaz@protrainingtech.com", "shahbaz" },
      new Object[] {"Numan@protrainingtech.com","Numan"}
    };
  }
}
