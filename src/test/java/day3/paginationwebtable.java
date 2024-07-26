package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationwebtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 //finding the total no of pages
		 int noofpages=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		 
		 //to read the data from the pages 
		 for (int p=1;p<=noofpages;p++)
		 {
			 if(p>1) 
			 {
				 WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				 activepage.click();
				 int noofrows=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
				 for(int r=1;r<=noofrows;r++)
				 {
					 String id=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[1]")).getText();
					 String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[2]")).getText();
					 String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[3]")).getText();
					 driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[4]/input")).click();
					 
					 System.out.println(id+"\t"+name+"\t"+price+"\t");
				 }
			 }
		 }
		 
		 

	}

}
