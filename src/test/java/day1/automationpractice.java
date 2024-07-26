package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
          driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
         
          driver.findElement(By.xpath("//input[@type='submit']")).click();
          
          //Getting no of links displayed after clicking the search button
          
           List<WebElement> links=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
           System.out.println("no of links" +links.size());
           
           /*for(WebElement list:links)
           {
        	  System.out.println(list);
        	   
           }*/
          
          
        

	}

}
