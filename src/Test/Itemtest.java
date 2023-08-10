package Test;

import org.testng.annotations.Test;

import Pages.Item;

public class Itemtest extends Hometest {
	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		Item ob=new Item(driver);
		ob.items();
		Thread.sleep(3000);
		ob.click1();
		Thread.sleep(3000);
		ob.check1();
		Thread.sleep(3000);
		ob.click2();
		Thread.sleep(3000);
		ob.wish();
		Thread.sleep(3000);
		ob.move();
		Thread.sleep(3000);
		ob.slide();
		Thread.sleep(3000);
		ob.slide1();
		Thread.sleep(3000);
		ob.slide2();
		Thread.sleep(3000);
		ob.slide3();
		Thread.sleep(3000);
		ob.details();
		Thread.sleep(3000);
		ob.scroll();
		Thread.sleep(3000);
		ob.option1();
				
	}

}
