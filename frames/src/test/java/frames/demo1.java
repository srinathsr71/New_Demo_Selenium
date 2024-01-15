package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public String url="https://demoqa.com/nestedframes";
	WebDriver driver;
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("frame1"))).switchTo().frame("iframe");
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
	}
}
