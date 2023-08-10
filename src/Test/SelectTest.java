package Test;

import org.testng.annotations.Test;

import Pages.Select;

public class SelectTest extends Itemtest {
	@Test(priority=3)
	public void test3() throws InterruptedException
	{
		Select ob=new Select(driver);
	
		ob.option2();
		Thread.sleep(3000);
		ob.option3();
		Thread.sleep(3000);
		ob.option4();
		Thread.sleep(3000);
}
}
