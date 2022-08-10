import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickandAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		
		driver.manage().window().maximize(); //maximize the window
		
		Thread.sleep(5000);
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
		driver.switchTo().defaultContent();
	WebElement doubleclickbutton=	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
Actions act = new Actions(driver);

act.doubleClick(doubleclickbutton).perform();

Alert alrt = driver.switchTo().alert();
System.out.println(alrt.getText());


alrt.accept(); //it will click on ok button

//alrt.dismiss(); //click on cancel button
	
driver.quit();
	
	}

}
