package mypackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGfinal {
	@Test
	public void test()
	{
		System.out.println("Hello raviTestNG");
	}
	@AfterTest
	public void test2()
	{
		System.out.println("Hello raviTestNG test2");
	}
	@BeforeTest
	public void test1()
	{
		System.out.println("Hello raviTestNG test1");
	}


}
