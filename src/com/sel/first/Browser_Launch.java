package com.sel.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
				
		
		
	}

}
