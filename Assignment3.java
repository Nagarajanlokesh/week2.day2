package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		//Grandparent to grandchild xpath 
		
		WebElement acmeEmail = driver.findElement(By.xpath("//div[@class='controls']/input"));
		acmeEmail.sendKeys("kumar.testleaf@gmail.com");
		
		WebElement acmePassword = driver.findElement(By.xpath("//div[@class='control-group form-group']//input"));
		acmePassword.sendKeys("leaf@12");
		
		driver.findElement(By.id("remember")).click();
		
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
		
		String acmeTitle = driver.getTitle();
		
		System.out.println(acmeTitle);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		
		

	}

}
