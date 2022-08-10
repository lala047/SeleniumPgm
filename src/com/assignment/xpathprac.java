package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpathprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.boohoo.com/");

		// driver.manage().window().maximize();
		// driver.findElement(By.xpath("(//button[contains(text(),'Accept
		// all')])[1]")).click();

		// WebElement beauty=
		// driver.findElement(By.xpath("//a[@class='b-menu_bar-tab_content_link
		// m-has-submenu '][contains(text(),'Beauty')]"));
		// Actions actions = new Actions(driver);
		// actions.moveToElement(beauty).build().perform();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[text()='Invogue']")).click();
		// WebElement dress=
		// driver.findElement(By.xpath("//a[@data-tau='menu_item_level2_dresses']"));

		// Actions actions = new Actions(driver);
		// actions.moveToElement(dress).build().perform();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[text()='Black Dresses']")).click();
		// Thread.sleep(3000);

		// -----------------------------------------------------------------------
		driver.get("https://www.boohoo.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[contains(text(),'Accept all')])[1]")).click();
		WebElement dresses = driver.findElement(By.xpath("//a[@data-tau='menu_item_level2_dresses']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dresses).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='White Dresses']")).click();

		// Thread.sleep(3000);

//	driver.get("https://www.prettylittlething.com");
//	
//	driver.findElement(By.xpath("//button[text()='Accept All']")).click();
//	
//	Thread.sleep(3000);
//	WebElement  cloth=driver.findElement(By.xpath("(//a[text()='CLOTHING'])[3]"));
//	//WebElement  dress=driver.findElement(By.xpath("(//a[text()='DRESSES'])[3]"));  
//	Actions actions = new Actions(driver);
//	actions.moveToElement(cloth).build().perform();
		// driver.findElement(By.xpath("(//a[text()='Dresses'])[1]")).click();
		driver.quit();

	}
}