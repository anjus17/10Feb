package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	public static Actions a;
	
	public static void chromeBrowserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	public static void urlLoad (String url)
	{
		driver.get(url);	
	}
	
	public static void windowMax() {
		driver.manage().window().maximize();
	}

	public static String currentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static String title()
	{	
		String title = driver.getTitle();	
		return title;
	}
	public static void filltxt(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	public static void buttonLogin(WebElement element)
	{
	element.click();	
	}
	public static void mouseHover(WebElement target)
	{
		a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void rightClick(WebElement rclick) {
		a.contextClick(rclick).perform();
	}
	
	public static void browserQuit() {
driver.quit();
	}
	public static void toTakeSnap(String Filename) throws IOException
	{
		TakesScreenshot tk = (TakesScreenshot)driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjectDec\\Screenshot"+Filename+".png");
		FileUtils.copyFile(f, des);
	}
	
	
	
	}
	
	
	


