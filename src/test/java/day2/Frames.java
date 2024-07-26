package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		 driver.manage().window().maximize();
		 
		 WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		 driver.switchTo().frame(frame5);
		 
		 driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("welcome");
		 
		 driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		 
		 //checking whether the logo is displayed in frame 5
		 boolean text=driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed();
		 
		 driver.switchTo().defaultContent();
		 
		 //checking whether the logo is present or not 
		 System.out.println(text);
		 
		 
		 Thread.sleep(5000);
		 
		 

	}

}
