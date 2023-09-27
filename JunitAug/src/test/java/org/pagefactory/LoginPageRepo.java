package org.pagefactory;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo extends BaseClass {
	public LoginPageRepo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}
	
	@FindBy(id = "pass")
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(xpath = "//*[@class='_8eso']")
	private WebElement msg;

	public WebElement getMsg() {
		return msg;
	}
	
	
	
	// @findBys AND @findAll OR
}
