package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement box1=driver.findElement(By.xpath("//input[@value='Hello World!']"));
		 WebElement box2=driver.findElement(By.xpath("//div[@class='column-right-outer']//input[2]"));
		 WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		 
		 Actions act=new Actions(driver);
		 box1.clear();
		 box1.sendKeys("Welcome");
		 
		 act.doubleClick(button).perform();
		 
		 if(box2.getAttribute("value").equals("Welcome"))
		 {
			 System.out.println("Text copied successfully on Double Click...");
		 }
		 else
		 {
			 System.out.println("Failure:Not Copied");
		 }
		 
		 //Drag and Drop
		 WebElement small=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		 WebElement big=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		 act.dragAndDrop(small, big).perform();
		 String text=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		 
		 
		 if (text.equals("Dropped!"))
		 {
			 System.out.println("succeffully droppped the element");
		 }
		 else
		 {
			 System.out.println("Failure");
		 }

	}

}
