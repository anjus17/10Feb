package org.test;

import org.pojo.Loginpage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg extends Loginpage {
	Loginpage l;

	@Test(priority = 12, enabled = false, groups = "sanity")
	private void tc1() {
		System.out.println(5 / 0);
	}

	@Test(priority = -11, groups = "smoke")
	private void tc2() {
		System.out.println("Test 1");
		Assert.assertTrue(false, "Test 1");
	}

	@Test(priority = 21, invocationCount = 30, groups = "smoke")
	private void tc4() {
		System.out.println("Test 4");
	}

	@Test(priority = 11, groups = "sanity")
	private void tc3() {
		System.out.println("Test 3");
	}

	@Parameters({"Usernmae","password"})
	//@Test(dataProvider = "credentials")
	private void tc5(String User,String pass) {
		l = new Loginpage();
		chromeBrowserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		windowMax();
		filltxt(l.getTxtuser(), User);
		filltxt(l.getTxtpass(), pass);
	}

	@DataProvider(name = "credentials")
	private Object[][] allDatas() {
		return new Object[][] {

	{ "uvaish", "34534" }, { "Anu", "4546" }, { "jerry", "4579" } };
	

	}
}