package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoanddatepickers 
{
	
	static void date(WebDriver driver,String year,String month,String date)
	{
		
		
		//select year from the dropdown
		WebElement yrdd=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select sobj=new Select(yrdd);
		sobj.selectByValue(year);
		
		//select month from the dropdown
		WebElement mndd=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select sobj2=new Select(mndd);
		sobj2.selectByVisibleText(month);
		
		//select date from the drop down
		List <WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates)
		{
			if (dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
		
		

public static void main(String[] args) throws InterruptedException 
{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@value='551']")).click();
		 driver.findElement(By.xpath("//input[@name='travname']")).sendKeys("abinaya");
		 driver.findElement(By.xpath("//input[@name='travlastname']")).sendKeys("wilson");
		 driver.findElement(By.xpath("//textarea[@name='order_comments']")).sendKeys("gonna travel");	
		 //selecting DOB 
		 driver.findElement(By.xpath("//input[@name='dob']")).click();
		 date(driver,"1989","Aug","6");
		 //selecting gender
		 driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		 
		 //selecting trip type
		 driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		 //selecting from and to city
		 driver.findElement(By.xpath("//input[@name='fromcity']")).sendKeys("Chennai");
		 driver.findElement(By.xpath("//input[@name='tocity']")).sendKeys("Bangalore");
		 
		 driver.findElement(By.xpath("//input[@name='departon']")).click();
		 date(driver,"2025","Jan","10");
		 driver.findElement(By.xpath("//input[@name='returndate']")).click();
		 date(driver,"2025","Jan","20");
		 driver.findElement(By.xpath("//textarea[@placeholder='Enter any additional information that you like us to keep in mind.']")).sendKeys("Business Trip");
		 
		 driver.findElement(By.xpath("//span[@title='Visa application']")).click();
		 driver.findElement(By.xpath("//input[@name='appoinmentdate']")).click();
		 date(driver,"2021","May","11");
		 driver.findElement(By.xpath("//input[@value='3']")).click();
		 
		 List<WebElement> alloptions=driver.findElements(By.xpath("//select[@id='reasondummy']//option"));
		 System.out.println(alloptions.size());
		 for(WebElement ele:alloptions)
		 {
			 if (ele.getText().equals("Office work place needs it"))
			 {
				 System.out.println(ele.getText());
				 ele.click();
				 break;
			 } 
		 }

		 driver.findElement(By.xpath("//input[@name='billname']")).sendKeys("Infosys");
		 driver.findElement(By.xpath("//input[@name='billing_phone']")).sendKeys("9944490029");
		 driver.findElement(By.xpath("//input[@name='billing_email']")).sendKeys("prakash.annamalai@ymail.com");
		 List<WebElement> alloptions2=driver.findElements(By.xpath("//select[@id='billing_country']//option"));
		 System.out.println(alloptions2.size());
		 for(WebElement ele2:alloptions2)
		 {
			 if (ele2.getText().equals("Bangladesh"))
			 {
				 System.out.println(ele2.getText());
				 ele2.click();
				 break;
			 }
		 }
		 driver.findElement(By.xpath("//input[@placeholder='House number and street name']")).sendKeys("Flat 418 Rajparis");
		 driver.findElement(By.xpath("//input[@placeholder='Apartment, suite, unit, etc. (optional)']")).sendKeys("Sithalapakkam");
		 driver.findElement(By.xpath("//input[@name='billing_city']")).sendKeys("Bangladesh City");
		 List<WebElement> alloptions3=driver.findElements(By.xpath("//select[@id='billing_state']//option"));
		 System.out.println(alloptions3.size());
		 for(WebElement ele3:alloptions3)
		 {
			 if (ele3.getText().equals("Bandarban"))
			 {
				 System.out.println(ele3.getText());
				 ele3.click();
				 break;
			 }
		 }
		 
		
		 driver.findElement(By.xpath("//input[@name='billing_postcode']")).sendKeys("613001");
		 //Thread.sleep(3000);
		 WebElement ele4= driver.findElement(By.xpath("//button[@id='place_order']"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ele4);
			
	
		 
	}

}
