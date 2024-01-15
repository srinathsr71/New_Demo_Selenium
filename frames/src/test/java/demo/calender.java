package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	
	public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;		
	
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leave")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='oxd-form-row']/div/div[1]//div[2]/div/div/i")));
		driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]//div[2]/div/div/i")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]//div[2]/div/div/input")).sendKeys("2022-03-22");
     
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
}














