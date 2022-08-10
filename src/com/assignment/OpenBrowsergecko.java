package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowsergecko {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://secure-sandbox.modulrfinance.com/");

		
		driver.manage().window().maximize(); //maximize the window
		
		Thread.sleep(3000);
		
	//driver.findElement(By.id("forgotPasswordHref")).click();
	
	driver.findElement(By.xpath("//*[@id='username-inp']")).sendKeys("etwuytewruewr");
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(7000);
		driver.quit();

	}

}
