package org.prodapt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {
	static WebDriver driver;
	
	@Test
	public void TC() {
		
		
	}
	
	@Test(priority = 0,enabled=false)
	public static void TC1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://www.adactin.com/HotelApp/");
	     String s = driver.getTitle();
    	 System.out.println(s);
         if(s.equals("Adactin.com - Hotel Reservation System")) {
        	 System.out.println("adactin TITLE");
         }else {
        	 System.out.println("Not an ad title");
          }
	     WebElement user = driver.findElement(By.id("username")); user.sendKeys("Sooraj");
	     String u = user.getAttribute("value");
	     System.out.println(u);
	     Dimension d = user.getSize();
	     int h =d.getHeight();
	     int w = d.getWidth();
	     System.out.println("HEIGHT :  "+ h);
	     System.out.println("WIDHT  :  "+ w);
	     Point poi = user.getLocation();
	     int x = poi.getX();
	     int y = poi.getY();
	     System.out.println("X :  "+ x);
	     System.out.println("Y  :  "+ y);
	     String font = user.getCssValue("font-size");
	     String color = user.getCssValue("color");
	     String fam = user.getCssValue("font-family");
	     String back = user.getCssValue("backgroung");
	     System.out.println(font  +  color + fam + back);
         poi.getY();
	     WebElement pass = driver.findElement(By.id("password")); pass.sendKeys("dfdf");
	     String p = pass.getAttribute("value");
	     System.out.println(p);
	     WebElement login = driver.findElement(By.id("login")); login.click();
	     boolean message = driver.findElement(By.xpath("//a[contains(@href,'http://adactinhotelapp.com/ForgotPassword.php')]")).isDisplayed();
         if(message == true) {
        	 System.out.println("Invalid mess shown");
         }else {
         	System.out.println("Invalid mess not shown");
         	}
	     
	}
	
	@Test(enabled=false,priority = 1)
	public static void TC2() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("login1")).sendKeys("venkat123");
		//driver.quit();
		
	}
	
	@Test(enabled=false)
	public static void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		String path="C:\\Users\\10657527\\Desktop\\Venkatraman.docx";
		driver.findElement(By.name("uploadfile_0")).sendKeys(path);;
		
	}
	
	@Test(enabled=false)
	public static void TC4() throws InterruptedException, AWTException {
		driver.get("http://demo.guru99.com/test/upload/");
		String path="C:\\Users\\10657527\\Desktop\\Venkatraman.docx";
		driver.findElement(By.name("uploadfile_0")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		StringSelection selection = new StringSelection(
		path);
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(selection, null);
		// press ctrl+vsss
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		// release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		// press enter
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);o
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	} 
	
	@Test
	public static void TC5() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");;
		
		    
		String url = "//span[contains(text(),'selenium]'";
		List<WebElement> all = driver.findElements(By.xpath(url));
		
		int count = all.size();
		System.out.println(count);
	}
	
}
