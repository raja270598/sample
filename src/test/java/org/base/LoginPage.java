package org.base;

import org.libglobal.LibGlobal;
//import org.maven2.MavenBrower;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal
{	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUserName;
	@FindBy(id="pass")
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
