package com.sel.first;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demoqa.com/droppable"  );
	driver.manage().window().maximize();
	
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(4000);
	Actions act=new Actions(driver);
	act.dragAndDrop(source, dest).build().perform();
	//act.clickAndHold(source).pause(Duration.ofSeconds(20)).moveToElement(dest).pause(Duration.ofSeconds(20));
	
	}
	
	
}

