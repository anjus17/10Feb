package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String title() {
		String title = driver.getTitle();
		return title;
	}

	public static void passTxt(WebElement element, String txt) {
		element.sendKeys(txt);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void browswerClose() {
		driver.close();
	}

	public static void browserQuit() {
		driver.quit();
	}

	public static void screenShot(String picture) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjectDec\\Screenshot\\" + picture + ".png");
		FileUtils.copyFile(temp, des);
	}

	public static void selectIndex(WebElement element, int ind) {
		Select s = new Select(element);
		s.selectByIndex(ind);
	}

	public static void selectValue(WebElement element, String val) {
		Select s = new Select(element);
		s.selectByValue(val);
	}

	public static void selectVisibleText(WebElement element, String txt) {
		Select s = new Select(element);
		s.selectByVisibleText(txt);
	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static String getTexts(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttributes(WebElement element, String val) {
		String attribute = element.getAttribute("val");
		return attribute;
	}
	public static void mouseHandle(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void dragDrop(WebElement Src, WebElement Des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(Src,Des).perform();
	}
	
	public static void clickDouble(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public static void keyActions(WebElement element, String k ) {
		Actions a = new Actions(driver);
		a.keyDown(element,k);
		a.keyUp(element,k);
	}

	public static String alertAccept() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		al.accept();
		return text;

	}
	public static String alertDismiss() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		al.dismiss();
		return text;

}
	
	
	
	}


