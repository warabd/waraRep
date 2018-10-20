package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GcrLogin {

	WebDriver driver ;
	GcrlogloginPagefactory pf;
	
	public void setup() {
		
		 System.setProperty("webdriver.chorme.driver","./Driver/chormedriver.exe");	
		
	      driver =new ChromeDriver();
	      pf = PageFactory.initElements(driver, GcrlogloginPagefactory.class);
	      driver.get(pf.getURL());
	      driver.manage().window().maximize();
		
	}
	 public void logintest() {
		 
		pf.getMyaccount().click();
		pf.getEmail().sendKeys(pf.getUsername());
		pf.getPassword().sendKeys(pf.getPass());
		pf.getSginin().click();
		 
	 }
	 
	 public void Loginvalidation() {
		 if( pf.getMyaccountinfo().getText() .equals("My Account Information")) {
	 System.out.println("Login Passed");
	 }
      else {
     System.out.println("login failed");
	}}
	public void tearDown() {
		driver. quit();
	}
	 

public static void mai(String[]args) {
 
GcrLogin obj = new GcrLogin();
obj.setup();
obj.logintest();
obj.Loginvalidation();
obj.tearDown();
}

	 }



