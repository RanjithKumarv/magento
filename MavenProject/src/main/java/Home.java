

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ranjith
 *@param driver
 *
 */
public class Home {
		WebDriver driver;
	      By myacc=By.linkText("My Account");
		public Home(WebDriver driver) {
			super();
			this.driver = driver;
		}
		/**
		 * @return none
		 */
		public void clickOnMyAccount()
		{
			driver.findElement(myacc).click();;
		}
	      
	      

}
