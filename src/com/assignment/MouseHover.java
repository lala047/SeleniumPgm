package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement fashion= driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions action= new Actions(driver);
		action.moveToElement(fashion).perform();
		WebElement Western= driver.findElement(By.xpath("//a[text()='Women Western']"));
		Actions act= new Actions(driver);
		act.moveToElement(Western).build().perform();
		driver.findElement(By.xpath("//a[text()='Women Dresses']")).click();
		driver.quit();
		
		

}
}