package org.prodapt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	     
	     String xx = "//span[contains( (),'selenium')]";
	     
	     List<WebElement> li = driver.findElements(By.xpath(xx));
	     int count = li.size();
	     System.out.println(count);
	     
	     for (WebElement x : li) {
	    	 String tvt = x.getText();
	    	 System.out.println(tvt);
			
		}
	     Select s = new Select(sel);
	     List< WebElement > lll = s.getOptions();
	     for(int i=0;i<=lll.size();i++) {
	    	 WebElement ghg = lll.get(i);
	    	 String txt = ghg.getText();
	    	 System.out.println(txt);
	    	 s.selectByVisibleText(txt);
	    	 WebElement sss = lll.get(i);
	    	 String ggg = sss.getAttribute ("value");
	    	 s.selectByValue(ggg);
	     }
	     
	     
	     li.get(count - 1).click();
	     
	     
	}

}
