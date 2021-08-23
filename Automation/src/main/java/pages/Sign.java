package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Create your Amazon account')]")
	WebElement Create;
	public Sign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	        }
	public void CreatButtonClick() {
		Create.click();
	}

}
