package org.prodapt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceAllsuddestions {
	WebDriver driver;
	
	@Test
	private void tc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\ProjectClassJuly\\Chrome\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     
	     WebElement sel = driver.findElement(By.name("q"));
	     sel.sendKeys("selenium");
	     
	     String xx = "//span[contains(text(),'selenium')]";
	     
	     List<WebElement> li = driver.findElements(By.xpath(xx));
	     int count = li.size();
	     System.out.println(count);
	     
	     for (WebElement x : li) {
	    	 String tvt = x.getText();
	    	 System.out.println(tvt);
			
		}
	     
	     
	     li.get(count - 1).click();
	     
	     
	}

}
