package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Item {
	WebDriver driver;
	By item=By.xpath("//*[@id=\"section_\"]/a/span[1]");
	By select= By.xpath("//a[@href=\"/products/vitamin-c-face-serum\" and @data-collections-related=\"/collections/skincare?view=related\"]");
	By pin=By.xpath("//*[@id=\"pincode_input\"]");
	By edit=By.xpath("//*[@id=\"check-delivery-submit\"]");
	By wishlist=By.xpath("//*[@id=\"add-to-cart-form\"]/div[3]/div[1]/div[1]/a");
	By addtocart=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/form/div[3]/div[1]/input");
	By icon=By.xpath("//*[@id=\"add-to-cart-form\"]/div[2]/div/div/div/img");
	By next=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[1]/div[2]/div[1]/div/div[1]/div/button[2]/i");
	By use=By.xpath("/html/body/div[3]/main/div/div[1]/div/div/div/div/div[4]/div/div/div[2]/div/div/div[2]/a/span");
	By makeup=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[2]/nav/ul/li[6]/a/span[1]");

	public Item(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void items()
	{
		driver.findElement(item).click();
	}
	public void click1()
	{
		driver.findElement(select).click();
		
	}
	public void check1()
	{
		driver.findElement(pin).sendKeys("682038");
	}
	public void click2()
	{
		driver.findElement(edit).click();
}
	public void wish()
	{
		driver.findElement(wishlist).click();
		driver.findElement(addtocart).click();
	}
	public void move()
	{
		Actions act=new Actions(driver);
		WebElement s=driver.findElement(icon);
	act.moveToElement(s).perform();
	}
	public void slide()
	{
		driver.findElement(next).click();
	}
	public void slide1()
	
	{
		driver.findElement(next).click();
	}
	public void slide2()
	{
		driver.findElement(next).click();
	}
	public void slide3() {
		driver.findElement(next).click();
	}
	public void details()
	{
	driver.findElement(use).click();
	}
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	     driver.navigate().refresh();
	}
	public void option1()
	{
		driver.findElement(makeup).click();
	}}