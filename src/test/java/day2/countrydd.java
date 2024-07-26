package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countrydd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//select[@name='country']")).click();
		 
		 /*locating dropdown in the webpage		 
		 WebElement cb=driver.findElement(By.xpath("//select[@name='country']"));
		 
		 //creating obj for select class
		 Select selectobj=new Select(cb);
		 
		 //Total no of options
		 List<WebElement> all_options=selectobj.getOptions();
		 System.out.println(all_options.size());
		 
		 //printing all the options
		 
		for(WebElement ele:all_options)
		{
			System.out.println(ele.getText());
		}
		
		//Selecting only one option
		//selectobj.selectByVisibleText("India");
		//selectobj.selectByValue("3");*/
		
		//Without using select class object
		 //locating dropdown in the webpage		 
		 List <WebElement> checkbox=driver.findElements(By.xpath("//select[@name='country']/option"));
		  
		//Total no of options
		 System.out.println(checkbox.size());
		 
		//Selecting only one option
		 driver.findElement(By.xpath("//select[@name='country']/option[6]")).click();
		 
		 
		
		

	}

}
