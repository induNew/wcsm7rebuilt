package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prog1 {
	@Test
	public void method1() 
	{
		long threadId = Thread.currentThread().getId();
		Reporter.log(threadId+"  thread id",true);
		Reporter.log("method1",true);
	}

	@Test
	public void method2() 
	{
		long threadId = Thread.currentThread().getId();
		Reporter.log(threadId+"  thread id",true);
		Reporter.log("method2",true);
	}
}
