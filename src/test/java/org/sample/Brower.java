package org.sample;

import org.base.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower {
	public static WebDriver driver;
	public void getdriver(String browerName)
	{
		try {
			if (browerName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.dirver", "C:\\Users\\S RAJA\\eclipse-workspace\\Maven\\drivr\\chromedriver.exe");

				driver=new ChromeDriver();





			}
			else
			{

				System.out.println("invalid brower");

			}


		} catch (Exception e) 
		{
			e.printStackTrace();

		}




	}
	public void laungurl(String string) {
		driver.get(string);

	}
	public void typeText(WebElement txtUserName, String data) {
		txtUserName.sendKeys(data);

	}
	public void btnClick(WebElement btnlogin) {
		btnlogin.click();

	}






}