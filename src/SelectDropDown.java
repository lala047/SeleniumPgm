import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.co.uk");

		
		driver.manage().window().maximize(); //maximize the window
		
		Thread.sleep(6000);
		
	WebElement dropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdown);
	
	sel.selectByIndex(4);
	
	sel.selectByValue("search-alias=beauty");
	
	sel.selectByVisibleText("DIY & Tools");
	
	Thread.sleep(4000);
	driver.close();

	}

}
