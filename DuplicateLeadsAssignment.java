package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadsAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			// ChromeDriver is Class here, driver is object 
			
			 ChromeDriver driver=new ChromeDriver();
			 
			 // To get the URL we use driver.get 
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 
			 // To maximize the window we use below code 
			 
			 driver.manage().window().maximize();
			 
			 
			 // To verify whether we launched correct page - we use driver.gettitle()
			 // Control+2, L is the shortcut to declare variable 
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			WebElement username =      driver.findElement(By.id("username"));
			 username.sendKeys("DemoSalesManager");
			 
			 WebElement password =      driver.findElement(By.id("password"));
			 password.sendKeys("crmsfa");
			 
			 WebElement clickButton =      driver.findElement(By.className("decorativeSubmit"));
			 clickButton.click();
			 
			 // CRM/SFA is a link text. Text will be in black colour 
			 
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
			 findLeads.click();
			 driver.findElement(By.linkText("Email")).click();
			 driver.findElement(By.name("emailAddress")).sendKeys("loki@testleaf.com");
			 driver.findElement(By.linkText("Find Leads")).click();
			 
			 Thread.sleep(2000);
			 
			 WebElement firstLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			 
			 String emailLeadId = firstLeadID.getText();
			 System.out.println(emailLeadId);
			 
			 firstLeadID.click();
			 
			 driver.findElement(By.linkText("Duplicate Lead")).click();
			 
			 if(driver.getTitle().contains("Duplicate Lead")) {
					System.out.println("We have the expected Title for Duplicate Lead.");
				}
				else {
					System.out.println("Wrong screen.");
				}
			 
			 driver.findElement(By.name("submitButton")).click();
			 
			 
			 String duplicatelead = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			 
			 
			 
			 if (firstLeadID.equals(duplicatelead)) {
				 System.out.println("Both orginal and duplicate lead name are same ");
				 
				
				}
			 
			 else {
					System.out.println("unique lead name is geneated for duplicate lead");
				
			}
			 
			 


	}

}
