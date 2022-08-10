import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.co.uk");

		
		driver.manage().window().maximize(); //maximize the window

		driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
		
		Thread.sleep(6000);
		
	WebElement dropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdown);
	
	List<WebElement> li  = sel.getOptions();
	
	System.out.println(li.size());
	
	for(int i = 0 ; i<li.size() ; i++)
	{

		li.get(i).click();     // This will click all the dropdowns
		System.out.println(li.get(i).getText());
		
	
	}
	
	driver.quit();
	}

}
