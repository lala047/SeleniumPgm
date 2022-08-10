import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
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
