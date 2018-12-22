

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
     WebDriver  driver;
             By logout= By.id("Log Out");
			public Logout(WebDriver driver) {
				super();
				this.driver = driver;
			}
			public void clickonlogout()
			{
				driver.findElement(logout).click();
			}
             
             

}
