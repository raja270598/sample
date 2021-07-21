package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends Brower{
	public AdactinLogin()
	{
		PageFactory.initElements(driver, this);
	}


	@FindAll({ @FindBy  (id="username"), @FindBy(xpath = "//input[@name='username']") } )
	private WebElement txtUserName;
	@FindBys({ @FindBy (id="password"), @FindBy (xpath = "//input[@name='password']" ) } )
	private WebElement txtPassword;

	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}




}
