package com.assignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerthandling {
	
	
	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("34243");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	    Alert alrt =	driver.switchTo().alert();
	    System.out.println(alrt.getText());
	     alrt.accept();
	     System.out.println(alrt.getText());
	     alrt.accept();
	     driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("34243");
	     driver.findElement(By.xpath("//input[@name='submit']")).click();
	     alrt.dismiss();
		
	     driver.quit();
}
}