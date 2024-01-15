package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1test extends demoutil
{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;

	@BeforeTest
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement web1=driver.findElement(By.xpath("//*[@name='username']"));
		WebElement web2=driver.findElement(By.xpath("//*[@name='password']"));
		WebElement web=driver.findElement(By.xpath("//button[@type='submit']"));
		//demoutil.falshelement(web, driver);
		//demoutil.changeColor("#FF0000", web, driver);
		//demoutil.drawBorder(web, driver);
		
	}
	
}
