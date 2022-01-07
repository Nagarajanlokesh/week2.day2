package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		 
		 WebElement clickPhone = driver.findElement(By.linkText("Phone"));
		 clickPhone.click();
		 //9000009999
		 
		 WebElement searchPhoneNumber = driver.findElement(By.name("phoneNumber"));
		 searchPhoneNumber.sendKeys("9000009999");
		 
		
		WebElement findElementclick = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findElementclick.click();
			Thread.sleep(2000);
			
			// here i have saved the lead id 10122 by using string 
			// .getText() will return the string so saved in string 
			String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println(leadID);
			
			
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.className("subMenuButtonDangerous")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			WebElement leadId = driver.findElement(By.xpath("//input[@name='id']"));
			
			leadId.sendKeys("10122");
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			if (driver.findElement(By.className("x-paging-info")).isDisplayed()) {
				
				System.out.println("No records to display");
			}
				else {
					
					System.out.println("Record Displayed ");
				}
			driver.close();
			}
	
		

	}


