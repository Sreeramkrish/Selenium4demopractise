package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	private By usernametxtbox = By.id("Email");
	private By passwordtxtbox = By.id("Password");
	private By loginBtn = By.xpath("//button[@type='submit']");
	
	
	public  LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterusername(String username) {
		driver.findElement(usernametxtbox).clear();
		driver.findElement(usernametxtbox).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(passwordtxtbox).clear();
		driver.findElement(passwordtxtbox).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
}
