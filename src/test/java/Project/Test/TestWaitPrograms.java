package Project.Test;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestWaitPrograms {

	WebDriver driver;
	//ConfigReader cfgRead;
	
	@Test
	public void runImplicitWaitTest() {
		try {
			//cfgRead = new ConfigReader();
			//System.setProperty("webdriver.chrome.driver", cfgRead.readDriverFromConfig());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("WEbsite launched is: https://www.redbus.in/");
			driver.get("https://www.redbus.in/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("src")).sendKeys("Kalasipalyam, Bangalore");
			System.out.println("Search start at: "+new Date());
			
			driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
			
			System.out.println("Search ends at: "+new Date());
				
			driver.findElement(By.id("dest")).sendKeys("asde");
			System.out.println("Search start at: "+new Date());
			
			driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
			
			System.out.println("Search ends at: "+new Date());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			driver.quit();
		}
	}
}
