package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		 
		 // To maximize the window we use below code 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 WebElement uName = driver.findElement(By.xpath("//input[@id = 'username']"));
		 
		 uName.sendKeys("DemoSalesManager");
		 
		 driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		 
         driver.findElement(By.xpath("//input[contains(@class, 'decorative')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 
		 WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		 findLeads.click();
		 
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lokesh");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		 
		 WebElement fnameleadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String getleadid = fnameleadid.getText();
		 System.out.println("getleadid");
		 
		 fnameleadid.click();
		 
		 
		 if (driver.getTitle().contains("View Lead")) {
			 
			 System.out.println("Page displayed correctly");
			
		}
		 
		 else {
			System.out.println("Wrong page displayed");
		}
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		 


	}

}
