package org.exe;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.Newlogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecutionClass extends LibGlobal {

	public static void main(String[] args) throws IOException {
		
		
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		//currentUrl();
		//title();
		
		// to enter username
		Newlogin l=new Newlogin();
		
		filltxt(l.getTxtUser(), "anjusha");
		
		filltxt(l.getTxtPass(), "jerry");
		buttonLogin(l.getBtnLogin());
		
		
	}

	//private static void fillTextBox(WebElement txtUser, String string) {
		// TODO Auto-generated method stub
		
	}
	

