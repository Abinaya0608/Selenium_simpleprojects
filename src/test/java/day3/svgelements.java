package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgelements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 //login steps
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 //selecting the svg element next to TAB admin
		 driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();
		
		
	}

}
