package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverandPrintLink {
   
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");


System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); //Note that the chromedriver is located in the Drivers folder in the project

       
WebDriver driver = new ChromeDriver();
//WebDriverWait wait = new WebDriverWait(driver, 10);

		
		driver.get("https://amazon.com");

		
		driver.manage().window().maximize(); //maximize the window
		
		//Thread.sleep(3000);

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Thread.sleep(3000);
		WebElement accountlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(accountlist).perform();
		
		//TO GET THE FIRST ELEMENT IN THE LIST OF ITEMS DISPLAYED
		List<WebElement>li=driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));  // To identify the element of multiple elements, identify one of the elements and check the parent(which is common among all the elements in the list and take that of the parent
		
		System.out.println(li.size());   // This will print the size of the list
		
		for(int i = 0 ; i<li.size() ;i++)
		{
		System.out.println(li.get(i).getText()); //This will print the name of all the items in the list
		}
		

			
		 System.out.println(li.get(0).getText());  // This will print the name of the first item in the list
		 
		
		
	driver.close();
	
//	assignment
//	AMAZON.COM
//	Gaming Accesories
//	click on headset. go bac, click on keyboard, go back and also do same for the other 2 (use 4 loop. Take the common expert and put the for loop)
//	Stale element exception
	}

	}

