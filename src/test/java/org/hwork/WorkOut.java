package org.hwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class WorkOut {
	WebDriver driver;
	Select sc;
	@BeforeClass
	private void before() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAJA\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

	}
	@Parameters({"username"})
	@Test()
	private void t1(String s1) {
		WebElement txtuser = driver.findElement(By.id("username"));

		txtuser.sendKeys(s1);

	}

	@Parameters({"password"})
	@Test()
	private void t2(String s2) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(s2);

	}
	@Parameters({"login"})
	@Test()
	private void t3() {
		WebElement btnlogin = driver.findElement(By.id("login"));

		btnlogin.click();

	}


 @Parameters({"location"})
	@Test()
	private void t4() {
		WebElement location = driver.findElement(By.id("location"));
		sc= new Select(location);
		sc.selectByIndex(3);


	}

		@Parameters({"hotels"})
		@Test()
		private void t5(String s4) {
			WebElement hotels = driver.findElement(By.id("hotels"));
	         sc=new Select(hotels);
	         sc.selectByIndex(4);
		
		}
	
		@Parameters({"room_type"})
		@Test()
		private void t6(String s5) {
			WebElement roomtype = driver.findElement(By.id("room_type"));
			 sc=new Select(roomtype);
	         sc.selectByIndex(5);
		
		}
		@Parameters({"room_nos"})
		@Test()
		private void t7(String s6) {
			WebElement roomnos = driver.findElement(By.id("room_nos"));
			 sc=new Select(roomnos);
	         sc.selectByIndex(6);
		
			
		}
	
		@Parameters({"datepick_in"})
		@Test()
		private void t8(String s7) {
			WebElement checkin= driver.findElement(By.id("datepick_in"));
			checkin.clear();
			checkin.sendKeys(s7);
		}
		@Parameters({"datepick_out"})
		@Test()
		private void t9(String s8) {
			WebElement checkout= driver.findElement(By.id("datepick_out"));
			checkout.clear();
			checkout.sendKeys(s8);
		}
		@Parameters({"adult_room"})
		@Test()
		private void t10(String s9) {
	WebElement adult = driver.findElement(By.id("adult_room"));
	
	 sc=new Select(adult);
     sc.selectByIndex(9);
	
		}
			@Parameters({"child_room"})

	@Test()
	private void t5() {
		WebElement child1 = driver.findElement(By.id("child_room"));
		sc = new Select(child1);

		sc.selectByIndex(10);
	}
		@Parameters({"search"})
		@Test()
		private void t12(String s11) {
			WebElement search = driver.findElement(By.id("Submit"));
		search.click();


		}
}