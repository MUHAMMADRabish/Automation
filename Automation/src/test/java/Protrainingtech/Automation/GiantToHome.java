package Protrainingtech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiantToHome {
	WebDriver driver;
	@FindBy(xpath = "//*[text()=' Sign In ']") WebElement Sign;
	@FindBy(xpath = "(//*[text()=' Sign In '])[2]") WebElement Signed;
	
	
	public GiantToHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SignToClick() {
		Sign.click();
	}
	public void SignedToClick() {
		Signed.click();
	}

}
