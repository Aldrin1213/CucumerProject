package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.pagefactory.LoginPageRepo;

public class LoginPageExe extends BaseClass {
	@Before
	public void before() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void method() {
		System.out.println("TestCase1");
		LoginPageRepo repo = new LoginPageRepo();
		repo.getUser().sendKeys("AiiTEUser");
		repo.getPwd().sendKeys("Pwd");
	}
	@Test
	public void method2() {
		System.out.println("TestCase1");
		LoginPageRepo repo1 = new LoginPageRepo();
		repo1.getUser().sendKeys("SecondUser");
		repo1.getPwd().sendKeys("Pwd");
	}
}
