package second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task33 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Select obj=new Select(driver.findElement(By.id("userSelect")));
//		obj.selectByValue("2");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[6]/a")).click();
//		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[4]")).click();
//		driver.findElement(By.linkText("Education")).click();
//		driver.findElement(By.xpath("//*[@class='oxd-table-body']/div/div/div[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='oxd-form-row'][3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div//label//span")).click();
		
	}

}
