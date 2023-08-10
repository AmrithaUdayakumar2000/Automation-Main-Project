package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Select {
	WebDriver driver;
	By addcart2=By.xpath("/html/body/div[3]/main/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/div/div/div[2]/div/form/div[4]/button");
	By cart=By.xpath("/html/body/div[2]/div/header/div[2]/div/div[1]/div[3]/div[3]/a/img");
	By viewcart=By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[1]/a");
	By add=By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/form/div[1]/ul/li/div/div[2]/div[2]/div[1]/div[1]/a[2]");
	By update=By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/form/div[1]/ul/li/div/div[2]/div[2]/div[1]/div[2]/button/span");
	By next1=By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/header/a/span");

	public Select(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void option2()
	{
		driver.findElement(addcart2).click();
		driver.findElement(cart).click();
	}
	public void option3()
	{
		driver.findElement(viewcart).click();
		driver.findElement(add).click();
	}
	public void option4()
	{
		driver.findElement(update).click();
		driver.findElement(next1).click();
		driver.navigate().to("https://plumgoodness.com");
	}}