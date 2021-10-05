package com.sel.first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By .xpath("//input[@name='email']"));
		email.sendKeys("deepa123@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("welcome123");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		WebElement link=driver.findElement(By.linkText("Create a new account"));
		link.click();
		System.out.println("Title of page is:"+driver.getTitle());
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Screenshot\\shot.png");
		FileUtils.copyFile(source,destination);
		
		
		
		
				

}
}