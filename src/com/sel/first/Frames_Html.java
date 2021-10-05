package com.sel.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Html 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement findElement2=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(findElement2);
		
		WebElement findElement=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		findElement.sendKeys("Welcome to automation");
		
		driver.switchTo().defaultContent();
		
		//nested frame
		
		WebElement findElement3=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		findElement3.click();
		
		WebElement findElement4=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findElement4);
		
		//inner frame
		WebElement findElement5=driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
		driver.switchTo().frame(findElement5);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome to automation");
		
		
		
		
		
		
		
	}

}
