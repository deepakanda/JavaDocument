package com.sel.first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php/");
	Thread.sleep(2000);
	WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
	women.click();
	
	
	WebElement shirts=driver.findElement(By.xpath("/html"));
	shirts.click();
	
	Thread.sleep(2000);
	WebElement addtocart=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
	addtocart.click();
	Thread.sleep(3000);
	
	WebElement proceed=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
	proceed.click();
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	
	j.executeScript("window.scroll(0,300)","");
	
	WebElement proceed2pay=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
	proceed2pay.click();
	
	Thread.sleep(3000);
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("jai123@gmail.com");
	
	
	
	WebElement pass=driver.findElement(By.id("passwd"));
	pass.sendKeys("jaiyo2020");

	
	WebElement signin=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
	signin.click();
	
	WebElement address=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[3]/span"));
	address.click();
	
	WebElement proceed2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
	proceed2.click();
	
	
	
	WebElement shipping=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/ul/li[4]/span"));
	shipping.click();
	
	WebElement check=driver.findElement(By.id("cgv"));
	check.click();
	
	WebElement checkout1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
	checkout1.click();
	
	WebElement payment=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[5]/span"));
	payment.click();
	
	Thread.sleep(3000);
	
	WebElement paybycheck=driver.findElement(By.xpath("//a[@title='Pay by check.']"));
	paybycheck.click();
	
	
	WebElement confirm=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
	confirm.click();
	
	
	
}	
	
}

