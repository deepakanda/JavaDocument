package com.sel.first;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/javascript-tutorial");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement header1=driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		String text=header1.getText();
		System.out.println(text);
		
		List<WebElement> header2=driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h2"));
		Iterator<WebElement> iterator=header2.iterator();
		while(iterator.hasNext())
		{
			WebElement next=iterator.next();
			String text2=next.getText();
			System.out.println(text2);
		}
	}
}
