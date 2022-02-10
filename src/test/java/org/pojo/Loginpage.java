package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends LibGlobal {
	
	public Loginpage()
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement txtuser;


	@FindBy(name="pass")
	public WebElement txtpass;

	@FindBy(xpath="//button[text()='login']")
	public WebElement btnlogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}




}

