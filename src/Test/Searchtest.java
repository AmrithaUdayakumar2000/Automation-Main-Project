package Test;


import org.testng.annotations.Test;

import Pages.Search;

public class Searchtest extends SelectTest {
	@Test(priority=4)
	public void test4() throws InterruptedException
	{
    Search ob =new Search(driver);
    ob.home1();
	Thread.sleep(3000);
	ob.scroll2();
	Thread.sleep(3000);
	ob.logopresent();
	Thread.sleep(3000);
	ob.logout();
	}
}

