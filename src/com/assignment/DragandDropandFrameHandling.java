
package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropandFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		
		driver.manage().window().maximize(); 
		driver.switchTo().frame("gdpr-consent-notice");  //if the element you want to click (e.g 'Accept')is inside the frame, you use this to enter inside the frame to click it
	  Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
		driver.switchTo().defaultContent();   // you use this to leave the frame and return to the main page
		
	WebElement startingpoint =	driver.findElement(By.xpath("//a[text()=' BANK ']")); 
	WebElement Targetpoint = driver.findElement(By.id("bank"));   
	Actions act = new Actions(driver);
	act.dragAndDrop(startingpoint, Targetpoint).perform();
	

	WebElement startingpoint2 =	driver.findElement(By.xpath("//a[text()=' 5000 ']"));  
	WebElement Targetpoint2 = driver.findElement(By.id("amt7"));
	
	act.dragAndDrop(startingpoint2, Targetpoint2).perform();

	WebElement startingpoint3 =	driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement Targetpoint3 = driver.findElement(By.id("loan"));
	  
	act.dragAndDrop(startingpoint3, Targetpoint3).perform();

	
	WebElement startingpoint4 =	driver.findElement(By.id("fourth"));
	WebElement Targetpoint4 = driver.findElement(By.id("amt8"));
	
	act.dragAndDrop(startingpoint4, Targetpoint4).perform();

	driver.quit();
	}

}

