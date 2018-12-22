

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	    WebDriver driver;
	 By email= By.id("email");
	 By pwd=By.id("pass");
	 By login=By.id("send2");
	 
	 public Login(WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	 public void typeemail(String data)
	 {
		driver.findElement(email).sendKeys(data);
		
	 }
	 public void typepassword(String data)
	 {
		 driver.findElement(pwd).sendKeys(data);
		 
	 }
	 public void clickonlogin()
	 {
		 driver.findElement(login).click();
	 }
}











