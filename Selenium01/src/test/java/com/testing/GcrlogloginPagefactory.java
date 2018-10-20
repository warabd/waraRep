package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GcrlogloginPagefactory {


	@FindBy(xpath="//*[@class=\"ui-button-text")
	private WebElement myaccount;

	@FindBy(xpath="//*[@name=\"email_address\"]")
	private WebElement email;
	
	

	@FindBy(xpath="//*[@type=\"password\"])")
	private WebElement password;
	

	@FindBy(xpath="//*[@class=\"ui-button-text\"][6]")
	private WebElement sginin ;
	

	@FindBy(xpath="//*[contains(text(),\"My Account Information\")]")
	private WebElement myaccountinfo;

	
	
	
	private String URL=" http://www.gcrit.com/build3/login.php";
	
	private String Username="uwara16@gmail.com";
	
	private String Pass ="polash1984";
	
	
	

	public WebElement getMyaccount() {
		return myaccount;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSginin() {
		return sginin;
	}


	public WebElement getMyaccountinfo() {
		return myaccountinfo;
	}


	public String getURL() {
		return URL;
	}


	public String getUsername() {
		return Username;
	}


	public String getPass() {
		return Pass;
	}
		
	

	}


