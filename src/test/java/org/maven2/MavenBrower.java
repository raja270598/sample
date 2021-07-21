package org.maven2;

import org.base.LoginPage;
import org.libglobal.LibGlobal;
import org.maven1.Maven1;
import org.openqa.selenium.WebElement;

public class MavenBrower extends LoginPage {

	public static void main(String[] args) {

		LibGlobal global=new LibGlobal();
		global.getdriver("chrome");
		global.laungurl("https://en-gb.facebook.com/");
		
		LoginPage page=new LoginPage();
		
		WebElement txtUserName=page.getTxtUserName();
		global.typeText(txtUserName,"raja");
		WebElement txtpassword=page.getTxtPassword();
		global.typeText(txtpassword,"73376");
		WebElement btnlogin=page.getBtnlogin();
		global.btnClick(btnlogin);





	}




}
