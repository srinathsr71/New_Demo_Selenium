package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demos {
WebDriver driver;

@Test
public void te() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	//driver.findElement(By.partialLinkText("Automation")).click();
	//driver.findElement(By.tagName("li")).click();
	Thread.sleep(5000);
	//driver.findElement(By.cssSelector("input#email")).sendKeys("srinath@gmail.com");
}
}
