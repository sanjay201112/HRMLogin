package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
		WebDriver driver;
	
	@Test (priority=1)
    void Openaap()
    {
    	  driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    			driver.manage().window().maximize();
    			
    			
    			
    }
	
	@Test (priority=2)
	
		void Testlogo() throws InterruptedException
		{
		
		Thread.sleep(3000);
		boolean Staus =driver.findElement((By.xpath("//img[@alt='company-branding']"))).isDisplayed();
		System.out.println("Logo is displayed"+ Staus);
		
		
			
		}
	
	   @Test (priority=3)
	    
	   void Testlogin()
	   
	   {
		   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		   
	   }
	   
	   @Test (priority=4)
	   void Closeapp()
	   {
		  System.out.println("login is successfull now closing the application");
		  driver.quit();
		  
	   }
	
	}

