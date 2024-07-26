package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automate	{

	public static void main(String[] args)throws InterruptedException 
	{
				WebDriver driver = new ChromeDriver();
				 driver.get("https://testautomationpractice.blogspot.com/");
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
		          driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
		         
		          driver.findElement(By.xpath("//input[@type='submit']")).click();
		          
		          List<WebElement> listoflinks=driver.findElements(By.xpath(("//a[contains(text(),'Selenium')]")));		          
		          System.out.println(listoflinks.size());
		          
		          //clicking on search result links and more button
		          
		          for(WebElement element:listoflinks)
		          {
		        	  System.out.println(element.getText());
		        	  element.click();
		          }
		          driver.findElement(By.xpath(("//a[contains(text(),'More »')]"))).click();
		          
		          Set<String> wids=driver.getWindowHandles();
		          for(String id: wids)
		          {
		        	  String title=driver.switchTo().window(id).getTitle();
		        	  System.out.println(title);
		        	  
		        	  if(title.equals("Automation Testing Practice") || title.equals("selenium - Search results - Wikipedia"))
		        	  {
		        		  driver.close();
		        	  }
		        	  
		          }
		          
		          
		       
		        

			

	}

}
