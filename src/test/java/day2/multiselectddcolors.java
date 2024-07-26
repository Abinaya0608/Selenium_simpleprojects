package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class multiselectddcolors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 //driver.findElement(By.xpath("//select[@id='colors']")).click();
		 
		 //locating dropdown in the webpage		 
		 WebElement mcb=driver.findElement(By.xpath("//select[@id='colors']"));
		 
		 //creating obj for select class
		 Select selectobj=new Select(mcb);
		 
		 //Total no of options
		 List<WebElement> all_options=selectobj.getOptions();
		 System.out.println(all_options.size());
		 
		 //printing all the options
		 
			for(WebElement ele:all_options)
			{
				System.out.println(ele.getText());
			}
			
			//Selecting only one option
			//selectobj.selectByVisibleText("Blue");
			//selectobj.selectByValue("green");
			
			//selecting multiple options
			for(WebElement ele:all_options)
			{
				if (ele.getText().equals("Green") || ele.getText().equals("Yellow"))
				{
				ele.click();
				}
			}
			
			
			

	}

}
