package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newlogin extends LibGlobal {

	public Newlogin()
	{
		
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(name="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[text()='login']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
