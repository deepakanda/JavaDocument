package com.sel.first;

import java.awt.AWTException;
import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling 
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
	WebElement bstseller=driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	
	Actions act=new Actions(driver);
	act.contextClick(bstseller).build().perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement fashion=driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	act.contextClick(fashion).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement electronics=driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	act.contextClick(electronics).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement amazonPay=driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]"));
	act.contextClick(amazonPay).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	Set<String> handles=driver.getWindowHandles();
	System.out.println(handles);
	
	List<String> li=new ArrayList<String>();
	li.addAll(handles);
	Thread.sleep(2000);
	
	driver.switchTo().window(li.get(1));
	
	String currentTitle=driver.getTitle();
	System.out.println(currentTitle);
	
	
	
	
	
		
	}
}
