package org.base;

import java.util.Date;

import org.pojo.Loginpage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng extends LibGlobal {

	/*@BeforeClass
	private void startDateAndTime() {
		Date d = new Date();
		System.out.println("Start Date" +d);

	}
	
	@AfterClass
	private void endDateAndTime() {
		Date d = new Date();
		System.out.println("End Date" +d);

	}
	
	@BeforeMethod
	private void startBrowser() {
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		windowMax();
	}
	
	@AfterMethod
	private void endBrowser() {
		browserQuit();
	}*/
	
	@Test(groups ="smoke")
	private void tc1() {
		Loginpage l = new Loginpage();
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		windowMax();
		filltxt(l.txtuser, "anjusha");
		filltxt(l.txtpass,"245566");
	}

	@Test(groups ="sanity")
	private void tc3() {
		Loginpage l = new Loginpage();
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		windowMax();
		filltxt(l.txtuser, "uvaish");
		filltxt(l.txtpass,"245566");
	}
	
	@Test(groups ="sanity")
	private void tc2() {
		Loginpage l = new Loginpage();
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		windowMax();
		filltxt(l.txtuser, "raju");
		filltxt(l.txtpass,"24346");
	}
	
}
