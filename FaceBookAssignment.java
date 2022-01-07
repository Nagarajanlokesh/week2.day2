package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		CreateNewAccount.click();
		
		// Parent child Xpath 
		
		WebElement fbinput = driver.findElement(By.name("firstname"));
		fbinput.sendKeys("lokesh");
		
		// elder to younger sibling 
		WebElement fbsurnamae = driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input"));
		fbsurnamae.sendKeys("Nagarajan");
		
		WebElement mobileNumber = driver.findElement(By.xpath("//div[contains(text(),'Mobile number ')]/following-sibling::input"));
		mobileNumber.sendKeys("9565955555");
		
		WebElement fbPassword = driver.findElement(By.id("password_step_input"));
		fbPassword.sendKeys("newAccount@2021");
		
		WebElement fbDate = driver.findElement(By.id("day"));
		Select date = new Select(fbDate);
		
		date.selectByIndex(16);
		
		WebElement fbMonth = driver.findElement(By.id("month"));
		Select month = new Select(fbMonth);
		month.selectByValue("5");
		
		WebElement fbYear = driver.findElement(By.id("year"));
		Select year = new Select(fbYear);
		year.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		
		
	}

}
