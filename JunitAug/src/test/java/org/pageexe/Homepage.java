package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pagefactory.LoginPageRepo;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Homepage extends BaseClass {

	@Before
	public void before() {
		driver.get("https://www.facebook.com/");
	}


	@Test
	public void method() {
		System.out.println("TestCase3");
		LoginPageRepo repo = new LoginPageRepo();
		repo.getUser().sendKeys("ThirdUser");
		repo.getPwd().sendKeys("Pwd");
	}

	
	@Test
	public void method2() {
		System.out.println("TestCas4");
		LoginPageRepo repo1 = new LoginPageRepo();
		repo1.getUser().sendKeys("FourthUser");
		repo1.getPwd().sendKeys("Pwd");
	}
	
	@Test
	public void method3()
	{
		ExtentTest logger = extent.createTest("Message Check Test");
		System.out.println("Test Case 5");
		String EXPECTED = "Facebook helps you connect and share with the people in your life"; //expected 
		LoginPageRepo repo2 = new LoginPageRepo();
		System.out.println(repo2.getMsg().getText());
		String ACTUAL = repo2.getMsg().getText();
		
		Assert.assertTrue(ACTUAL.contains(EXPECTED));
		logger.log(Status.PASS, "Title verified");
	}
}
