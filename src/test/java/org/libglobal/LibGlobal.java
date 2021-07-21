package org.libglobal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl.FilesImpl;
import org.maven2.MavenBrower;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

public class LibGlobal {
	public static WebDriver driver;
	public  static void getdriver(String browerName) 
	{
		try 
		{
			if (browerName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAJA\\eclipse-workspace\\Maven\\drivr\\chromedriver.exe");
				driver=new ChromeDriver();
			} 
			else
			{
				System.out.println("Invalid brower");
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void laungurl(String string)
	{
		driver.get(string);
	}

	public static void typeText(WebElement txtUserName, String string) 
	{
		txtUserName.sendKeys("string");
	}

	public static void btnClick(WebElement btnlogin)
	{
		btnlogin.click();

	}
	public static void maxWindow() {

		driver.manage().window().maximize();
	}



	public void takepic(String fileName)  throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\S RAJA\\eclipse-workspace\\Selenium\\screenshot\\First.png");

		FileUtil.copyFile(src,dest);
	}
	public void copy() throws AWTException{

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public void pageTitle() {
		String title=driver.getTitle();
		System.out.println(title);


	}
	public void pageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}


}