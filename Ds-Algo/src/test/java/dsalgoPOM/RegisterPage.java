package dsalgoPOM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dsalgo_driver.BaseTest;
import dsalgo_webdriver_manager.DriverManager;

public class RegisterPage {
	
	public WebDriver driver;
	By UserName = By.xpath("//input[@name='username']");
	By Psswd = By.xpath("//input[@name='password1']");
	By Psswdcnfrm = By.xpath("//input[@name='password2']");
	By Regstr = By.xpath("//input[@value='Register']");
	By PsswdErrMsg = By.xpath("//div[contains(text(),'password_mismatch:The two password fields didn’t match.')]");
	By RegisterdName = By.xpath("//div[contains(text(),'New Account Created')]");
	By SignOut = By.xpath("//a[contains(@href, 'logout')]");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	public void registerPageUrl(String url) {
		driver.get(url + "register");
	}
	
	public void clickRegisterButton() {
		driver.findElement(Regstr).click();
		
	}
	public void verifyErrorMessage(String string) {
		System.out.println(driver.findElement(PsswdErrMsg).getText());
		assertEquals(driver.findElement(PsswdErrMsg).getText(), string);
	}
	public void setUserName(String userName2) {
		driver.findElement(UserName).sendKeys(userName2);
		
	}
	public void setpassword(String password) {
		driver.findElement(Psswd).sendKeys(password);
		
	}
	public void setConfirmPassword(String confirmPassword) {
		driver.findElement(Psswdcnfrm).sendKeys(confirmPassword);
	}
	 public void verifyUserNameError(String string) {
		 System.out.println(driver.findElement(UserName).getAttribute("validationMessage"));
		 assertEquals(driver.findElement(UserName).getAttribute("validationMessage"),string);
	 }
	public void clickSignOut() {
	
		driver.findElement(SignOut).click();
		
	}


}
