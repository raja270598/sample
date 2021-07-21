package org.sample;

import org.base.LoginPage;
import org.openqa.selenium.WebElement;

public class AdactinDetails extends AdactinLogin {
	public static void main(String[] args) {

		Brower maven=new Brower();
		maven.getdriver("Chrome");
		maven.laungurl("https://adactinhotelapp.com/");

		AdactinLogin page=new AdactinLogin();

		WebElement txtUserName=page.getTxtUserName();
		maven.typeText(txtUserName,"raja");
		WebElement txtPassword=page.getTxtPassword();
		maven.typeText(txtPassword,"6777363");
		WebElement btnlogin=page.getBtnlogin();
		maven.btnClick(btnlogin);







	}


}
