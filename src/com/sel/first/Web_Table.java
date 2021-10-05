package com.sel.first;

import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		//all data
		
		List<WebElement> data=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement web:data)
		{
			String text=web.getText();
			System.out.println(text);
		}
		System.out.println("**************************************************");
		//row data
			
		List<WebElement> rowdata=driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for(WebElement web1:rowdata)
		{
			String text=web1.getText();
			System.out.println(text);
			
		}
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			
			List<WebElement> col=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			int size=10;
			for(int i=0;i<size;i++)
			{
				String text=col.get(i).getText();
				System.out.println(text);
			if(i==7)
			{
				break;
			}
			}
			
			System.out.println("***************************************************");
			
			
			WebElement	 particular=driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
				System.out.println(particular.getText());
				
			
			
			
		
	}

}
