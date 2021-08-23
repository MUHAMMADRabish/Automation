package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
@FindBy(linkText = "Pharmacy") WebElement Pharmaciast;
@FindBy(linkText = "Fashion") WebElement Fashioning;
@FindBy(linkText = "Books")  WebElement Book;
@FindBy(id="nav-link-accountList") WebElement Signing;
@FindBy(xpath = "(//*[text()='Sign in'])[1]") WebElement Siginingin;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
        }
public void PharmaciesClick() {
	Pharmaciast.click();
	
}
public void Fashions() {
	Fashioning.click();
}
public void BooksToClick() {
	Book.click();
}
public void PointerHoverSign() {
	Actions ob=new Actions(driver);
	ob.moveToElement(Signing).perform();
}
public void PointerHoverSignClick() {
	Actions ob=new Actions(driver);
	ob.moveToElement(Siginingin).click().perform();
}
}

