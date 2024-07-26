package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticwebtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//opening the webpage
		 driver.get("https://blazedemo.com/");
		 driver.manage().window().maximize();
		 
		 //selecting value from the drop down
		 
		 driver.findElement(By.xpath("//select[@name='fromPort']/option[6]")).click();
		 driver.findElement(By.xpath("//select[@name='toPort']/option[3]")).click();
		 
		 //clicking on the find flights button
		 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		 Thread.sleep(5000);
		 
		 
		 //finding the no of rows
		 int rows=driver.findElements(By.tagName("tr")).size();
		 System.out.println(rows);
		 
		 //finding the no of columns
		 int cols=driver.findElements(By.tagName("th")).size();
		 System.out.println(cols);
		 
		 
		 //storing column values in a arraylist variable
		 
		 List<String> avalue=new ArrayList<String>();
		 
		 for(int r=1;r<rows;r++)
		 {
			
			 String value=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			 avalue.add(value.replace("$",""));
		 }
		 Collections.sort(avalue);
		 
		 //clicking on the minimum priced flight
 
		for(int r=1;r<rows;r++) 
		 {
			 String temp=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
		    if (avalue.get(0).equals(temp.replace("$","")))
		    {
		    	driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[1]")).click();
		    	break;
		    }
		 }
		
		//Entering the details for booking a flight
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Abinaya");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("rajparis");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("613001");
		driver.findElement(By.xpath("//select[@id='cardType']/option[2]")).click();
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234567890335698");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("06");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("abi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String title=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		System.out.println(title);
	 

	}

}
