package Protrainingtech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiantToSign {
public WebDriver driver;
@FindBy(name="username") WebElement name;
@FindBy(name = "password") WebElement psswd;
@FindBy(xpath = "//*[text()=' Sign in ']") WebElement SignToClick;
@FindBy(xpath = "//*[@aria-label='close dialog']") WebElement Close;
public GiantToSign(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void NameSendKeys(String name) {
	this.name.sendKeys(name);
}
public void PsswdSendKeys(String pswd) {
	psswd.sendKeys(pswd);
}
public void SignIsClicking() {
	SignToClick.click();
}
public void CloseToWindow() {
	Close.click();
}
}
