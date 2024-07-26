package day4;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datadriventesting {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		String filepath="C:\\Users\\Admin\\eclipse-workspace\\seleniumweb\\testdata\\calc_data.xlsx";
		int rows= excelutilies.getRowCount(filepath, "Sheet1");
		
		//Reading data from the excel
		for (int i =0;i<=rows;i++)
		{
			String initial_depositamount= excelutilies.getCellData(filepath, "Sheet1",i, 0);
			String interest_rate= excelutilies.getCellData(filepath, "Sheet1",i, 1);
			String length= excelutilies.getCellData(filepath, "Sheet1",i, 2);
			String compounding= excelutilies.getCellData(filepath, "Sheet1",i, 3);
			String exp_value= excelutilies.getCellData(filepath, "Sheet1",i, 4);
			
			//passing the above values into the application
			driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']")).sendKeys(initial_depositamount);
			driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).sendKeys(length);
			driver.findElement(By.xpath("//input[@formcontrolname='cdLength']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='cdLength']")).sendKeys(interest_rate);
			driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).clear();
			Select compound=new Select(driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")));
			compound.selectByVisibleText(compounding);
			
			//Clicking on the calculate button
			driver.findElement(By.xpath("//button[@type='submit']//div")).click();
			String act_value=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			if(Double.parseDouble(exp_value)==Double.parseDouble(act_value))
			{
				System.out.println("Test Passed");
				excelutilies.setCellData(filepath,"Sheet1",i,6,"Passed");
				excelutilies.fillGreenColor(filepath,"Sheet1",i,6);
			}
			else
			{
				System.out.println("Test failed");
				excelutilies.setCellData(filepath,"Sheet1",i,6,"Failed");
				excelutilies.fillRedColor(filepath,"Sheet1",i,6);
			}
			Thread.sleep(3000);
		}//forloop
		
		driver.quit();
	
	}

}


