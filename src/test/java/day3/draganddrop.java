package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		 
		 Actions act=new Actions(driver);
		 
		 //first drag and drop
		 WebElement source=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		 WebElement destination=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']//li[@class='placeholder']"));
		 act.dragAndDrop(source, destination).perform();
		 
		 //second drag and drop
		 WebElement source1=driver.findElement(By.xpath("//section[@class='g-wrapper']//li[4]//a[1]"));
		 WebElement destination1=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		 act.dragAndDrop(source1, destination1).perform();
		 
		 //third drag and drop
		 WebElement source2=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		 WebElement destination2=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		 act.dragAndDrop(source2, destination2).perform();
		 
		 //fourth drag and drop
		 WebElement source3=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		 WebElement destination3=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		 act.dragAndDrop(source3, destination3).perform();
		 

	}

}
