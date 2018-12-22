

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
@Test
	public  void credentials() 
	{
		String url="http://www.magento.com";
		       ChromeDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		       driver.get(url);
		       Home h=new Home(driver);
		       h.clickOnMyAccount();
		       
		       
		          Login l1 = new Login(driver);
		          l1.typeemail("nitinmanjunath1991@gmail.com");
		          l1.typepassword("Welcome123");
		          l1.clickonlogin();
		          
		          Logout l2 = new Logout(driver);
		          l2.clickonlogout();
		          
		          
		          driver.quit();

	}

}
