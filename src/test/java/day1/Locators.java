package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demo.nopcommerce.com/");
		  
		  List <WebElement> nooflinks = driver.findElements(By.tagName("a"));
		  
		  System.out.println("nooflinks" +nooflinks.size());
		  
		  List <WebElement> noofimages = driver.findElements(By.tagName("img"));
		  
		  System.out.println("noofimages" +noofimages.size());
		  
		  //driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
		  driver.findElement(By.partialLinkText("Build your own" )).click();
		  
		  driver.quit();
		  
		  
		  
		  

	}

}
