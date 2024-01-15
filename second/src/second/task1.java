package second;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']")).click();
//		Select se=new Select(driver.findElement(By.xpath("//*[@class='oxd-select-text-input']")));
//		se.selectByVisibleText("Admin");
		Actions action = new Actions(driver); 
		WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
		action.click(element).perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		driver.findElement(By.xpath("//*[@class='oxd-form-actions']/button[2]")).click();
		
//			  .keyDown(element,Keys.ARROW_DOWN)
//			  .click();
//		action.perform();
		//action.keyDown(element).click();
		
	}

}
