package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home;

public class Hometest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://plumgoodness.com");
		driver.manage().window().maximize();
		
	}
		@Test(priority=1)
	public void test1() throws InterruptedException
	{
	Home ob=new Home(driver);
	Thread.sleep(3000);
	ob.login1();
	Thread.sleep(3000);
	ob.login2();
	Thread.sleep(3000);
	ob.gettext();
	Thread.sleep(3000);
	

}
}
