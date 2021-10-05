package com.sel.first;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class
{
	public static WebDriver driver;
	public static void browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url)
	{
		driver.get("www.facebbok.com");
	}
	
	public static void getCurrentUrl()
	{
		String currenturl=driver.getCurrentUrl();
		System.out.println("currenturl:"+currenturl);
		
	}


	public static void getText(String name,String pass)
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("deepa");
		
		WebElement password=driver.findElement(By.xpath("//button[@name='login']"));
		password.sendKeys("12345674");
	}
	
	public static void click()
	{
			WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
			button.click();
	}

	public static void takeScreenShot(String filename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Screenshot\\shot.png");
		FileUtils.copyFile(source,destination);
		
		
	}

	public static void navigateTo(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigateBackTo()
	{
		driver.navigate().back();
	}
	
	public static void navigateForward()
	{
		driver.navigate().forward();
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static void quit()
	{
		driver.quit();
	}


	public static void wait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	








}
	
	
	
	


