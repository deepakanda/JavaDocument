package com.sel.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop_Down 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
	
		WebElement btn=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btn.click();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("deepa");
			
			WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("deeps");
		
			Thread.sleep(2000);
			
			//WebDriverWait  wait=new WebDriverWait(driver,20);
		
			WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			
			//wait.until(ExpectedConditions.visibilityOf(email));
			email.sendKeys("deepadeeps88@gmail.com");
			
			Thread.sleep(3000);
			WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			pass.sendKeys("1234567898");
			
			Thread.sleep(3000);
			WebElement day=driver.findElement(By.id("day"));
			Select s=new Select(day);
			s.selectByValue("15");
			
			WebElement month=driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByVisibleText("Dec");
			
			WebElement year=driver.findElement(By.id("year"));
			Select s2=new Select(year);
			s2.selectByValue("1988");
			Thread.sleep(3000);
			WebElement button=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
			button.click();
	
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


