package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static WebDriver driver ;
	@BeforeMethod
	public static void BeforeMethod()
	{
		
		

		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public static void Title()
	{driver.get("http://gooogle.com/");
	     String title = driver.getTitle();	
		System.out.println(title);
	}
	@AfterMethod
	public static void Quit()
	{
		driver.quit();
		
	}

}
