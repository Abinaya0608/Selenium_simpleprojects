package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //ChromeDriver driver = new ChromeDriver();
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demo.nopcommerce.com/");
		  
		  String act_title= driver.getTitle();
		  
		  if (act_title.equals("nopCommerce demo store"))
		  {
			  System.out.println("tc passed");
			  
		  }
		  else 
		  {
			  System.out.println("tc failed");
		  }
		  
		  driver.quit();
		  }
		  
		  
		  

	}


