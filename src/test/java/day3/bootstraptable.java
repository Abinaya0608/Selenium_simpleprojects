package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstraptable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 //login steps
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 //selecting the TAB admin
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 String text=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();
		 System.out.println(text);
		 
		 //finding total no of paged
		 int trecords=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Records")-2));
		 
		 //displaying username and user roles
		 for (int i=1;i<=trecords;i++)
		 {
			 String username=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[@class='oxd-table-row oxd-table-row--with-border']/div[2]")).getText();
			 String userrole=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[\"+i+\"]/div[@class='oxd-table-row oxd-table-row--with-border']/div[3]")).getText();
			 System.out.println(username+"\t"+userrole);
		 }
		 
		 
	}

}
