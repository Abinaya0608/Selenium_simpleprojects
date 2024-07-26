package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectingcheckboxes {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 List<WebElement> elements=driver.findElements(By.xpath("//table[@id='productTable']/descendant::input"));
		 
		 for(int i=2;i<elements.size();i++)
		 {
			 elements.get(i).click();
		 }
		 
		 Thread.sleep(5000);
		 
		 driver.close();

	}

}
