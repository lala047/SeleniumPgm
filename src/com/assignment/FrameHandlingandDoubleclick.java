
		package com.assignment;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

public class FrameHandlingandDoubleclick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize(); //maximize the window
		driver.switchTo().frame("gdpr-consent-notice"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
	    driver.switchTo().defaultContent();
	    WebElement doubleclickbutton=	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	    Actions act = new Actions(driver);

	    act.doubleClick(doubleclickbutton).perform();

		driver.close();
		
	
}


}
