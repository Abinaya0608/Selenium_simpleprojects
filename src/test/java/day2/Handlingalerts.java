package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://mypage.rediff.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 Alert myalert=driver.switchTo().alert();
		 Thread.sleep(5000);
		 myalert.accept();
		 

	}

}
