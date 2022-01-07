package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		 
		 // To maximize the window we use below code 
		 
		 driver.manage().window().maximize();
		 
		 WebElement uName = driver.findElement(By.xpath("//input[@id = 'username']"));
		 
		 uName.sendKeys("DemoSalesManager");
		 
		 driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		 
         driver.findElement(By.xpath("//input[contains(@class, 'decorative')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 
		 driver.findElement(By.linkText("Contacts")).click();
		 
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 
		 WebElement firstName = driver.findElement(By.id("firstNameField"));
		 firstName.sendKeys("lokesh");
		 
		 WebElement lastName = driver.findElement(By.id("lastNameField"));
		 lastName.sendKeys("Nagarajan");
		 
		 WebElement fNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		 fNameLocal.sendKeys("lokesh");
		 
		 WebElement lNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		 lNameLocal.sendKeys("Nagarajan");
		 
		 WebElement departmentName = driver.findElement(By.name("departmentName"));
		 departmentName.sendKeys("Assurance");
		 
		 WebElement descrip = driver.findElement(By.name("description"));
		 descrip.sendKeys("Enter Description Field Using any Locator of your choice");
		 
		 WebElement emailaddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		 emailaddress.sendKeys("lokesh@testleaf.com");
		 
		 WebElement stateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select generalstate = new Select(stateProvince);
		 generalstate.selectByVisibleText("New York");
		 
		 WebElement createContact = driver.findElement(By.className("smallSubmit"));
		 createContact.click();
		 
		 WebElement editbutton = driver.findElement(By.linkText("Edit"));
		 editbutton.click();
		 
		 //Thread.sleep(5000);
		 
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 
		 
		 WebElement importantnote = driver.findElement(By.id("updateContactForm_importantNote"));
		 importantnote.sendKeys("18th Step");
		 
		 driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		 
		 String verifyTitle = driver.getTitle();
		 System.out.println("The Output is " + verifyTitle);
		 
		 
		 

	}

}
