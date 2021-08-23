package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	public WebDriver driver;
@FindBy(xpath="//*[contains(text(),'Create account')]") WebElement Heading;
@FindBy(id = "a-autoid-0") WebElement CreateButtonAccount;
public CreateAnAccount(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
        }
public WebElement HeadingVerificationMethod() {
	return Heading;
}
public void CreateAnAccountClick() {
	CreateButtonAccount.click();
}

}
