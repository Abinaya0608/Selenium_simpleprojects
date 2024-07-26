package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 //login steps
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 //selecting the TAB PIM
		 driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 
		 //selecting on the dropdown
		 driver.findElement(By.xpath("//body/div[@id=\"app\"]/div[@class=\"oxd-layout\"]/div[@class=\"oxd-layout-container\"]/div[@class=\"oxd-layout-context\"]/div[@class=\"orangehrm-background-container\"]/div[@class=\"oxd-table-filter\"]/div[@class=\"oxd-table-filter-area\"]/form[@class=\"oxd-form\"]/div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		 
		 List<WebElement> checkoptions=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		 System.out.println(checkoptions.size());
		 
		 //printing the options
		 
		 for(WebElement ele:checkoptions)
		 {
			 System.out.println(ele.getText());
			 
		 }
		 
		 
		 

	}

}
