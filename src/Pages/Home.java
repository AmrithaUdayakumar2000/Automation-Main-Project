package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	WebDriver driver;
	By log1=By.xpath("//*[@id=\"Capa_1\"]");
	By email=By.xpath("//*[@id=\"customer_email\"]");
	By pass=By.xpath("//*[@id=\"customer_password\"]");
	By sign=By.xpath("//*[@id=\"notifyeventsignup\"]");
	By name=By.xpath("//div[@class='left_name']");
	
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void login1()
	{
driver.findElement(log1).click();
		
	}
	public void login2()
	{
		
	driver.findElement(email).sendKeys("amrithauday20@gmail.com");
	driver.findElement(pass).sendKeys("Akshaya123");
	driver.findElement(sign).click();
}
	public void gettext()
	{
		WebElement s=driver.findElement(name);
	    String m=s.getText();
	    System.out.println("text :"+m);
	}

}
