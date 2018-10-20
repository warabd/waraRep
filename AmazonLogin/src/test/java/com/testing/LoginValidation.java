package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginValidation {

	WebDriver driver;
	LoginPagefactory pf;
	
	
	public void setup() {
		
        System.setProperty("webdriver.chorme.driver","./Driver/chormedriver.exe");
        
        WebDriver driver =new ChromeDriver();
	    pf = PageFactory.initElements(driver, LoginPagefactory.class);
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
    	
    	
    		 if( pf.getMyaccount().getText() .equals("Amazon  ")) {
    			 System.out.println("Login Passed");
    			 }
    		      else {
    		     System.out.println("login failed");
    			}}
    			public void tearDown() {
    				driver. quit();
    	
    			}
    			
    			
    			public static void mai(String[]args) {
    				 
    				LoginValidation obj = new LoginValidation();
    				obj.setup();
    				obj.logintest();
    				obj.Loginvalidation();
    				obj.tearDown();
    				
    				
    				
    				
    				
    				
    				
    			}   				
    				
    				
    				
}