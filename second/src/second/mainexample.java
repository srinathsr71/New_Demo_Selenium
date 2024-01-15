package second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mainexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//locators
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		driver.navigate().refresh();
		driver.findElement(By.id("name")).sendKeys("srinath");
		driver.findElement(By.id("phone")).sendKeys("9568346986");
		driver.findElement(By.id("email")).sendKeys("srina@gmail.com");
		driver.findElement(By.id("password")).sendKeys("srina");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select se=new Select(driver.findElement(By.xpath("//*[@class='custom-select']")));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			se.selectByVisibleText("Finland");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		driver.findElement(By.linkText("Nationalities")).click();
		driver.findElement(By.partialLinkText("Corporate")).click();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li/span/i")).click();
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li/a")).click();
		Actions action = new Actions(driver); 
		WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
		
		action.click(element).build().perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.xpath("//*[@class='form-check'][2]/label/input")).click();
		driver.findElement(By.xpath("//*[@class='form-check'][3]/label/input")).click();
		driver.findElement(By.xpath("//*[@class='form-check'][5]/label/input")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		driver.close();
		
		
		
		
		
		
		//List<WebElement> li=driver.findElements(By.xpath("oxd-table orangehrm-employee-list"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
