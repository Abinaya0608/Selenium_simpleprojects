package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://testautomationpractice.blogspot.com/");
		  driver.manage().window().maximize();
		  
		  //tag#id
		  
		  //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phone");
		  
		  //tag.classname
		  
		  //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("htc");
		  
		  //tag[attribute='value']
		  
		  //driver.findElement(By.cssSelector("button[type='submit']")).click();
		  
		  //tag.classname[attribute='value']
		  
		  driver.findElement(By.cssSelector("a.read-more[href='/new-online-store-is-open']")).click();
		  
		  driver.quit();
		  

	}

}
