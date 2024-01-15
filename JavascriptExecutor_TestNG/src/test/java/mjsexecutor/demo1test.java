package mjsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1test extends demoutil
{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	//	String url="https://www.twoplugs.com/";
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
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		WebElement we=driver.findElement(By.xpath("//*[@name='username']"));
		WebElement we2=driver.findElement(By.xpath("//*[@name='password']"));
		WebElement web=driver.findElement(By.xpath("//*[@type='submit']"));
		//demoutil.falshelement(web, driver);
		//demoutil.changeColor("red", web, driver);
		//demoutil.drawBorder(web, driver);
//		demoutil.passingValuesUsingJS(web1, "Admin", driver);
//		Thread.sleep(5000);
//		demoutil.passingValuesUsingJS(web2, "admin123", driver);
//		demoutil.clickElementByJS(web, driver);
//		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		js.executeScript("document.getElementsByName('username')[0].value='Admin'");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
//		Thread.sleep(3000);
		//js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click()");
		//demoutil.passingValuesUsingJS(we,"Admin",driver);
		//Thread.sleep(5000);
		//demoutil.passingValuesUsingJS(we2,"admin123", driver);
		demoutil.clickElementByJS(web, driver);
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
}
