package com.sel.first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Test{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btn=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn.click();	
		Thread.sleep(3000);
		Alert Simple_Alert=driver.switchTo().alert();
		Simple_Alert.accept();
	
		WebElement btn1=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btn1.click();
		
		WebElement btn2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn2.click();
		Thread.sleep(3000);
		Alert Confirm_Alert=driver.switchTo().alert();
		Confirm_Alert.dismiss();
		
		WebElement btn3=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btn3.click();
		WebElement btn4=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btn4.click();
		
		Thread.sleep(3000);
		
		Alert Text_alert=driver.switchTo().alert();
		Text_alert.sendKeys("Welcome");
		Thread.sleep(3000);
		Text_alert.dismiss();
		
		
	
		
		
		
		
	}


}
