import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		
		driver.manage().window().maximize(); //maximize the window
		
		Thread.sleep(10000);
		
	WebElement startingpoint =	driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	WebElement Targetpoint = driver.findElement(By.id("bank"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(startingpoint, Targetpoint).perform();

	}

}
