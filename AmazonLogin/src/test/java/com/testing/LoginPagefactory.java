package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagefactory {

	
	@FindBy(xpath="//*[@class='nav-line-2']")
	private WebElement Myaccount;
	
	@FindBy(xpath="//*[@type='email']")
	private WebElement email;
	

	@FindBy(xpath="//*[@type=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	private WebElement sginin;

	@FindBy(xpath="//*[@class='nav-sprite nav-logo-base']")
	private WebElement amazon ;
	
	
	  private String URL ="https://www.amazon.com/gp/css/homepage.html?ref=nav_youraccount_btn";
	  
	  private String Username= "wummul@yahoo.com";
	  
	  private String Pass = "polash@1984";
	
	
	
	public WebElement getMyaccount() {
		return Myaccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getAmazon() {
		return amazon;
	}



	public WebElement getSginin() {
		return sginin;
	}

	public String getUsername() {
		return Username;
	}

	public String getPass() {
		return Pass;
	}

	public String getURL() {
	
		return URL;
	}
	
	
	
	
}
