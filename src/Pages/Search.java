package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	WebDriver driver;
	By search=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[1]/input");
	By logo=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/h1/a/img");
	By hamburger=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[1]/div/a");
	By order=By.xpath("/html/body/div[2]/div/header/div[3]/div/div/nav/ul/li[2]/a/span[2]");
	By cancel=By.xpath("/html/body/div[2]/div/header/div[3]/div/div/nav/ul/li[2]/div/ul/li[1]/a/span");
	By home1=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/h1/a/img");
    By log2=By.xpath("//*[@id=\"Capa_1\"]");
    By logout=By.xpath("/html/body/div[3]/main/div/div/div[2]/a");
	public Search(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void home1()
	{
		WebElement s=driver.findElement(search);
		s.sendKeys("facewash");
		s.sendKeys(Keys.RETURN);
	}
	public void scroll2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	     driver.navigate().refresh();
	}
	public void logopresent() 
	{	 
	WebElement logo1=driver.findElement(logo);
	boolean l=logo1.isDisplayed();
	System.out.println("logo is present: "+l);
	driver.findElement(hamburger).click();
	}
	public void logout()
	{
		
	driver.findElement(order).click();
	driver.findElement(cancel).click();
	driver.findElement(home1).click();
	driver.findElement(log2).click();
	driver.findElement(logout).click();
	
	}

}
